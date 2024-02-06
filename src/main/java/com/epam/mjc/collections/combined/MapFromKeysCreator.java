package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        HashMap<Integer, Set<String>> numLength = new HashMap<>();
        Set<String> keys = sourceMap.keySet();

        for (String item: keys) {
            numLength.put(item.length(), new HashSet<String>());
        }

        for (String item : keys) {
            numLength.get(item.length()).add(item);
        }

        return numLength;
    }
}
