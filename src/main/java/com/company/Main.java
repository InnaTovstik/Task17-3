package com.company;
//Добавить в карту Map<String, Integer> 10 записей.
//Поменять местами ключи и значения
// (создается новая карта, ключи становятся значениями,
// значения становятся ключами).

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Italy", 20);
        map.put("France", 25);
        map.put("Ukraine", 30);
        map.put("Germany", 40);
        map.put("Argentina", 15);
        map.put("Belgium", 22);
        map.put("Canada", 1);
        map.put("Egypt", 6);
        map.put("Hungary", 8);
        map.put("Spain", 12);
        System.out.println(map);
        System.out.println("Карта, у которой ключи становятся значениями, значения становятся ключами");
        Map<Integer, String> newMap = NewMap.newMap(map);
        System.out.println(newMap);
    }
}