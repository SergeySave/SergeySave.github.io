package com.sergeysav.pages.projects

import com.sergeysav.css.inlineStyle
import com.sergeysav.websitegenerator.Environment
import com.sergeysav.websitegenerator.StaticResource
import kotlinx.css.Align
import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.JustifyContent
import kotlinx.css.alignSelf
import kotlinx.css.display
import kotlinx.css.flexDirection
import kotlinx.css.justifyContent
import kotlinx.css.pct
import kotlinx.css.width
import kotlinx.html.MAIN
import kotlinx.html.a
import kotlinx.html.div
import kotlinx.html.h2
import kotlinx.html.h3
import kotlinx.html.p
import kotlinx.html.span
import java.time.LocalDateTime

@Suppress("unused")
object ProjectRBMC  : ProjectsResourcePage(
    "rbmc",
    LocalDateTime.parse("2020-04-29T00:00:00"),
    "Mastering Reconnaissance Blind Chess with Reinforcement Learning",
    "Undergraduate Research Thesis at Georgia Tech",
    "projects/RBMC_icon.png"
) {

    override fun MAIN.contents(environment: Environment) = div(classes = "contents column") {
        h2 {
            +"September 2018 - May 2020"
        }
        h3 {
            inlineStyle {
                alignSelf = Align.center
            }
            +"Abstract"
        }
        p("indent justify") {
            +"""
Research within Artificial Intelligence has often set goals of being able to autonomously play games (e.g., Chess or Go) 
at or above human level. Novel machine learning-based agents have recently made advances in the state-of-the-art by 
achieving superhuman performance in increasingly complicated games. We believe that solving imperfect information games 
(i.e., games where you do not have full knowledge of the opponent's activities) should be the next goal in Artificial 
Intelligence research. We study Reconnaissance Blind Multi-Chess (RBMC), an imperfect information variant of Chess, 
which comes with a novel set of challenges that must be overcome before a computer can attain superhuman performance. 
Prior works have largely focused on reducing the problem to a game of standard Chess (i.e., with perfect information) 
by attempting to determine the true state of the Chessboard. This procedure separates the problem of acquiring and 
applying gathered information from the move policy, allowing existing Chess agents to be used to choose nearly optimal 
moves. In contrast, our method trains a triple-headed neural network through self-play reinforcement learning, handling 
the information-gathering process, and move process within one model. Since this agent does not attempt to solve a 
restricted version of the problem, the algorithm is able to execute strategies based on the imperfect information 
aspect of the game. We believe that such a learning method, given enough training time, should be able to outperform 
agents that simply reduce the problem to a standard game of Chess. In this thesis, we explore this hypothesis and 
algorithms for playing RBMC.
                    """.trimIndent()
        }
        p {
            span("bold") { +"Keywords: " }
            +"Reconnaissance Blind Multi-Chess, Reinforcement Learning."
        }
        div {
            inlineStyle {
                display = Display.flex
                flexDirection = FlexDirection.row
                justifyContent = JustifyContent.flexEnd
                width = 100.pct
            }
            a(classes = "blue button") {
                href = environment.getResourcePath(StaticResource("projects/RBMC_thesis.pdf", "$path/thesis.pdf"))
                +"View Thesis"
            }
        }
    }
}
