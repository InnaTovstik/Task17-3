package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NewMap {

    public static Map<Integer, String> newMap(Map<String, Integer> map) {
        Map<Integer, String> newMap = new HashMap<>();
        for (Entry<String, Integer> entry : map.entrySet()) {
            newMap.put(entry.getValue(), entry.getKey());
        }
        return newMap;
    }
}
