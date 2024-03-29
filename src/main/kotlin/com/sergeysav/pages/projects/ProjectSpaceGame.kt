package com.sergeysav.pages.projects

import com.sergeysav.websitegenerator.Environment
import kotlinx.html.MAIN
import kotlinx.html.a
import kotlinx.html.div
import kotlinx.html.h2
import kotlinx.html.p
import java.time.LocalDateTime

@Suppress("unused")
object ProjectSpaceGame  : ProjectsResourcePage(
    "spacegame",
    LocalDateTime.parse("2017-12-01T00:00:00"),
    "Space RTS Game",
    "A 2D real time strategy game set in space",
    "projects/SpaceGame_icon.png",
    sourceCode = "https://github.com/SergeySave/SpaceGame"
) {

    override fun MAIN.contents(environment: Environment) = div("contents column") {
        h2 {
            +"June 2017 - August 2017"
        }
        p("indent") {
            +"""
The summer after my senior year of high school, I began working on a top-down real-time-strategy
game set in space. While I do have an interest in game design, my game related projects are mostly
fun ways that I get myself to learn new technologies and new tools. In this project, for example, I
focused on learning how to use the ECS (entity-component-system) architecture rather than an OOP
(object-oriented programming) architecture. I did this because I had read that ECS architectures
were common in game development because the focus on composition rather than inheritance allows for
code reuse and higher levels of abstraction than a traditional OOP approach would have. While it
certainly took some time to get used to thinking in terms of components and entities rather than
interfaces, classes, and inheritance, I believe that it was a tremendous learning experience.
            """.trimIndent()
        }
        p("indent") {
            +"""
Another one of my goals for this project was to start branching out into other languages rather than
always using Java. So part way through this project, I had started writing new classes in
            """.trimIndent()
            +" "
            a(href = "http://kotlinlang.org/") {
                +"Kotlin"
            }
            +" "
            +"""
rather than in Java. Since Kotlin inter-operates
almost seamlessly with Java code, I was able to gradually switch over as I was learned it. This also
brought about a switch in my IDE and my toolset. Previously I had been using Eclipse as my IDE and I
had been using SmartGit as my git client, but after discovering that Eclipse's Kotlin plugin was
extremely bad at helping me write code on Kotlin, I switched to use IntelliJ IDEA CE. As I switched
my IDE, I also decided to start using command line git instead of a git client.
            """.trimIndent()
        }
        p("indent") {
            +"""
My final large goal for this project was to make every single level completely data-driven. I
accomplished this goal by creating level files such that I was able to define every part of the
level. This has culminated in a level file which is in essence a zip or archive file containing a
JSON metadata file as well as all the assets, such as images, sounds, and even lua code files. This
metadata file is used to define how the level starts when it is initially loaded, main ship classes
that can exist, commands that the user can issue to his or her ships, and lua event listeners.
Any lua code required by this file for events, commands, or simply to check whether a command is
able to be used or not can be linked to be loaded from a contained lua file, rather than being
written directly in the JSON file.
            """.trimIndent()
        }
        p("indent") {
            +"""
While I have already accomplished these goals and my game is feature complete, I am still missing
all of the levels and story that I would need to make in order for this game to truly be complete.
As I don't have nearly as much time to work on this as I had over the summer (and I personally don't
like making the levels as much as I do the engine), I am unsure whether I will complete this game or
not. The name "Space Game" was actually just a temporary name that I was going to change when I had
completed the game.
            """.trimIndent()
        }
        p("indent") {
            +"""
Since August 2017, I have not worked on this nearly as much as I had wanted to. I had started to work
on a level editor built into it, but it never really got off the ground and the project stalled. While
I do believe this project is still not complete, I have moved away from it as classes and newer projects
had come up.
            """.trimIndent()
        }
    }
}
