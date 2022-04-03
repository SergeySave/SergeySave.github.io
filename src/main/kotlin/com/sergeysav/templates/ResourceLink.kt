package com.sergeysav.templates

import com.sergeysav.websitegenerator.Environment
import com.sergeysav.websitegenerator.Resource
import kotlinx.html.A
import kotlinx.html.FlowOrInteractiveOrPhrasingContent
import kotlinx.html.HtmlTagMarker
import kotlinx.html.a

@HtmlTagMarker
inline fun FlowOrInteractiveOrPhrasingContent.resourceLink(environment: Environment, resource: Resource, classes: String? = null, crossinline inner: A.()->Unit) = a(classes = if (environment.currentResource == resource) "current ${classes ?: ""}" else classes) {
    href = environment.getResourcePath(resource)
    inner()
}