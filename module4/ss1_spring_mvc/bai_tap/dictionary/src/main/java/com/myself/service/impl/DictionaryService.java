package com.myself.service.impl;

import org.springframework.stereotype.Service;


import com.myself.service.IDictionaryService;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryService implements IDictionaryService {
    private Map<String,String> dictionary = new HashMap<>();


    @Override
    public String findWord(String word) {
        return null;
    }
}
