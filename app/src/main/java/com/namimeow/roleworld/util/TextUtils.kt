package com.namimeow.roleworld.util

import kotlin.text.iterator

fun printCharactersWithDelay(text: String, delay: Long, printFunction: (String) -> Unit) {
    var showedText = ""

    Thread {
        for (element in text) {
            showedText += element

            printFunction(showedText)

            Thread.sleep(delay)
        }
    }.start()
}