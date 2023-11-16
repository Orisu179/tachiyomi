package tachiyomi.core.provider

import androidx.core.net.toUri
import java.io.File

interface FolderProvider {

    fun directory(): File

    fun path(): String {
        return directory().toUri().toString()
    }
}
