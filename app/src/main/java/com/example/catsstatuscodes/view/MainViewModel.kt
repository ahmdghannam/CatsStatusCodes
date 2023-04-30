package com.example.catsstatuscodes.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.catsstatuscodes.model.repository.Repository
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers

class MainViewModel : ViewModel() {
    private val repository = Repository()
    private val compositeDisposable = CompositeDisposable()

    private val _cat = MutableLiveData<String>()
    val cat: LiveData<String>
        get() = _cat

     val code = MutableLiveData("404")

    private val _toastMessage = MutableLiveData<String>()
    val toastMessage: LiveData<String>
        get() = _toastMessage


    private fun onSuccess(catPhotoLink:String){
        _cat.postValue(catPhotoLink)
    }
    private fun onFailure(throwable: Throwable){
        _toastMessage.postValue(throwable.message)
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}