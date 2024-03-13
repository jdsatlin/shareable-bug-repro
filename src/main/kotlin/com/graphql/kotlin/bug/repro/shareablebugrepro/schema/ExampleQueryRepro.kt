package com.graphql.kotlin.bug.repro.shareablebugrepro.schema

import com.expediagroup.graphql.server.operations.Query
import org.springframework.stereotype.Component

@Component
class ExampleQueryRepro: Query {

    suspend fun exampleQueryRepro(exampleTypeAsInput: ExampleTypeRepro): ExampleTypeRepro {
        return ExampleTypeRepro(0.0, 0.0)
    }
}