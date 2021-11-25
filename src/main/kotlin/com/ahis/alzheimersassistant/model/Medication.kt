package com.ahis.alzheimersassistant.model

import javax.persistence.*

@Entity
@Table(name = "medication")
class Medication {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    val id: Long? = null
    val name: String? = null
    val ndcCode: String? = null
}