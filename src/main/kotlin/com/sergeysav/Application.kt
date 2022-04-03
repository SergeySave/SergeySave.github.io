package com.sergeysav

import com.sergeysav.pages.AboutMe
import com.sergeysav.websitegenerator.WebsiteGenerator

fun main(args: Array<String>) {
    WebsiteGenerator.run(args) {
        getResourcePath(AboutMe)
    }
}
