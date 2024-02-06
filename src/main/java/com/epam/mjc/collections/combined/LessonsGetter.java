package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        HashSet<String> lessons = new HashSet<>();
        Set<String> keys = timetable.keySet();

        for (String item : keys) {
            lessons.addAll(timetable.get(item));
        }
        return lessons;
    }
}
