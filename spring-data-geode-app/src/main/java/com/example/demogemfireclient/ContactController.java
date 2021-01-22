package com.example.demogemfireclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ContactController {

    @Autowired ContactRepository contactRepository;

    @PostMapping("/contact")
    public boolean addContact(@RequestBody Contact contact){
        contactRepository.save(contact);
        return true;
    }

    @GetMapping("/contacts")
    public Iterable<Contact> getAllContacts(){
        return contactRepository.findAll();
    }

    @GetMapping("/contact/{id}")
    public Optional<Contact> getContactById(@PathVariable String id){
        return contactRepository.findById(id);
    }

    @GetMapping("/contact/find/{name}")
    public Iterable<Contact> getContactsByName(@PathVariable String name){
        return contactRepository.findAllByName(name);
    }

}
