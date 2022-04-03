package com.sergeysav.css

import kotlinx.css.BoxSizing
import kotlinx.css.Color
import kotlinx.css.CssBuilder
import kotlinx.css.Cursor
import kotlinx.css.Display
import kotlinx.css.FontWeight
import kotlinx.css.Overflow
import kotlinx.css.Position
import kotlinx.css.TextAlign
import kotlinx.css.TextOverflow
import kotlinx.css.backgroundColor
import kotlinx.css.borderBottomLeftRadius
import kotlinx.css.borderBottomRightRadius
import kotlinx.css.borderRadius
import kotlinx.css.borderTopLeftRadius
import kotlinx.css.borderTopRightRadius
import kotlinx.css.boxSizing
import kotlinx.css.color
import kotlinx.css.cursor
import kotlinx.css.display
import kotlinx.css.em
import kotlinx.css.fontWeight
import kotlinx.css.left
import kotlinx.css.maxWidth
import kotlinx.css.overflow
import kotlinx.css.padding
import kotlinx.css.pct
import kotlinx.css.position
import kotlinx.css.properties.TextDecoration
import kotlinx.css.properties.boxShadow
import kotlinx.css.properties.transform
import kotlinx.css.properties.translate
import kotlinx.css.px
import kotlinx.css.textAlign
import kotlinx.css.textDecoration
import kotlinx.css.textOverflow
import kotlinx.css.top
import kotlinx.css.vw
import kotlinx.css.width

fun CssBuilder.dropdown() {
    "div.dropdown" {
        cursor = Cursor.pointer
    }

    "div.dropdown > div.menu" {
        position = Position.absolute
        top = 100.pct
        display = Display.block
        backgroundColor = Color.white
        maxWidth = 60.vw
    }

    "div.dropdown > div.menu.right" {
        position = Position.absolute
        top = 0.pct
        left = 100.pct
        display = Display.block
        backgroundColor = Color.white
        maxWidth = 60.vw
        borderRadius = 0.5.em
    }

    "header div.dropdown > div.menu" {
        borderRadius = 0.5.em
        transform {
            translate((-1).em, 0.25.em)
        }
        boxShadow(ColorConstants.DARK.changeAlpha(0.15), 0.px, 0.px, 2.px, 0.px)
    }

    "main div.dropdown > div.menu" {
        borderTopLeftRadius = 0.px
        borderTopRightRadius = 0.px
        borderBottomLeftRadius = 0.5.em
        borderBottomRightRadius = 0.5.em
        transform {
            translate((-1).em, (-0.2).px)
        }
        boxShadow(ColorConstants.DARK.changeAlpha(0.15), 0.px, 2.px, 2.px, 0.px)
    }

    "div.dropdown > div.menu > *:hover" {
        backgroundColor = Color.black.changeAlpha(0.05)
    }

    "div.dropdown > div.menu > .current" {
        fontWeight = FontWeight.bold
    }

    "div.dropdown > div.menu > .active" {
        fontWeight = FontWeight.bold
    }

    "div.dropdown > div.menu > *" {
        display = Display.block
        overflow = Overflow.hidden
        textOverflow = TextOverflow.ellipsis
        color = Color.black
        width = 100.pct
        padding(0.5.em, 1.em)
        textAlign = TextAlign.left
        textDecoration = TextDecoration.none
        fontWeight = FontWeight.normal
        boxSizing = BoxSizing.borderBox
    }

    "div.dropdown.hover > div.menu" {
        display = Display.none
    }
    "div.dropdown.hover:hover > div.menu" {
        display = Display.block
    }
}