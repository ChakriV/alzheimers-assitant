package com.ahis.alzheimersassistant.service

import com.ahis.alzheimersassistant.model.Activity
import com.ahis.alzheimersassistant.model.Person
import com.ahis.alzheimersassistant.repository.PersonRepository
import org.springframework.stereotype.Service
import java.time.Instant
import java.util.*

@Service
class PersonService(val personRepository: PersonRepository) {

    fun createPerson(person: Person) : Person {
        return personRepository.save(person)
    }

    fun getPerson(personId: Long): Person {
        return personRepository.findById(personId).get()
    }

    fun addActivity(personId: Long, activity: Activity): Person {
        val person = getPerson(personId);
        activity.createdTimeStamp = Instant.now()
        person.activities.add(activity);
        return personRepository.save(person)
    }
}