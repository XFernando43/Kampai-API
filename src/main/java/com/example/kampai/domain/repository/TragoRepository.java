package com.example.kampai.domain.repository;

import com.example.kampai.domain.model.Trago;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TragoRepository extends JpaRepository<Trago,Long> {
    public Optional<Trago> findByTitle(String name);
}
