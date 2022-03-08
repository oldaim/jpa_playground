package com.jpa.jpa_playground.repository;

import com.jpa.jpa_playground.entity.Dummy;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DummyRepository extends JpaRepository<Dummy, Long> {
}
