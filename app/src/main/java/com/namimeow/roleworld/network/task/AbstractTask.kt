package com.namimeow.roleworld.network.task

import com.namimeow.roleworld.network.data.AbstractResponse

abstract class AbstractTask {
    abstract var callback: (AbstractResponse) -> Unit

    @Throws(Exception::class)
    abstract fun task()
}