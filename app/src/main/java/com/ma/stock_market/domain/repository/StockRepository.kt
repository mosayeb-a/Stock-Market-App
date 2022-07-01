package com.ma.stock_market.domain.repository

import com.ma.stock_market.domain.model.CompanyInfo
import com.ma.stock_market.domain.model.CompanyListing
import com.ma.stock_market.domain.model.IntradayInfo
import com.ma.stock_market.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}