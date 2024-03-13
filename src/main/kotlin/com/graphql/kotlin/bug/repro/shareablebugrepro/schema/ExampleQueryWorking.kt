package com.graphql.kotlin.bug.repro.shareablebugrepro.schema

import com.expediagroup.graphql.server.operations.Query
import org.springframework.stereotype.Component

@Component
class ExampleQueryWorking: Query {

    suspend fun exampleQueryWorking(exampleTypeAsInput: ExampleTypeWorkingInput): ExampleTypeWorking {
        return ExampleTypeWorking(0.0, 0.0)
    }
}