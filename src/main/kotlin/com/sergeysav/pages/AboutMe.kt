package com.sergeysav.pages

import com.sergeysav.css.inlineStyle
import com.sergeysav.templates.PageFoot
import com.sergeysav.templates.PageHead
import com.sergeysav.templates.TopBarContents
import com.sergeysav.templates.icon
import com.sergeysav.websitegenerator.BaseResource
import com.sergeysav.websitegenerator.Environment
import com.sergeysav.websitegenerator.StaticResource
import kotlinx.css.Align
import kotlinx.css.Color
import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.JustifyContent
import kotlinx.css.alignItems
import kotlinx.css.borderRadius
import kotlinx.css.color
import kotlinx.css.display
import kotlinx.css.flexDirection
import kotlinx.css.flexGrow
import kotlinx.css.fontSize
import kotlinx.css.gap
import kotlinx.css.justifyContent
import kotlinx.css.marginTop
import kotlinx.css.px
import kotlinx.css.width
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

object AboutMe : BaseResource("/") {

    override fun Environment.install() = outputHTML {
        build(PageHead("About Me"))

        body {

            header {
                this.id = "header"
                this.role = "banner"

                div("topbar") {
                    build(TopBarContents())
                }

                div {
                    img {
                        this.inlineStyle {
                            width = 300.px
                            borderRadius = 150.px
                        }
                        this.src = getResourcePath(StaticResource("Me2019_Square_NoEXIF.JPG", "me.jpg"))
                        this.alt = "A picture of Sergey Savelyev"
                    }
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
                        +"Sergey Savelyev"
                    }
                    h2 {
                        +"Avionics Software Engineer"
                    }
                    div {
                        this.inlineStyle {
                            display = Display.flex
                            flexDirection = FlexDirection.row
                            justifyContent = JustifyContent.center
                            alignItems = Align.center
                            marginTop = 8.px
                            fontSize = 32.px
                            color = Color.white
                            gap = 8.px

                        }
                        a {
                            href = "https://github.com/SergeySave"
                            icon("github", Color.white)
                        }
                        a {
                            href = "mailto:sergey@sergeysav.com"
                            icon("email", Color.white)
                        }
                        a {
                            href = "https://www.linkedin.com/in/sergeysav"
                            icon("linkedin", Color.white)
                        }
                        a {
                            href = getResourcePath(StaticResource("Resume.pdf", "resume.pdf"))
                            icon("resume", Color.white)
                        }
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

                div(classes = "contents column") {
                    h2 {
                        +"About Me"
                    }
                    p {
                        +"""
I am a Computer Science Masters Student at Georgia Tech. I love Computer Science and I love working
on my own personal programming projects. You can view many of them on the projects page. I am very
driven and determined to finish projects that I have started. Whenever I run into a tough challenge,
I never give up, but I persevere through it and I solve the problem in one way or another.
                        """.trimIndent()
                    }

                    h2 {
                        +"Contact Me"
                    }
                    p {
                        +"Feel free to send me an email at "
                        a(href = "mailto:sergey@sergeysav.com") {
                            +"sergey@sergeysav.com"
                        }
                        +" with questions regarding my projects or possible opportunities such as project offers or possible ventures."
                    }
                }
            }

            build(PageFoot())
        }
    }
}
