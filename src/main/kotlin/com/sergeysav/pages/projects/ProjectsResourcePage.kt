package com.sergeysav.pages.projects

import com.sergeysav.css.inlineStyle
import com.sergeysav.templates.PageFoot
import com.sergeysav.templates.PageHead
import com.sergeysav.templates.TopBarContents
import com.sergeysav.websitegenerator.BaseResource
import com.sergeysav.websitegenerator.Environment
import com.sergeysav.websitegenerator.StaticResource
import kotlinx.css.Align
import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.JustifyContent
import kotlinx.css.alignItems
import kotlinx.css.display
import kotlinx.css.flexDirection
import kotlinx.css.flexGrow
import kotlinx.css.justifyContent
import kotlinx.html.MAIN
import kotlinx.html.a
import kotlinx.html.body
import kotlinx.html.div
import kotlinx.html.h1
import kotlinx.html.h2
import kotlinx.html.header
import kotlinx.html.id
import kotlinx.html.main
import kotlinx.html.role
import java.time.LocalDateTime

sealed class ProjectsResourcePage(
    pathSegment: String,
    val time: LocalDateTime,
    val name: String,
    val desc: String,
    imagePath: String,
    val sourceCode: String? = null
) : BaseResource("${ProjectsOverview.path}/$pathSegment") {

    val image = StaticResource(imagePath, "$path/icon.png")

    abstract fun MAIN.contents(environment: Environment)

    override fun Environment.install() = outputHTML {
        build(PageHead(name))

        body {

            header {
                this.id = "header"
                this.role = "banner"

                div("topbar") {
                    build(TopBarContents())
                }

                div {
                    this.inlineStyle {
                        flexGrow = 1.0
                        display = Display.flex
                        flexDirection = FlexDirection.column
                        justifyContent = JustifyContent.center
                        alignItems = Align.center
                    }
                    h1 {
                        +name
                    }
                }
            }

            main {
                this.id = "content"
                this.role = "main"

                div("topbar") {
                    inlineStyle {
                        display = Display.none
                    }
                    build(TopBarContents())
                }

                contents(this@install)
            }

            build(PageFoot {
                sourceCode?.let {
                    div("column") {
                        h2 {
                            +"Links"
                        }
                        a {
                            href = it
                            +"Source Code"
                        }
                    }
                }
            })
        }
    }
}
