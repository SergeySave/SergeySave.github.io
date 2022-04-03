package com.sergeysav.css

import kotlinx.css.Align
import kotlinx.css.BorderStyle
import kotlinx.css.Color
import kotlinx.css.CssBuilder
import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.JustifyContent
import kotlinx.css.Position
import kotlinx.css.TextAlign
import kotlinx.css.alignItems
import kotlinx.css.backgroundColor
import kotlinx.css.color
import kotlinx.css.content
import kotlinx.css.display
import kotlinx.css.em
import kotlinx.css.flexDirection
import kotlinx.css.fontSize
import kotlinx.css.justifyContent
import kotlinx.css.left
import kotlinx.css.margin
import kotlinx.css.padding
import kotlinx.css.pct
import kotlinx.css.position
import kotlinx.css.properties.borderBottom
import kotlinx.css.px
import kotlinx.css.quoted
import kotlinx.css.textAlign
import kotlinx.css.top
import kotlinx.css.width

fun CssBuilder.headers() {
    media("only screen and (min-width: 1000px)") {
        "header" {
            padding(top = 80.px, horizontal = 17.5.pct, bottom = 25.px)
            display = Display.flex
            flexDirection = FlexDirection.row
            justifyContent = JustifyContent.center
            alignItems = Align.center
        }
        "header > .topbar" {
            padding(top = 1.em, horizontal = 17.5.pct, bottom = 0.px)
        }
    }

    media("only screen and (max-width: 1000px)") {
        "header" {
            padding(top = 70.px, horizontal = 5.pct, bottom = 10.px)
            display = Display.flex
            flexDirection = FlexDirection.column
            justifyContent = JustifyContent.center
            alignItems = Align.center
        }
        "header > .topbar" {
            padding(top = 0.5.em, horizontal = 5.pct, bottom = 0.px)
        }
    }

    "header" {
        color = Color.white
        textAlign = TextAlign.center
        backgroundColor = ColorConstants.DARK
    }

    "header h1" {
        fontSize = 4.em
        margin(0.px, null)
        position = Position.relative
    }

    "header h2" {
        fontSize = 1.7.em
        margin(0.px, null)
        position = Position.relative
    }

    "header h3" {
        fontSize = 1.0.em
        margin(0.px, null)
        position = Position.relative
    }

    "header h1.separator:after" {
        content = "".quoted
        width = 75.pct
        borderBottom(0.5.px, BorderStyle.solid, Color.white.changeAlpha(0.5))
        position = Position.absolute
        left = (12.5).pct
        top = 100.pct
    }
}