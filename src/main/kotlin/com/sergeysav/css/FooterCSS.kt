package com.sergeysav.css

import kotlinx.css.Align
import kotlinx.css.BorderStyle
import kotlinx.css.Color
import kotlinx.css.CssBuilder
import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.FontWeight
import kotlinx.css.JustifyContent
import kotlinx.css.Position
import kotlinx.css.TextAlign
import kotlinx.css.alignItems
import kotlinx.css.backgroundColor
import kotlinx.css.color
import kotlinx.css.display
import kotlinx.css.em
import kotlinx.css.flexDirection
import kotlinx.css.fontSize
import kotlinx.css.fontWeight
import kotlinx.css.justifyContent
import kotlinx.css.margin
import kotlinx.css.padding
import kotlinx.css.pct
import kotlinx.css.position
import kotlinx.css.properties.TextDecoration
import kotlinx.css.properties.border
import kotlinx.css.px
import kotlinx.css.textAlign
import kotlinx.css.textDecoration
import kotlinx.css.width

fun CssBuilder.footer() {
    media("only screen and (min-width: 1000px)") {
        "footer" {
            padding(top = 25.px, horizontal = 17.5.pct, bottom = 35.px)
            display = Display.flex
            flexDirection = FlexDirection.row
            justifyContent = JustifyContent.flexStart
            alignItems = Align.flexStart
        }
        "footer .column" {
            width = 25.pct
        }
    }

    media("only screen and (max-width: 1000px)") {
        "footer" {
            padding(top = 25.px, horizontal = 5.pct, bottom = 35.px)
            display = Display.flex
            flexDirection = FlexDirection.row
            justifyContent = JustifyContent.flexStart
            alignItems = Align.flexStart
        }
        "footer .column" {
            width = 50.pct
        }
    }

    "footer" {
        color = Color.white
        textAlign = TextAlign.left
        backgroundColor = ColorConstants.DARK
        border(1.px, BorderStyle.solid, ColorConstants.DARK)
        fontWeight = FontWeight.normal
    }

    "footer h1" {
        fontSize = 4.em
        margin(0.px, null)
        position = Position.relative
    }

    "footer h2" {
        fontSize = 1.7.em
        margin(0.px, null)
        position = Position.relative
    }

    "footer h3" {
        fontSize = 1.0.em
        margin(0.px, null)
        position = Position.relative
    }

    "footer > .column" {
        display = Display.flex
        flexDirection = FlexDirection.column
        justifyContent = JustifyContent.flexStart
        alignItems = Align.flexStart
    }

    "footer a" {
        color = Color.white
        textDecoration = TextDecoration.none
    }
}
