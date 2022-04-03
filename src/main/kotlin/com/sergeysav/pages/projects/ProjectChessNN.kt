package com.sergeysav.pages.projects

import com.sergeysav.websitegenerator.Environment
import com.sergeysav.websitegenerator.StaticResource
import kotlinx.html.MAIN
import kotlinx.html.a
import kotlinx.html.br
import kotlinx.html.div
import kotlinx.html.h2
import kotlinx.html.img
import kotlinx.html.p
import java.time.LocalDateTime

@Suppress("unused")
object ProjectChessNN  : ProjectsResourcePage(
    "chessnn",
    LocalDateTime.parse("2017-05-30T00:00:00"),
    "Chess Neural Network",
    "An Artificial Neural Network written from scratch and taught to play chess",
    "projects/ChessNN_icon.png",
    sourceCode = "https://github.com/SergeySave/NeuralNetwork"
) {

    override fun MAIN.contents(environment: Environment) = div("contents column") {
        h2 {
            +"September 2016 - June 2017"
        }
        p("indent") {
            +"""
Over the course of my senior year of high school, I performed an Independent Study on Artificial
Intelligence using Neural Networks where I wrote an deeply-connected feed-forward Artificial
Neural Network from scratch in Java and I taught it to play chess. This was a tremendous
undertaking.
            """.trimIndent()
        }
        div("right float tooltipContainer image") {
            img {
                src = environment.getResourcePath(StaticResource("projects/ChessNN_icon.png", "$path/board.png"))
            }
            div("tooltip full") {
                +"""
A visual representation of the neural network's output on an
empty chess board. In this stage of its training the AI thinks that the purple tile
should be moved to the light blue tile. With enough training the AI will start to
make legal moves.
                """.trimIndent()
            }
        }
        p("indent") {
            +"""
I started off this project by researching how Artificial Neural Networks worked and were
written. I learned of the underlying math and calculations that occurred in order to make a 
computer able to learn. I read academic research papers, programmer blog posts, and 
wikipedia articles all detailing the underlying processes allowing computers to simulate 
intelligence. After over a month of research, I believed that I knew enough and that I had 
figured out enough of the math in order to write my own Neural Network. This simple network 
was just a starting point for me to learn how to go about writing a Neural Network and for 
me to play around with some of the parameters that I would later have to spend a lot of 
time fine-tuning. I taught this first simple network the
            """.trimIndent()
            +" "
            a {
                href = "https://en.wikipedia.org/wiki/Exclusive_or"
                +"XOR function"
            }
            br {  }
            br {  }
            +"""
After it was able to learn this function with a fairly high success rate (90% of random starts),
I decided that it was time to switch to a more complex task: Chess. While I recognized that this
would be an immense challenge and I even doubted my own ability to be able to write a neural network
that would be able to do anything from my fairly surface-level understanding of all of the concepts
behind all that I was doing, I was determined to take my failures and convert them to successes,
to increase my understanding and learn how to write a neural network that I never thought I could.
            """.trimIndent()
        }
        div("right float tooltipContainer image") {
            img {
                src = environment.getResourcePath(StaticResource("projects/ChessNN_output.png", "$path/output.png"))
            }
            div("tooltip full") {
                +"""
A graph of the neural network's error as it relates to a given
input into the network. A single unit along the x axis represents a single iteration
of the backpropagation algorithm. The y axis is the squared error for the iteration
of the algorithm.
                """.trimIndent()
            }
        }
        p("indent") {
            +"""
So next, I downloaded 18,313 games of chess from 12 different chess masters in order to use to
train my network. After writing the code that I'd need to be able to read these chess trascripts and
convert them into a form that would be usable for my neural network, I reworked my code in order
to be able to handle and better process this tremendous volume of data. Over the course of the rest
of the school year, I worked on improving my algorithm and changing the size of the neural network.
I spent it fixing bugs that I kepts discovering and optimizing the methods that I was using to
teach the Neural Network chess. The end of the year came before it was able to fully learn to play
chess. While it never truly learned to play chess it did manage to memorize the first 7 moves of a
couple of different openings. It was also able to change which opening it would use depending on what
moves its opponent made. Then I presented my results to a related class, in my case the AP Computer
Science A class, and I called it a year. I do still plan on returning to this project. Probably
using a library, such as TensorFlow, just to see if it was my data or my algorithm that were at
fault for this result.
            """.trimIndent()
        }
    }
}
