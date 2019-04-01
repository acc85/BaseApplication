package com.rayt.repository.datasources

sealed class DatasourceResponseResponse<U, F, S> {
    data class Success<U, F, S>(val result: U) : DatasourceResponseResponse<U, F, S>()
    data class Update<U, F, S>(val result: U) : DatasourceResponseResponse<U, F, S>()
    data class Fail<U, F, S>(val result: U) : DatasourceResponseResponse<U, F, S>()
}
