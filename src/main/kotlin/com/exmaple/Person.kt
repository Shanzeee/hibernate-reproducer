package com.exmaple

import io.quarkus.hibernate.orm.panache.kotlin.PanacheCompanion
import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import jakarta.persistence.*
import org.hibernate.annotations.JdbcType
import org.hibernate.dialect.PostgreSQLEnumJdbcType

@Entity
class Person : PanacheEntity() {

    companion object: PanacheCompanion<Person>

    lateinit var name: String

    @Enumerated(EnumType.STRING)
    @JdbcType(PostgreSQLEnumJdbcType::class)
    lateinit var brand: Brand

    override fun toString(): String {
        return "Person(name='$name', brand=$brand)"
    }
}

enum class Brand {
    BRAND_1,
    BRAND_2,
    BRAND_3,
    BRAND_4
}
