package com.github.felipehjcosta.huchallenge.utils

import android.support.test.InstrumentationRegistry

fun readAsset(fileName: String) = InstrumentationRegistry.getContext()
        .assets
        .open(fileName)
        .bufferedReader()
        .use { it.readText() }