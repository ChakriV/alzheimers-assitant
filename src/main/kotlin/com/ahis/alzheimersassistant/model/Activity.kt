package com.ahis.alzheimersassistant.model

import java.sql.Time
import java.time.Instant
import javax.persistence.*

@Entity
@Table(name = "activity")
class Activity {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    val  id: Long? = null
    var createdTimeStamp: Instant? = null
    val lastNotifiedTimestamp: Instant? = null
    val category: String? = null
    val text: String? = null
    val notificationTime: Time? = null

    @OneToOne(cascade= [CascadeType.ALL])
    val notificationRepeat: NotificationRepeat? = null
}