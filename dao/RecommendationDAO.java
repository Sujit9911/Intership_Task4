package dao;

import java.util.*;

// DAO layer - data + simple AI logic
public class RecommendationDAO {

    public List<String> fetchData(String interest) {

        Map<String, List<String>> data = new HashMap<>();

        // sample dataset
        data.put("tech", Arrays.asList("Laptop", "Headphones", "Smartphone"));
        data.put("sports", Arrays.asList("Football", "Cricket Bat", "Shoes"));
        data.put("music", Arrays.asList("Guitar", "Piano", "Microphone"));

        // return matching category
        return data.getOrDefault(interest.toLowerCase(),
                Arrays.asList("Book", "Bag", "Watch"));
    }
}
