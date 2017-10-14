package com.sudin.kotlin.springbootkotlinexample.controller

import com.sudin.kotlin.springbootkotlinexample.model.Customer
import com.sudin.kotlin.springbootkotlinexample.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController {

    @Autowired
    lateinit var repository: CustomerRepository

    @RequestMapping("/save")
    fun save(): String{
        repository.save(Customer("Sudin","Ranjitkar"))
        repository.save(Customer("Sudeen","Ranjit"))
        repository.save(Customer("Buddha","Ranjitkar"))
        repository.save(Customer("Sunita","Ranjit"))
        repository.save(Customer("Sudina","Ranjitkar"))
        return "Done"
    }

    @RequestMapping("/findAll")
    fun findAll()=repository.findAll()

    @RequestMapping("/findById/{id}")
    fun findById(@PathVariable id:Long)=repository.findOne(id)

    @RequestMapping("/findByLastName/{lastName}")
    fun findBylastname(@PathVariable lastName:String)=repository.findByLastName(lastName)

}