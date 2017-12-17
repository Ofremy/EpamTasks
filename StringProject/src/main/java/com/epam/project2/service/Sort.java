package com.epam.project2.service;

import com.epam.project2.model.entity.Sentence;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Orest
 * 08.12.2017
 * Java Version 1.8.
 */
public class Sort {
    public static Map<Sentence, Integer> getSortResult(Map<Sentence, Integer> map) {
        return map
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

    }
}
