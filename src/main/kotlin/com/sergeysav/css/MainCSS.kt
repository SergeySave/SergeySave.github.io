package com.sergeysav.css

import kotlinx.css.Align
import kotlinx.css.BorderStyle
import kotlinx.css.BoxSizing
import kotlinx.css.Color
import kotlinx.css.CssBuilder
import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.Float
import kotlinx.css.FontWeight
import kotlinx.css.JustifyContent
import kotlinx.css.LinearDimension
import kotlinx.css.Position
import kotlinx.css.TextAlign
import kotlinx.css.alignItems
import kotlinx.css.alignSelf
import kotlinx.css.backgroundColor
import kotlinx.css.border
import kotlinx.css.borderRadius
import kotlinx.css.borderStyle
import kotlinx.css.borderWidth
import kotlinx.css.boxSizing
import kotlinx.css.col
import kotlinx.css.color
import kotlinx.css.content
import kotlinx.css.display
import kotlinx.css.em
import kotlinx.css.flexDirection
import kotlinx.css.float
import kotlinx.css.fontFamily
import kotlinx.css.fontSize
import kotlinx.css.fontWeight
import kotlinx.css.gap
import kotlinx.css.height
import kotlinx.css.justifyContent
import kotlinx.css.left
import kotlinx.css.marginLeft
import kotlinx.css.marginRight
import kotlinx.css.minHeight
import kotlinx.css.opacity
import kotlinx.css.padding
import kotlinx.css.pct
import kotlinx.css.position
import kotlinx.css.properties.TextDecoration
import kotlinx.css.properties.Transitions
import kotlinx.css.properties.border
import kotlinx.css.properties.borderBottom
import kotlinx.css.properties.s
import kotlinx.css.properties.transition
import kotlinx.css.px
import kotlinx.css.quoted
import kotlinx.css.textAlign
import kotlinx.css.textDecoration
import kotlinx.css.top
import kotlinx.css.transition
import kotlinx.css.width

fun CssBuilder.main() {
    media("only screen and (min-width: 1000px)") {
        "main" {
            padding(top = 30.px, horizontal = 17.5.pct, bottom = 25.px)
            display = Display.flex
            flexDirection = FlexDirection.column
            justifyContent = JustifyContent.left
            alignItems = Align.flexStart
        }
        "main > .topbar" {
            padding(vertical = null, horizontal = 17.5.pct)
        }
    }

    media("only screen and (max-width: 1000px)") {
        "main" {
            padding(top = 50.px, horizontal = 5.pct, bottom = 10.px)
            display = Display.flex
            flexDirection = FlexDirection.column
            justifyContent = JustifyContent.left
            alignItems = Align.flexStart
        }
        "main > .topbar" {
            padding(vertical = null, horizontal = 5.pct)
        }
    }

    "main" {
        color = Color.black
        gap = 0.px
        backgroundColor = Color.white
    }

    "main div.column" {
        width = 100.pct
        display = Display.flex
        flexDirection = FlexDirection.column
        justifyContent = JustifyContent.left
        alignItems = Align.flexStart
    }

    "main div.contents.column" {
        width = 100.pct
        display = Display.block
    }

    "main div > .project" {
        width = 100.pct
        padding(1.em, null)
        display = Display.block
        textDecoration = TextDecoration.none
        color = ColorConstants.DARK
        position = Position.relative
    }

    "main div > .project:not(:last-child):after" {
        content = "".quoted
        width = 100.pct
        borderBottom(0.5.px, BorderStyle.solid, Color.black.changeAlpha(0.5))
        position = Position.absolute
        left = (0).pct
        top = 100.pct
    }

    media("only screen and (max-width: 800px)") {
        "main div > .project > .item" {
            width = 50.pct
        }
    }
    media("only screen and (min-width: 800px) and (max-width: 1500px)") {
        "main div > .project > .item" {
            width = 33.pct
        }
    }
    media("only screen and (min-width: 1500px)") {
        "main div > .project > .item" {
            width = 25.pct
        }
    }


    "main div > .project > .item" {
        float = Float.left
        marginRight = 1.em
    }

    "main div > .project > h2" {
        fontWeight = FontWeight.bold
        color = Color.black
    }

    ".right.float" {
        float = Float.right
        marginLeft = 1.em
    }

    media("only screen and (max-width: 600px)") {
        "div.image" {
            width = 100.pct
        }
    }
    media("only screen and (min-width: 600px) and (max-width: 800px)") {
        "div.image" {
            width = 75.pct
        }
    }
    media("only screen and (min-width: 800px) and (max-width: 1500px)") {
        "div.image" {
            width = 50.pct
        }
    }
    media("only screen and (min-width: 1500px)") {
        "div.image" {
            width = 33.pct
        }
    }
    "img" {
        width = 100.pct
    }

    ".tooltipContainer" {
        position = Position.relative
    }

    ".tooltip" {
        display = Display.block
        position = Position.absolute
        color = Color.black
        backgroundColor = Color.white
        border(1.px, BorderStyle.solid, Color.black, 0.5.em)
        width = 100.pct
        padding(0.5.em)
        boxSizing = BoxSizing.borderBox
        transition(property = "opacity", duration = 0.3.s)
        opacity = 0
    }

    ".tooltip.full" {
        height = 100.pct
        borderWidth = 0.px
        borderStyle = BorderStyle.none
        borderRadius = 0.px
        backgroundColor = Color.white.changeAlpha(0.75)
        display = Display.flex
        justifyContent = JustifyContent.center
        alignItems = Align.center
        textAlign = TextAlign.center
        fontWeight = FontWeight.bold
    }

    ".tooltip.dark.full" {
        backgroundColor = Color.black.changeAlpha(0.75)
        color = Color.white
    }

    "*:hover > .tooltip" {
        opacity = 1
    }

    ".tooltip.top.right" {
        top = (-100).pct
        left = 0.px
    }

    ".tooltip.full" {
        top = 0.px
        left = 0.px
    }

    "a" {
        color = ColorConstants.BLUE
        textDecoration = TextDecoration.none
    }

    "button.a" {
        border(0.px, BorderStyle.none, Color.transparent)
        backgroundColor = Color.transparent
        fontSize = LinearDimension.inherit
    }
}