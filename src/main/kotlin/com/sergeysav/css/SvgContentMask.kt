package com.sergeysav.css

import kotlinx.css.CssBuilder

fun CssBuilder.setSvg(svg: String) {
    val url = "url('data:image/svg+xml;utf8,$svg')"
    put("content", "''")
    put("-webkit-mask", url)
    put("mask", url)
    put("-webkit-mask-size", "cover")
    put("mask-size", "cover")
}