package com.sergeysav.pages.projects

import com.sergeysav.websitegenerator.Environment
import com.sergeysav.websitegenerator.StaticResource
import kotlinx.html.MAIN
import kotlinx.html.div
import kotlinx.html.h2
import kotlinx.html.img
import kotlinx.html.p
import java.time.LocalDateTime

@Suppress("unused")
object ProjectPlanetRenderer : ProjectsResourcePage(
    "planet",
    LocalDateTime.parse("2015-05-01T00:00:00"),
    "Planet Renderer",
    "A 3D planet renderer using a custom LOD algorithm",
    "projects/PlanetRenderer_icon.png",
    sourceCode = "https://github.com/SergeySave/Planet"
) {

    override fun MAIN.contents(environment: Environment) = div("contents column") {
        h2 {
            +"May 2015"
        }
        p("indent") {
            +"""
In the spring of my junior year of high school, I had gotten interested in 3-dimensional graphics
and how your computer rendered them to your screen. I decided that I would make a project that used
3D graphics techniques in order to render a 3D planet in real time. This project, written in Java
using LibGDX to provide me access to OpenGL functions, started off with me simply drawing a 3D cube
to the screen and then being able to rotate the camera around it. After I completed this relatively
easy task, I set on to replace the cube with a planet.
            """.trimIndent()
        }
        div("right float tooltipContainer image") {
            img {
                src = environment.getResourcePath(StaticResource("projects/PlanetRenderer_icon.png", "$path/screenshot.png"))
            }
            div("tooltip full") {
                +"""
A screenshot of the rendering produced by the planet renderer 
program. As you can see the mountains in the background are much more jagged than
the terrain closer to the view. The colors are set from the height of the terrain.
                """.trimIndent()
            }
        }
        p("indent") {
            +"""
First I cut up each face of the cube into smaller subfaces. Each of the six faces on my cube was cut
into five hundred and twelve columns and each of those columns into another five hundred and twelve
rows. This left me with nearly one and a half million squares collectively making up a cube. I then
took all of the vertices from these squares and I moved them inwards so that they were all an equal
distance away from the center of the cube. I had made a sphere. However, the points on this sphere
were more uniformly distributed than those on a sphere where an equal amount of points were placed
at every latitude. I then gave each point a unique random offset generated by an open source version
of the simplex noise function. This gave my sphere bumps and edges. I then colored points offset
towards the center blue and those offset away green. I had made a planet (of sorts), but it did not
meet my expectations. It would take my program approximately a minute to generate all of the points
and send them to my GPU in order to render a much lower quality version of the planet than I had
hoped to make while running slower than real-time.
            """.trimIndent()
        }
        div("right float tooltipContainer image") {
            img {
                src = environment.getResourcePath(StaticResource("projects/PlanetRenderer_wireframe.png", "$path/wireframe.png"))
            }
            div("tooltip full") {
                +"""
A screenshot of the rendering produced by the planet renderer
program with wireframe mode turned on. With this it is visible how the land in the
background has less triangles than the land in the foreground. The transitions
between different levels of detail are also visible.
                """.trimIndent()
            }
        }
        p("indent") {
            +"""
I realized that I needed to change something big if I wanted different results. A couple academic
research papers later, I realized what I needed to do. I needed to implement a level of detail
algorithm. This algorithm would change the amount of points that it was using to render the planet
as it was rendering the planet to simultaneously offer greatly improved performance and greatly
improved quality. After figuring how these algorithms worked in general and failing to understand
any specifics about any algorithm, I set on to devise my own. About a week later I had succeeded.
I wrote a quad tree that would wrap correctly around the edges of my cube. Then I would take these
nodes that the quad tree gave me and I would connect their edges up with triangles in order to
generate the mesh that I used for rendering. Then I was able to split one of these nodes if I wanted
a region of the planet to be in higher quality or recombine four child nodes back into a parent node
if I wanted to increase the performance. After this was completed, I had achieved much better
performance and quality than I originally had with the first version of my planet. I was able to
zoom in all the way into the planet and I still would not be able to discern massive triangles in
my planet. However, it still didn't work as well as I had hoped, but I learned a lot from it and the
academic papers that I had read finally clicked after I had finished the project.
            """.trimIndent()
        }
    }
}
