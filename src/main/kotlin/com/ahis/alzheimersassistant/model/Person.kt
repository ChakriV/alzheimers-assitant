package com.ahis.alzheimersassistant.model

import org.hibernate.annotations.GeneratorType
import javax.persistence.*

@Entity
@Table
class Person {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    val id: Long? = null
    val firstName: String? = null
    val lastName: String? = null

    @OneToMany(cascade= [CascadeType.ALL])
    var addresses: MutableList<Address> = mutableListOf()

    @OneToMany(cascade= [CascadeType.ALL])
    val emergencyContacts: MutableList<EmergencyContact> = mutableListOf()

    @OneToMany(cascade= [CascadeType.ALL])
    val phoneNumbers: MutableList<PhoneNumber> = mutableListOf()

    @OneToMany(cascade= [CascadeType.ALL])
    val allergies: MutableList<Allergy> = mutableListOf()

    @OneToMany(cascade= [CascadeType.ALL])
    val activities: MutableList<Activity>  = mutableListOf()

    @OneToMany(cascade= [CascadeType.ALL])
    val vitals: MutableList<Vital> = mutableListOf()
}