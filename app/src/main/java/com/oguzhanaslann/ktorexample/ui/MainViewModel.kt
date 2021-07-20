package com.oguzhanaslann.ktorexample.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oguzhanaslann.ktorexample.datasource.repository.RandomPersonRepository
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

private typealias PeopleList = List<Person>

class MainViewModel(
    private val randomPersonRepository: RandomPersonRepository
) : ViewModel() {

    private val _sharedFlow = MutableSharedFlow<PeopleList>(
        replay = 1,
        onBufferOverflow = BufferOverflow.SUSPEND
    )

    val peopleListFlow : SharedFlow<PeopleList> = _sharedFlow

    fun getRandomUsers(resultListCount : Int ) = viewModelScope.launch {
        _sharedFlow.emitAll(
            randomPersonRepository.getUsers(resultListCount)
        )

    }




}