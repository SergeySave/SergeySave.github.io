package com.sergeysav.templates

import com.sergeysav.pages.Stylesheet
import com.sergeysav.websitegenerator.Environment
import com.sergeysav.websitegenerator.Template
import kotlinx.html.HEAD
import kotlinx.html.HTML
import kotlinx.html.head
import kotlinx.html.link
import kotlinx.html.meta
import kotlinx.html.script
import kotlinx.html.title

class PageHead(
    private val titleText: String,
    private val inner: HEAD.()->Unit = {}
) : Template<HTML> {

    override fun HTML.install(environment: Environment) {
        head {
            meta {
                charset = "UTF-8"
            }
            meta {
                name = "viewport"
                content = "width=device-width, initial-scale=1, shrink-to-fit=no"
            }
            meta {
                httpEquiv = "x-ua-compatible"
                content = "ie=edge"
            }

            title(content = titleText)

            // Add the css
            link {
                rel = "stylesheet"
                type = "text/css"
                href = environment.getResourcePath(Stylesheet)
            }

            // Add the Lato font family
            link {
                rel = "preconnect"
                href = "https://fonts.googleapis.com"
            }
            link {
                rel = "preconnect"
                href = "https://fonts.gstatic.com"
                attributes["crossorigin"] = ""
            }
            link {
                rel = "stylesheet"
                href = "https://fonts.googleapis.com/css2?family=Atkinson+Hyperlegible&display=swap"
            }

            // Add JQuery
            script {
                src = "https://code.jquery.com/jquery-3.6.0.min.js"
                integrity = "sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
                attributes["crossorigin"] = "anonymous"
            }

            inner()
        }
    }
}
