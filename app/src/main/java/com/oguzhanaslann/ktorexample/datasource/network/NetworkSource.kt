package com.oguzhanaslann.ktorexample.datasource.network

import com.oguzhanaslann.ktorexample.models.dto.UserResultDTO

interface NetworkSource {
     suspend fun getUsers(resultCount :Int ) : UserResultDTO
}