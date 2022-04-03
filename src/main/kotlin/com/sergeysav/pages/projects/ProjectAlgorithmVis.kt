package com.sergeysav.pages.projects

import com.sergeysav.css.ColorConstants
import com.sergeysav.css.inlineStyle
import com.sergeysav.templates.icon
import com.sergeysav.websitegenerator.Environment
import com.sergeysav.websitegenerator.StaticResource
import kotlinx.css.Align
import kotlinx.css.BoxSizing
import kotlinx.css.Color
import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.JustifyContent
import kotlinx.css.Overflow
import kotlinx.css.Position
import kotlinx.css.alignItems
import kotlinx.css.borderRadius
import kotlinx.css.boxSizing
import kotlinx.css.display
import kotlinx.css.em
import kotlinx.css.flexDirection
import kotlinx.css.fontSize
import kotlinx.css.height
import kotlinx.css.justifyContent
import kotlinx.css.margin
import kotlinx.css.marginLeft
import kotlinx.css.overflow
import kotlinx.css.padding
import kotlinx.css.pct
import kotlinx.css.position
import kotlinx.css.properties.boxShadow
import kotlinx.css.properties.transform
import kotlinx.css.properties.translate
import kotlinx.css.px
import kotlinx.css.width
import kotlinx.html.MAIN
import kotlinx.html.ScriptType
import kotlinx.html.a
import kotlinx.html.button
import kotlinx.html.canvas
import kotlinx.html.div
import kotlinx.html.h2
import kotlinx.html.id
import kotlinx.html.p
import kotlinx.html.script
import java.time.LocalDateTime

@Suppress("unused")
object ProjectAlgorithmVis  : ProjectsResourcePage(
    "algovis",
    LocalDateTime.parse("2019-02-13T00:00:00"),
    "Algorithm Visualizer",
    "A visualizer for various algorithms",
    "projects/AlgoVis_icon.png",
    sourceCode = "https://github.com/SergeySave/Algovis"
) {

    override fun MAIN.contents(environment: Environment) = div("contents column") {
        h2 {
            +"February 2018 - August 2018"
        }
        p("indent") {
            +"Having some experience with "
            a(href = "http://kotlinlang.org/") {
                +"Kotlin"
            }
            +" from my "
            a(href = environment.getResourcePath(ProjectSpaceGame)) {
                +"Space Game"
            }
            +" "
            +"""
project and some interest
in seeing how various algorithms work because I was taking Algorithms and Data
Structures. I wanted to try to make a Kotlin multiplatform project using Kotlin's
coroutines. This project ended up being an algorithm visualizer that would run
in the browser, by compiling the Kotlin to Javascript, and in the JVM.
            """.trimIndent()
        }
        p("indent") {
            +"""
By using coroutines and some syntax sugar from Kotlin, I was able to write these
algorithms in such a way that they were almost the same code as the normal algorithms.
Only multithreaded algorithms, such as the parallel merge sort and parallel quicksort,
had large bits that were related to the implementation of the algorithm renderer.
The end result, compiled to JavaScript is available below.
            """.trimIndent()
        }

        div {
            inlineStyle {
                display = Display.flex
                flexDirection = FlexDirection.row
                justifyContent = JustifyContent.center
                alignItems = Align.center
            }
            div {
                id = "mainArea"
                inlineStyle {
                    borderRadius = 1.em
                    boxShadow(ColorConstants.DARK.changeAlpha(0.3), 0.px, 0.px, 4.px)
                    boxSizing = BoxSizing.borderBox
                    padding(0.px, 1.em, 1.em)
                }
                div {
                    id = "controls"
                    inlineStyle {
                        width = 100.pct
                        borderRadius = 0.2.em
                        boxShadow(ColorConstants.DARK.changeAlpha(0.3), 0.px, 0.px, 4.px)
                        boxSizing = BoxSizing.borderBox
                        display = Display.flex
                        flexDirection = FlexDirection.row
                        justifyContent = JustifyContent.left
                        alignItems = Align.center
                        margin(1.em, 0.px)
                    }
                    div("dropdown") {
                        inlineStyle {
                            padding(0.75.em, 1.25.em)
                            position = Position.relative
                        }
                        +"Structures"
                        icon("dropdown", Color.currentColor) {
                            marginLeft = 0.5.em
                            fontSize = 0.75.em
                        }
                        div("menu") {
                            id = "structureList"
                            inlineStyle {
                                display = Display.none
                                transform {
                                    translate((-1.2).em, (-0.2).px)
                                }
                            }
                            div {
                                id = "structureListItem"
                            }
                        }
                    }
                    div("dropdown") {
                        inlineStyle {
                            padding(0.75.em, 1.25.em)
                            position = Position.relative
                        }
                        +"Current Structure"
                        icon("dropdown", Color.currentColor) {
                            marginLeft = 0.5.em
                            fontSize = 0.75.em
                        }
                        div("menu") {
                            id = "structureMenu"
                            inlineStyle {
                                display = Display.none
                                transform {
                                    translate((-1.2).em, (-0.2).px)
                                }
                            }
                            div("dropdown hover") {
                                inlineStyle {
                                    padding(0.75.em, 1.25.em)
                                }
                                id = "structureMenuItem"
                                icon("dropdown", Color.currentColor) {
                                    marginLeft = 0.5.em
                                    fontSize = 0.75.em
                                }
                                div("menu right") {
                                    div {
                                        id = "structureMenuSubItem"
                                        inlineStyle {
                                            width = 250.px
                                        }
                                    }
                                    div("dropdown hover") {
                                        inlineStyle {
                                            padding(0.75.em, 1.25.em)
                                            position = Position.relative
                                            overflow = Overflow.unset
                                        }
                                        id = "structureMenuSubListItem"
                                        icon("dropdown", Color.currentColor) {
                                            marginLeft = 0.5.em
                                            fontSize = 0.75.em
                                        }
                                        div("menu right") {
                                            div {
                                                id = "structureMenuSubSubItem"
                                                inlineStyle {
                                                    width = 250.px
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    div("dropdown") {
                        inlineStyle {
                            padding(0.75.em, 1.25.em)
                            position = Position.relative
                        }
                        +"Options"
                        icon("dropdown", Color.currentColor) {
                            marginLeft = 0.5.em
                            fontSize = 0.75.em
                        }
                        div("menu") {
                            inlineStyle {
                                display = Display.none
                                transform {
                                    translate((-1.2).em, (-0.2).px)
                                }
                            }
                            button(classes = "a") {
                                inlineStyle {
                                    width = 200.px
                                }
                                id = "dataSizeMenu"
                            }
                            button(classes = "a") {
                                inlineStyle {
                                    width = 200.px
                                }
                                id = "opTimeMenu"
                            }
                        }
                    }
                    a {
                        id = "simulation"
                    }
                }
                div(classes = "canvasContent") {
                    canvas {
                        id = "canvas"
                        width = "100%"
                        height = "100%"
                    }
                }
            }
        }

        script {
            type = ScriptType.textJavaScript
            src = environment.getResourcePath(StaticResource("projects/AlgoVis_kotlin.js", "$path/kotlin.js"))
        }
        script {
            type = ScriptType.textJavaScript
            src = environment.getResourcePath(StaticResource("projects/AlgoVis_kotlinx-atomicfu.js", "$path/kotlinx-atomicfu.js"))
        }
        script {
            type = ScriptType.textJavaScript
            src = environment.getResourcePath(StaticResource("projects/AlgoVis_kotlinx-coroutines-core.js", "$path/kotlinx-coroutines-core.js"))
        }
        script {
            type = ScriptType.textJavaScript
            src = environment.getResourcePath(StaticResource("projects/AlgoVis_algovis-js.js", "$path/algovis-js.js"))
        }
    }
}
