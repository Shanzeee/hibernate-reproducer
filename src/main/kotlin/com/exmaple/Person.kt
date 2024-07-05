package com.exmaple

import io.quarkus.hibernate.reactive.panache.kotlin.PanacheCompanion
import io.quarkus.hibernate.reactive.panache.kotlin.PanacheEntityBase
import jakarta.persistence.*
import org.hibernate.annotations.JdbcType
import org.hibernate.annotations.JdbcTypeCode
import org.hibernate.dialect.PostgreSQLEnumJdbcType
import org.hibernate.type.SqlTypes

@Entity
class Person : PanacheEntityBase{

    companion object: PanacheCompanion<Person>

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    lateinit var name: String

    @Enumerated(EnumType.STRING)
    @JdbcType(PostgreSQLEnumJdbcType::class)
    lateinit var brand: Brand

    @JdbcTypeCode(SqlTypes.NAMED_ENUM)
    lateinit var brands: Array<Brand>
    override fun toString(): String {
        return "Person(id=$id, name='$name', brand=$brand, brands=${brands.contentToString()})"
    }


}

enum class Brand {
    BRAND_1,
    BRAND_2,
    BRAND_3,
    BRAND_4
}
