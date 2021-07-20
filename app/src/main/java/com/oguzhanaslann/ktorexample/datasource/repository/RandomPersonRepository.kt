package com.oguzhanaslann.ktorexample.datasource.repository

import com.oguzhanaslann.ktorexample.datasource.network.NetworkSource
import com.oguzhanaslann.ktorexample.models.dto.Name
import com.oguzhanaslann.ktorexample.models.dto.Result
import com.oguzhanaslann.ktorexample.models.dto.UserResultDTO
import com.oguzhanaslann.ktorexample.ui.Person
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class RandomPersonRepository(
    private val randomUserApi: NetworkSource
) {

    fun getUsers(resultListCount: Int ): Flow<List<Person>> = flow {
        val userResultDTO: UserResultDTO = randomUserApi.getUsers(resultListCount)
        val peopleList = mutableListOf<Person>()
        userResultDTO.results?.forEach {
            peopleList.add(
                it.toPerson()
            )
        }
        emit(peopleList)
    }

    private fun Result.toPerson(): Person {
        return Person(
            id = this.id?.value ?: "",
            phoneNumber = this.phone ?: "",
            profilePhotoUrl = this.picture?.thumbnail ?: "",
            fullName = this.name?.getFullName() ?: ""
        )
    }

    private fun Name.getFullName(): String  {
        return "$first $last"
    }

}