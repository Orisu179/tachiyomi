package tachiyomi.core.provider

import android.content.Context
import android.os.Environment
import androidx.core.net.toUri
import eu.kanade.tachiyomi.core.R
import java.io.File

class AndroidImageFolderProvider(
    val context: Context
) : FolderProvider {
    override fun directory(): File {
        val appName = context.getString(R.string.app_name)
        return File(
            Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).absolutePath + File.separator,
            appName,
        )
    }

    override fun path(): String {
        return directory().toUri().toString()
    }

}
