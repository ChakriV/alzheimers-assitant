package com.ahis.alzheimersassistant.model

import javax.persistence.*

@Entity
@Table(name = "vital")
class Vital {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    val id: Long? = null
    val type: String? = null
    val unit: String? = null
    val value: Float? = null
}