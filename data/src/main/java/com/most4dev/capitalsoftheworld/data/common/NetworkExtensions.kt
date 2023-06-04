package com.most4dev.capitalsoftheworld.data.common

import com.most4dev.capitalsoftheworld.domain.common.CallErrors
import com.most4dev.capitalsoftheworld.domain.common.Result
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.retryWhen
import java.io.IOException

fun <T : Any> Flow<Result<T>>.applyCommonSideEffects() =
    retryWhen { cause, attempt ->
        when {
            (cause is IOException && attempt < Utils.MAX_RETRIES) -> {
                delay(Utils.getBackoffDelay(attempt))
                true
            }
            else -> {
                false
            }
        }
    }.onStart {
        emit(Result.Loading)
    }.catch {
        emit(Result.Error(CallErrors.ErrorException(it)))
    }