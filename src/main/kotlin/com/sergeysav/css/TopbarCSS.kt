package com.sergeysav.css

import kotlinx.css.Align
import kotlinx.css.BorderStyle
import kotlinx.css.BoxSizing
import kotlinx.css.Color
import kotlinx.css.CssBuilder
import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.FontWeight
import kotlinx.css.JustifyContent
import kotlinx.css.Position
import kotlinx.css.alignItems
import kotlinx.css.backgroundColor
import kotlinx.css.boxSizing
import kotlinx.css.color
import kotlinx.css.display
import kotlinx.css.em
import kotlinx.css.flexDirection
import kotlinx.css.fontWeight
import kotlinx.css.height
import kotlinx.css.justifyContent
import kotlinx.css.left
import kotlinx.css.padding
import kotlinx.css.pct
import kotlinx.css.position
import kotlinx.css.properties.TextDecoration
import kotlinx.css.properties.borderBottom
import kotlinx.css.properties.borderLeft
import kotlinx.css.properties.borderRight
import kotlinx.css.properties.boxShadow
import kotlinx.css.px
import kotlinx.css.textDecoration
import kotlinx.css.top
import kotlinx.css.width
import kotlinx.css.zIndex

fun CssBuilder.topbar() {
    media("only screen and (min-width: 1000px)") {
        "header > .topbar" {
            padding(top = 1.em, horizontal = 17.5.pct, bottom = 0.px)
        }
    }

    media("only screen and (max-width: 1000px)") {
        "header > .topbar" {
            padding(top = 0.5.em, horizontal = 5.pct, bottom = 0.px)
        }
    }

    ".topbar" {
        top = 0.px
        left = 0.px
        width = 100.pct
        display = Display.flex
        flexDirection = FlexDirection.row
        justifyContent = JustifyContent.left
        alignItems = Align.center
        height = 2.6.em
        zIndex = 100
        boxSizing = BoxSizing.borderBox
    }

    "header > .topbar" {
        position = Position.absolute
        color = Color.white
    }

    "header > .topbar > *" {
        padding(0.px, 1.em)
        height = 100.pct
        display = Display.flex
        flexDirection = FlexDirection.row
        justifyContent = JustifyContent.left
        alignItems = Align.center
        color = Color.white
        textDecoration = TextDecoration.none
    }

    "header > .topbar > .current" {
        borderBottom(2.px, BorderStyle.solid, Color.white)
    }

    "main > .topbar" {
        position = Position.fixed
        color = Color.black
        backgroundColor = Color.white
        boxShadow(ColorConstants.DARK.changeAlpha(0.15), 0.px, 2.px, 2.px, 0.px)
    }

    "main > .topbar > *:first-child" {
        borderLeft(1.px, BorderStyle.solid, ColorConstants.DARK_GRAY.changeAlpha(0.15))
    }

    "main > .topbar > *" {
        borderRight(1.px, BorderStyle.solid, ColorConstants.DARK_GRAY.changeAlpha(0.15))
        padding(0.px, 1.em)
        height = 100.pct
        display = Display.flex
        flexDirection = FlexDirection.row
        justifyContent = JustifyContent.left
        alignItems = Align.center
        color = Color.black
        textDecoration = TextDecoration.none
    }

    "main > .topbar > .current" {
        fontWeight = FontWeight.bold
    }

    ".dropdown > .menu" {
        zIndex = 100
    }
}