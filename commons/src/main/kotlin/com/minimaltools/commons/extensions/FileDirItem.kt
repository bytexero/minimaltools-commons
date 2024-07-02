package com.minimaltools.commons.extensions

import android.content.Context
import com.minimaltools.commons.models.FileDirItem

fun FileDirItem.isRecycleBinPath(context: Context): Boolean {
    return path.startsWith(context.recycleBinPath)
}
