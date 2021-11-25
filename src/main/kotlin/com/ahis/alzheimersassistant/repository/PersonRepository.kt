package com.ahis.alzheimersassistant.repository

import com.ahis.alzheimersassistant.model.Person
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.CrudRepository

interface PersonRepository : CrudRepository<Person, Long> {}