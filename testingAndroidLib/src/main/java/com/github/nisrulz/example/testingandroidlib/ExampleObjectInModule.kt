package com.github.nisrulz.example.testingandroidlib

object ExampleObjectInModule {
    fun getExampleString() = "ExampleString"
}

fun String.appendExampleInModule() = "${this}ExampleInModule"
