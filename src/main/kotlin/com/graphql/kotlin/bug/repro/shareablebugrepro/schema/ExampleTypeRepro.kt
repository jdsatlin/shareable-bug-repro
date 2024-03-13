package com.graphql.kotlin.bug.repro.shareablebugrepro.schema

import com.expediagroup.graphql.generator.federation.directives.ShareableDirective

@ShareableDirective
data class ExampleTypeRepro(val latitude: Double, val longitude: Double)