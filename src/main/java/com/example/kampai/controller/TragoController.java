package com.example.kampai.controller;

import com.example.kampai.domain.model.Trago;
import com.example.kampai.domain.service.TragoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TragoController {
    @Autowired
    public TragoService tragoService;

    @GetMapping("/Tragos")
    public Page<Trago> getAll(Pageable pageable){
        Page<Trago> tragosPage = tragoService.getAll(pageable);
        return tragosPage;
    }
}
