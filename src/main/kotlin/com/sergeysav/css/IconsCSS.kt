package com.sergeysav.css

import kotlinx.css.Color
import kotlinx.css.CssBuilder
import kotlinx.css.Display
import kotlinx.css.FontStyle
import kotlinx.css.FontWeight
import kotlinx.css.backgroundColor
import kotlinx.css.display
import kotlinx.css.em
import kotlinx.css.fontStyle
import kotlinx.css.fontWeight
import kotlinx.css.height
import kotlinx.css.properties.TextDecoration
import kotlinx.css.textDecoration
import kotlinx.css.width

fun CssBuilder.icons() {
    "i.icon" {
        fontWeight = FontWeight.normal
        textDecoration = TextDecoration.none
        fontStyle = FontStyle.normal
    }

    "i.icon:after" {
        backgroundColor = Color.currentColor
        display = Display.inlineBlock
        height = 1.em
        width = 1.em
    }

    "i.icon.github:after" {
        setSvg("""<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1024 1024"><path fill-rule="evenodd" clip-rule="evenodd" d="M8 0C3.58 0 0 3.58 0 8C0 11.54 2.29 14.53 5.47 15.59C5.87 15.66 6.02 15.42 6.02 15.21C6.02 15.02 6.01 14.39 6.01 13.72C4 14.09 3.48 13.23 3.32 12.78C3.23 12.55 2.84 11.84 2.5 11.65C2.22 11.5 1.82 11.13 2.49 11.12C3.12 11.11 3.57 11.7 3.72 11.94C4.44 13.15 5.59 12.81 6.05 12.6C6.12 12.08 6.33 11.73 6.56 11.53C4.78 11.33 2.92 10.64 2.92 7.58C2.92 6.71 3.23 5.99 3.74 5.43C3.66 5.23 3.38 4.41 3.82 3.31C3.82 3.31 4.49 3.1 6.02 4.13C6.66 3.95 7.34 3.86 8.02 3.86C8.7 3.86 9.38 3.95 10.02 4.13C11.55 3.09 12.22 3.31 12.22 3.31C12.66 4.41 12.38 5.23 12.3 5.43C12.81 5.99 13.12 6.7 13.12 7.58C13.12 10.65 11.25 11.33 9.47 11.53C9.76 11.78 10.01 12.26 10.01 13.01C10.01 14.08 10 14.94 10 15.21C10 15.42 10.15 15.67 10.55 15.59C13.71 14.53 16 11.53 16 8C16 3.58 12.42 0 8 0Z" transform="scale(64)"/></svg>""")
    }

    "i.icon.email:after" {
        setSvg("""<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 -256 1850 1850"><g transform="matrix(1,0,0,-1,37.966102,1282.678)"><path d="m 1664,32 v 768 q -32,-36 -69,-66 -268,-206 -426,-338 -51,-43 -83,-67 -32,-24 -86.5,-48.5 Q 945,256 897,256 h -1 -1 Q 847,256 792.5,280.5 738,305 706,329 674,353 623,396 465,528 197,734 160,764 128,800 V 32 Q 128,19 137.5,9.5 147,0 160,0 h 1472 q 13,0 22.5,9.5 9.5,9.5 9.5,22.5 z m 0,1051 v 11 13.5 q 0,0 -0.5,13 -0.5,13 -3,12.5 -2.5,-0.5 -5.5,9 -3,9.5 -9,7.5 -6,-2 -14,2.5 H 160 q -13,0 -22.5,-9.5 Q 128,1133 128,1120 128,952 275,836 468,684 676,519 682,514 711,489.5 740,465 757,452 774,439 801.5,420.5 829,402 852,393 q 23,-9 43,-9 h 1 1 q 20,0 43,9 23,9 50.5,27.5 27.5,18.5 44.5,31.5 17,13 46,37.5 29,24.5 35,29.5 208,165 401,317 54,43 100.5,115.5 46.5,72.5 46.5,131.5 z m 128,37 V 32 q 0,-66 -47,-113 -47,-47 -113,-47 H 160 Q 94,-128 47,-81 0,-34 0,32 v 1088 q 0,66 47,113 47,47 113,47 h 1472 q 66,0 113,-47 47,-47 47,-113 z"/></g></svg>""")
    }

    "i.icon.linkedin:after" {
        width = 0.95.em
        setSvg("""<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M416 32H31.9C14.3 32 0 46.5 0 64.3v383.4C0 465.5 14.3 480 31.9 480H416c17.6 0 32-14.5 32-32.3V64.3c0-17.8-14.4-32.3-32-32.3zM135.4 416H69V202.2h66.5V416zm-33.2-243c-21.3 0-38.5-17.3-38.5-38.5S80.9 96 102.2 96c21.2 0 38.5 17.3 38.5 38.5 0 21.3-17.2 38.5-38.5 38.5zm282.1 243h-66.4V312c0-24.8-.5-56.7-34.5-56.7-34.6 0-39.9 27-39.9 54.9V416h-66.4V202.2h63.7v29.2h.9c8.9-16.8 30.6-34.5 62.9-34.5 67.2 0 79.7 44.3 79.7 101.9V416z"/></svg>""")
    }

    "i.icon.resume:after" {
        width = 0.75.em
        setSvg("""<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M288 248v28c0 6.6-5.4 12-12 12H108c-6.6 0-12-5.4-12-12v-28c0-6.6 5.4-12 12-12h168c6.6 0 12 5.4 12 12zm-12 72H108c-6.6 0-12 5.4-12 12v28c0 6.6 5.4 12 12 12h168c6.6 0 12-5.4 12-12v-28c0-6.6-5.4-12-12-12zm108-188.1V464c0 26.5-21.5 48-48 48H48c-26.5 0-48-21.5-48-48V48C0 21.5 21.5 0 48 0h204.1C264.8 0 277 5.1 286 14.1L369.9 98c9 8.9 14.1 21.2 14.1 33.9zm-128-80V128h76.1L256 51.9zM336 464V176H232c-13.3 0-24-10.7-24-24V48H48v416h288z"/></svg>""")
    }

    "i.icon.dropdown:after" {
        setSvg("""<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 -512 1792 1536"><g transform="matrix(1,0,0,-1,402.44068,1239.8644)"><path d="m 1024,832 q 0,-26 -19,-45 L 557,339 q -19,-19 -45,-19 -26,0 -45,19 L 19,787 q -19,19 -19,45 0,26 19,45 19,19 45,19 h 896 q 26,0 45,-19 19,-19 19,-45 z"/></g></svg>""")
    }
}