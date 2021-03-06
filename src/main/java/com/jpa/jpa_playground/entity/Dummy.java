package com.jpa.jpa_playground.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
public class Dummy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
