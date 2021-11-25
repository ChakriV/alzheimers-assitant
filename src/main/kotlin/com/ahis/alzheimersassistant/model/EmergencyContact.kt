package com.ahis.alzheimersassistant.model

import javax.persistence.*

@Entity
@Table(name = "emergency_contact")
class EmergencyContact {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    val id: Long? = null
    val firstName: String? = null
    val lastName: String? = null

    @OneToOne
    val phoneNumber: PhoneNumber? = null
}