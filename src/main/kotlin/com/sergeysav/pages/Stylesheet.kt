package com.sergeysav.pages

import com.sergeysav.css.ColorConstants
import com.sergeysav.css.dropdown
import com.sergeysav.css.footer
import com.sergeysav.css.headers
import com.sergeysav.css.icons
import com.sergeysav.css.main
import com.sergeysav.css.topbar
import com.sergeysav.websitegenerator.BaseResource
import com.sergeysav.websitegenerator.Environment
import kotlinx.css.Color
import kotlinx.css.Display
import kotlinx.css.FontWeight
import kotlinx.css.TextAlign
import kotlinx.css.backgroundColor
import kotlinx.css.borderRadius
import kotlinx.css.color
import kotlinx.css.display
import kotlinx.css.em
import kotlinx.css.fontFamily
import kotlinx.css.fontSize
import kotlinx.css.fontWeight
import kotlinx.css.lineHeight
import kotlinx.css.margin
import kotlinx.css.padding
import kotlinx.css.properties.LineHeight
import kotlinx.css.properties.TextDecoration
import kotlinx.css.px
import kotlinx.css.textAlign
import kotlinx.css.textDecoration

object Stylesheet : BaseResource("/style.css") {

    override fun Environment.install() = outputCSS {
        headers()
        main()
        topbar()

        "body" {
            padding = "0"
            margin = "0"
            fontFamily = "Lato,'Helvetica Neue',Arial,Helvetica,sans-serif; !important"
            fontSize = 16.px
            lineHeight = LineHeight("1.5")
            backgroundColor = ColorConstants.DARK
        }

        "h1, h2, h3, h4, h5, h6" {
            fontWeight = FontWeight.normal
            margin(0.67.em, 0.px)
        }

        "main h1, h2, h3" {
            fontWeight = FontWeight.bold
        }

        "p.indent" {
            put("text-indent", "2.0em")
        }

        "p.justify" {
            textAlign = TextAlign.justify
        }

        "span.bold" {
            fontWeight = FontWeight.bold
        }

        "a.blue.button" {
            display = Display.block
            backgroundColor = ColorConstants.BLUE
            color = Color.white
            borderRadius = 0.5.em
            textDecoration = TextDecoration.none
            padding(0.5.em, 1.25.em)
        }

        dropdown()
        icons()
        footer()
    }
}
