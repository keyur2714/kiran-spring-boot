package com.dbdemo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbdemo.demo.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

}
