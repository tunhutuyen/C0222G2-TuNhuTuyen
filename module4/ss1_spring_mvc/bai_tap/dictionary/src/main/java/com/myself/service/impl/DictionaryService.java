package com.myself.service.impl;

import org.springframework.stereotype.Service;


import com.myself.service.IDictionaryService;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Service
public class DictionaryService implements IDictionaryService {
    private static Map<String,String> dictionary = new HashMap<>();

    static{
        dictionary.put("dog","con chó");
        dictionary.put("cat","con mèo");
        dictionary.put("chicken","con gà");
        dictionary.put("buffalo","con trâu");
        dictionary.put("hello","xin chào");
        dictionary.put("sunrise","ánh nắng");
    }

    @Override
    public String findWord(String word) {
        if (dictionary.containsKey(word)){
            return dictionary.get(word);
        }
        return "Không tìm thấy";
    }

}
