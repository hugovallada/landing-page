package com.github.hugovallada.sections

import androidx.compose.runtime.Composable
import com.github.hugovallada.util.Constants.SECTION_WIDTH
import com.github.hugovallada.util.Res.Image.background
import com.varabyte.kobweb.compose.css.ObjectFit.Companion.Cover
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment.TopCenter
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.silk.components.graphics.Image
import org.jetbrains.compose.web.css.px


@Composable
fun MainSection() {
    Box(
        modifier = Modifier.maxWidth(SECTION_WIDTH.px),
        contentAlignment = TopCenter
    ) {
        MainBackground()
    }
}

@Composable
fun MainBackground() {
    Image(
        modifier = Modifier.fillMaxSize().objectFit(Cover),
        src = background,
        desc = "Background Image"
    )
}