package com.rayt.repository

sealed class RetrofitResponse<U, F, S> {
    data class Success<U, F, S>(val result: U) : RetrofitResponse<U, F, S>()
    data class Update<U, F, S>(val result: U) : RetrofitResponse<U, F, S>()
    data class Fail<U, F, S>(val result: U) : RetrofitResponse<U, F, S>()
}
