package com.example.kampai.services;

import com.example.kampai.domain.model.Trago;
import com.example.kampai.domain.repository.TragoRepository;
import com.example.kampai.domain.service.TragoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TragoServiceImpl implements TragoService {

    @Autowired
    TragoRepository tragoRepository;
    @Override
    public Page getAll(Pageable pageable) {
       return tragoRepository.findAll(pageable);
    }

    @Override
    public Trago createTrago(Trago trago) {
        return null;
    }

    @Override
    public Trago getById(Long id) {
        return null;
    }

    @Override
    public Trago UpdateTrago(Long id, Trago trago) {
        return null;
    }

    @Override
    public ResponseEntity<?> deleteTrago(Long id) {
        return null;
    }


}
