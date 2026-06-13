package com.namimeow.roleworld.util

import org.json.JSONObject

fun json(vararg pairs: Pair<String, Any> = emptyArray()): JSONObject {
    val json = JSONObject()

    for (pair in pairs) {
        json.put(pair.first, pair.second)
    }

    return json
}