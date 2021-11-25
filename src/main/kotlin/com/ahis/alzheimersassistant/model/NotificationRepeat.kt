package com.ahis.alzheimersassistant.model

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table(name = "notification_repeat")
class NotificationRepeat {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    @JsonIgnore
    val id: Long? = null
    val frequencyValue: Int? = null
    val frequencyUnit: String? = null
}