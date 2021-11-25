package com.ahis.alzheimersassistant.handler

import com.ahis.alzheimersassistant.model.Activity
import com.ahis.alzheimersassistant.model.Person
import com.ahis.alzheimersassistant.service.PersonService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/alzheimers-assistant")
class PersonHandler(private val personService: PersonService) {

    @PostMapping
    fun createPerson(@RequestBody person: Person): Person {
        return personService.createPerson(person)
    }

    @GetMapping("/{personId}")
    fun getPerson(@PathVariable personId: Long): Person {
        return personService.getPerson(personId)
    }

    @PostMapping("/{personId}/activity")
    fun createActivity(@PathVariable personId: Long, @RequestBody activity: Activity): Person {
        return personService.addActivity(personId, activity)
    }
}