package com.minimaltools.commons.compose.extensions

import android.app.Activity
import android.content.Context
import com.minimaltools.commons.R
import com.minimaltools.commons.extensions.baseConfig
import com.minimaltools.commons.extensions.redirectToRateUs
import com.minimaltools.commons.extensions.toast
import com.minimaltools.commons.helpers.BaseConfig

val Context.config: BaseConfig get() = BaseConfig.newInstance(applicationContext)

fun Activity.rateStarsRedirectAndThankYou(stars: Int) {
    if (stars == 5) {
        redirectToRateUs()
    }
    toast(R.string.thank_you)
    baseConfig.wasAppRated = true
}
