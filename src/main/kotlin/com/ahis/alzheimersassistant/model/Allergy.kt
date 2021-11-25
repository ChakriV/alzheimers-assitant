package com.ahis.alzheimersassistant.model

import javax.persistence.*

@Entity
@Table(name = "Allergy")
class Allergy {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    val id: Long? = null
    val name: String? = null
    val reaction: String? = null
    val severity: String? = null
}