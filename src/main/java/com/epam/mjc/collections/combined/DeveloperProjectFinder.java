package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        ArrayList<String> developerProjects = new ArrayList<>();
        Set<String> keys = projects.keySet();
        for (String item : keys) {
            if (projects.get(item).contains(developer)) {
                developerProjects.add(item);
            }
        }

        developerProjects.sort((p1, p2) -> {
            int lengthComparison = Integer.compare(p2.length(), p1.length());
            if (lengthComparison != 0) {
                return lengthComparison;
            } else {
                return p2.compareTo(p1);
            }
        });
        return developerProjects;
    }


}
