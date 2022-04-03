package com.sergeysav.templates

import com.sergeysav.css.inlineStyle
import com.sergeysav.pages.AboutMe
import com.sergeysav.pages.projects.ProjectsOverview
import com.sergeysav.pages.projects.ProjectsResourcePage
import com.sergeysav.websitegenerator.Environment
import com.sergeysav.websitegenerator.Template
import kotlinx.css.Color
import kotlinx.css.Display
import kotlinx.css.display
import kotlinx.css.em
import kotlinx.css.fontSize
import kotlinx.css.marginLeft
import kotlinx.css.properties.transform
import kotlinx.css.properties.translate
import kotlinx.css.px
import kotlinx.html.DIV
import kotlinx.html.div

class TopBarContents : Template<DIV> {

    override fun DIV.install(environment: Environment) {
        resourceLink(environment, AboutMe) { +"About Me" }

        div("dropdown ${if (environment.currentResource?.path?.startsWith(ProjectsOverview.path) == true) "current" else ""}") {
            +"Projects"
            icon("dropdown", Color.currentColor) {
                marginLeft = 0.5.em
                fontSize = 0.75.em
            }

            div("menu") {
                inlineStyle {
                    display = Display.none
                    transform {
                        translate((-1).em, (-0.2).px)
                    }
                }

                resourceLink(environment, ProjectsOverview) { +"Overview" }
                val pages = ProjectsResourcePage::class.sealedSubclasses.asSequence().mapNotNull { it.objectInstance }.sortedByDescending { it.time }
                for (page in pages) {
                    resourceLink(environment, page) { +page.name }
                }
            }
        }
    }
}
