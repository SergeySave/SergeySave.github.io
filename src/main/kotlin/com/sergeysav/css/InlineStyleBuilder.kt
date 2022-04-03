package com.sergeysav.css

import kotlinx.css.CssBuilder
import kotlinx.css.RuleSet
import kotlinx.html.CommonAttributeGroupFacade
import kotlinx.html.style

fun CommonAttributeGroupFacade.inlineStyle(ruleSet: RuleSet) {
    this.style = CssBuilder().apply(ruleSet).toString().replace('\n', ' ')
}