package com.example.examen.ViewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel(){

    var password = MutableLiveData<String>()

    fun setPassword(passwordobt:String){
        password.value = passwordobt
    }

    fun getPassword(){
        
    }

}