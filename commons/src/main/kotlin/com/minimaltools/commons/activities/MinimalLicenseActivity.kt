package com.minimaltools.commons.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import com.minimaltools.commons.R
import com.minimaltools.commons.compose.extensions.enableEdgeToEdgeSimple
import com.minimaltools.commons.compose.screens.LicenseScreen
import com.minimaltools.commons.compose.theme.AppThemeSurface
import com.minimaltools.commons.extensions.launchViewIntent
import com.minimaltools.commons.helpers.*
import com.minimaltools.commons.models.CustomLicense
import kotlinx.collections.immutable.toImmutableList

class MinimalLicenseActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdgeSimple()
        setContent {
            val licenseMask = remember { intent.getLongExtra(APP_LICENSES, 0) or LICENSE_KOTLIN }
            val thirdPartyLicenses by remember { derivedStateOf { initLicenses().filter { licenseMask and it.id != 0L }.toImmutableList() } }
            AppThemeSurface {
                LicenseScreen(
                    goBack = ::finish,
                    thirdPartyLicens = thirdPartyLicenses,
                    onLicenseClick = ::launchViewIntent
                )
            }
        }
    }

    private fun initLicenses() = listOf(
        CustomLicense(LICENSE_KOTLIN, R.string.kotlin_title, R.string.kotlin_text, R.string.kotlin_url),
        CustomLicense(
            LICENSE_SUBSAMPLING,
            R.string.subsampling_title,
            R.string.subsampling_text,
            R.string.subsampling_url
        ),
        CustomLicense(LICENSE_GLIDE, R.string.glide_title, R.string.glide_text, R.string.glide_url),
        CustomLicense(LICENSE_CROPPER, R.string.cropper_title, R.string.cropper_text, R.string.cropper_url),
        CustomLicense(
            LICENSE_RTL,
            R.string.rtl_viewpager_title,
            R.string.rtl_viewpager_text,
            R.string.rtl_viewpager_url
        ),
        CustomLicense(LICENSE_JODA, R.string.joda_title, R.string.joda_text, R.string.joda_url),
        CustomLicense(LICENSE_STETHO, R.string.stetho_title, R.string.stetho_text, R.string.stetho_url),
        CustomLicense(LICENSE_OTTO, R.string.otto_title, R.string.otto_text, R.string.otto_url),
        CustomLicense(
            LICENSE_PHOTOVIEW,
            R.string.photoview_title,
            R.string.photoview_text,
            R.string.photoview_url
        ),
        CustomLicense(LICENSE_PICASSO, R.string.picasso_title, R.string.picasso_text, R.string.picasso_url),
        CustomLicense(LICENSE_PATTERN, R.string.pattern_title, R.string.pattern_text, R.string.pattern_url),
        CustomLicense(LICENSE_REPRINT, R.string.reprint_title, R.string.reprint_text, R.string.reprint_url),
        CustomLicense(
            LICENSE_GIF_DRAWABLE,
            R.string.gif_drawable_title,
            R.string.gif_drawable_text,
            R.string.gif_drawable_url
        ),
        CustomLicense(
            LICENSE_AUTOFITTEXTVIEW,
            R.string.autofittextview_title,
            R.string.autofittextview_text,
            R.string.autofittextview_url
        ),
        CustomLicense(
            LICENSE_ROBOLECTRIC,
            R.string.robolectric_title,
            R.string.robolectric_text,
            R.string.robolectric_url
        ),
        CustomLicense(
            LICENSE_ESPRESSO,
            R.string.espresso_title,
            R.string.espresso_text,
            R.string.espresso_url
        ),
        CustomLicense(LICENSE_GSON, R.string.gson_title, R.string.gson_text, R.string.gson_url),
        CustomLicense(
            LICENSE_LEAK_CANARY,
            R.string.leak_canary_title,
            R.string.leakcanary_text,
            R.string.leakcanary_url
        ),
        CustomLicense(
            LICENSE_NUMBER_PICKER,
            R.string.number_picker_title,
            R.string.number_picker_text,
            R.string.number_picker_url
        ),
        CustomLicense(
            LICENSE_EXOPLAYER,
            R.string.exoplayer_title,
            R.string.exoplayer_text,
            R.string.exoplayer_url
        ),
        CustomLicense(
            LICENSE_PANORAMA_VIEW,
            R.string.panorama_view_title,
            R.string.panorama_view_text,
            R.string.panorama_view_url
        ),
        CustomLicense(
            LICENSE_SANSELAN,
            R.string.sanselan_title,
            R.string.sanselan_text,
            R.string.sanselan_url
        ),
        CustomLicense(LICENSE_FILTERS, R.string.filters_title, R.string.filters_text, R.string.filters_url),
        CustomLicense(
            LICENSE_GESTURE_VIEWS,
            R.string.gesture_views_title,
            R.string.gesture_views_text,
            R.string.gesture_views_url
        ),
        CustomLicense(
            LICENSE_INDICATOR_FAST_SCROLL,
            R.string.indicator_fast_scroll_title,
            R.string.indicator_fast_scroll_text,
            R.string.indicator_fast_scroll_url
        ),
        CustomLicense(
            LICENSE_EVENT_BUS,
            R.string.event_bus_title,
            R.string.event_bus_text,
            R.string.event_bus_url
        ),
        CustomLicense(
            LICENSE_AUDIO_RECORD_VIEW,
            R.string.audio_record_view_title,
            R.string.audio_record_view_text,
            R.string.audio_record_view_url
        ),
        CustomLicense(LICENSE_SMS_MMS, R.string.sms_mms_title, R.string.sms_mms_text, R.string.sms_mms_url),
        CustomLicense(LICENSE_APNG, R.string.apng_title, R.string.apng_text, R.string.apng_url),
        CustomLicense(
            LICENSE_PDF_VIEW_PAGER,
            R.string.pdf_view_pager_title,
            R.string.pdf_view_pager_text,
            R.string.pdf_view_pager_url
        ),
        CustomLicense(
            LICENSE_M3U_PARSER,
            R.string.m3u_parser_title,
            R.string.m3u_parser_text,
            R.string.m3u_parser_url
        ),
        CustomLicense(
            LICENSE_ANDROID_LAME,
            R.string.android_lame_title,
            R.string.android_lame_text,
            R.string.android_lame_url
        ),
        CustomLicense(
            LICENSE_PDF_VIEWER,
            R.string.pdf_viewer_title,
            R.string.pdf_viewer_text,
            R.string.pdf_viewer_url
        ),
        CustomLicense(LICENSE_ZIP4J, R.string.zip4j_title, R.string.zip4j_text, R.string.zip4j_url)
    )
}
