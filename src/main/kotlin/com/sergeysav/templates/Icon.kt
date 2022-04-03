package com.sergeysav.templates

import com.sergeysav.css.inlineStyle
import kotlinx.css.Color
import kotlinx.css.CssBuilder
import kotlinx.css.color
import kotlinx.html.FlowOrPhrasingContent
import kotlinx.html.HtmlTagMarker
import kotlinx.html.i

@HtmlTagMarker
inline fun FlowOrPhrasingContent.icon(type: String, color: Color = Color.currentColor, crossinline style: CssBuilder.()->Unit = {}) = i("icon $type") {
    this.inlineStyle {
        this.color = color
        style()
    }
}