package com.sergeysav.css

import kotlinx.css.CssValue

class SvgAsUrlValue(svgText: String) : CssValue("url('data:image/svg+xml;utf8,$svgText')")
