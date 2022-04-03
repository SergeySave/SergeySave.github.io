package com.sergeysav.templates

import com.sergeysav.websitegenerator.Environment
import com.sergeysav.websitegenerator.StaticResource
import com.sergeysav.websitegenerator.Template
import kotlinx.html.BODY
import kotlinx.html.FOOTER
import kotlinx.html.ScriptType
import kotlinx.html.a
import kotlinx.html.div
import kotlinx.html.footer
import kotlinx.html.h2
import kotlinx.html.id
import kotlinx.html.role
import kotlinx.html.script
import kotlinx.html.unsafe

class PageFoot(private val inner: FOOTER.()->Unit = {}) : Template<BODY> {

    override fun BODY.install(environment: Environment) {
        footer {
            this.id = "footer"
            this.role = "contentinfo"

            div("column") {
                h2 {
                    +"About Me"
                }
                a {
                    href = "https://github.com/SergeySave"
                    +"Github"
                }
                a {
                    href = "mailto:sergey@sergeysav.com"
                    +"Email"
                }
                a {
                    href = "https://www.linkedin.com/in/sergeysav"
                    +"LinkedIn"
                }
                a {
                    href = environment.getResourcePath(StaticResource("Resume.pdf", "resume.pdf"))
                    +"Resume"
                }
            }

            inner()
        }

        script(type = ScriptType.textJavaScript) {
            unsafe {
                raw("""
${'$'}(document).ready(function () {
    let timer;
    let scrollUpdateSpeed = 0
    function onScroll() {
        clearTimeout(timer);
        timer = setTimeout(function () {
            let top = ${'$'}("#header").offset().top;
            let height = ${'$'}("#header").outerHeight();
            if(${'$'}(window).scrollTop() > (top + height)){
                ${'$'}("main > .topbar").fadeIn(scrollUpdateSpeed);
            } 
            else {
                ${'$'}("main > .topbar").fadeOut(scrollUpdateSpeed);
            }
            scrollUpdateSpeed = 200
        }, 10)
    }
    ${'$'}(window).scroll(onScroll);
    onScroll();
    
    ${'$'}('div.dropdown:not(.hover)').click(function(){
        ${'$'}(this).children('.menu').slideToggle(200);
    });
    
    ${'$'}(document).click(function (e) {
        // If the click was outside of the menu, close it
        if( ${'$'}(e.target).closest("div.dropdown:not(.hover)").length == 0 && ${'$'}(e.target).closest("div.dropdown:not(.hover) > div.menu").length == 0 ) {
            ${'$'}('div.dropdown:not(.hover)').children('.menu').slideUp(200);
        }
    });
});
                """.trimJavaScript())
            }
        }
    }

    private fun String.trimJavaScript(): String {
        return this.lineSequence()
            .map(String::trim)
//            .map { if (it.endsWith(';') || it.endsWith('{') || it.endsWith('}') || it.isEmpty()) it else "$it;" }
            .filterNot { it.startsWith("//") }
            .filterNot { it.isEmpty() }
            .joinToString("\n")
    }
}


