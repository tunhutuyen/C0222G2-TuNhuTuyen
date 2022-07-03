package com.myself.management_phone.service;

import com.myself.management_phone.model.Smartphone;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class SmartphoneService implements ISmartphoneService{

    @Autowired
    private ISmartphoneRe
    @Override
    public Iterable<Smartphone> findAll() {
        return null;
    }

    @Override
    public Optional<Smartphone> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Smartphone save(Smartphone smartPhone) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
