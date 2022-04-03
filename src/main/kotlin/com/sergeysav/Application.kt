package com.sergeysav

import com.sergeysav.pages.AboutMe
import com.sergeysav.websitegenerator.StaticResource
import com.sergeysav.websitegenerator.WebsiteGenerator

fun main(args: Array<String>) {
    WebsiteGenerator.run(args) {
        // Add all resources related to the About Me page
        getResourcePath(AboutMe)

        // Add the CNAME file (necessary for GitHub Pages)
        getResourcePath(StaticResource("CNAME"))
    }
}
