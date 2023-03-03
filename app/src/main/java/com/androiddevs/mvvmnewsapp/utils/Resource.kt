package com.androiddevs.mvvmnewsapp.utils
/*
* This class is recommended by Google to wrap around our network responses
* This will be a generic class
* Help us to handle loading states
* */

sealed class Resource<T>(
    val data :T ?=null,
    val message:String?=null
){
    class Success<T>(data: T):Resource<T>(data)
    class Error<T>(message: String?,data: T?=null):Resource<T>(data,message)
    class Loading<T>:Resource<T>()
}