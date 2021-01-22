package com.example.demogemfireclient;

import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, String> {
    Iterable<Contact> findAllByName(String name);
}
