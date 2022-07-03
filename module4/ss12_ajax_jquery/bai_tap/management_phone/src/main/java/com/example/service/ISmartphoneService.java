package com.example.service;

import com.example.model.Smartphone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


public interface ISmartphoneService {

    Page<Smartphone> findAllPage(Pageable pageable);

    Smartphone save(Smartphone smartphone);

    Optional<Smartphone> findById(Long id);

    void remove(Long id);
}
