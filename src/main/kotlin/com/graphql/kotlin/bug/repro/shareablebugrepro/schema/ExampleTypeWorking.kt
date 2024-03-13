package com.graphql.kotlin.bug.repro.shareablebugrepro.schema

import com.expediagroup.graphql.generator.federation.directives.ShareableDirective

@ShareableDirective
data class ExampleTypeWorking(val latitude: Double, val longitude: Double)

data class ExampleTypeWorkingInput(val latitude: Double, val longitude: Double)