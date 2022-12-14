package com.example.kampai.domain.service;

import com.example.kampai.domain.model.Trago;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface TragoService {
    Page getAll(Pageable pageable);
    Trago createTrago(Trago trago);
    Trago getById(Long id);
    Trago UpdateTrago(Long id, Trago trago);
    ResponseEntity<?> deleteTrago(Long id);
}
