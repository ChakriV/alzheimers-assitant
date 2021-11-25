package com.ahis.alzheimersassistant.model

import javax.persistence.*

@Entity
@Table(name = "address")
class Address {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    val id: Long? = null
    val streetAddress1: String? = null
    val streetAddress2: String? = null
    val city: String? = null
    val state: String? = null
    val zipCode: String? = null
}