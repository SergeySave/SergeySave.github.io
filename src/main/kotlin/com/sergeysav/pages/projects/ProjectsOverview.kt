package com.sergeysav.pages.projects

import com.sergeysav.css.inlineStyle
import com.sergeysav.templates.PageFoot
import com.sergeysav.templates.PageHead
import com.sergeysav.templates.TopBarContents
import com.sergeysav.websitegenerator.BaseResource
import com.sergeysav.websitegenerator.Environment
import kotlinx.css.Align
import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.JustifyContent
import kotlinx.css.alignItems
import kotlinx.css.display
import kotlinx.css.flexDirection
import kotlinx.css.flexGrow
import kotlinx.css.justifyContent
import kotlinx.html.a
import kotlinx.html.body
import kotlinx.html.div
import kotlinx.html.h1
import kotlinx.html.h2
import kotlinx.html.header
import kotlinx.html.id
import kotlinx.html.img
import kotlinx.html.main
import kotlinx.html.p
import kotlinx.html.role

object ProjectsOverview : BaseResource("/projects") {

    override fun Environment.install() = outputHTML {
        build(PageHead("Projects Overview"))

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
                        +"Projects"
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

                div(classes = "column") {
                    val pages = ProjectsResourcePage::class.sealedSubclasses.asSequence()
                        .mapNotNull { it.objectInstance }
                        .sortedByDescending { it.time }
                    for (page in pages) {
                        a(classes = "project") {
                            href = getResourcePath(page)

                            img(classes = "item") {
                                this.src = getResourcePath(page.image)
                                this.alt = "${page.name} icon"
                            }
                            h2 {
                                +page.name
                            }
                            p {
                                +page.desc
                            }
                        }
                    }
                }
            }

            build(PageFoot())
        }
    }
}
