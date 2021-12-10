package com.example.demo.Repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.ContactEntity;

public interface ContactRepository extends JpaRepository<ContactEntity, Serializable>
{

}
