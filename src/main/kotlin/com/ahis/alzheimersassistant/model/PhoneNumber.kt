package com.ahis.alzheimersassistant.model

import javax.persistence.*

@Entity
@Table(name = "phone_number")
class PhoneNumber {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    val id: Int? = null
    val number: Long? = null
    val countryCode: String? = null
}