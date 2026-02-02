package service;

import dao.RecommendationDAO;
import java.util.List;

// service layer
public class RecommendationService {

    RecommendationDAO dao = new RecommendationDAO();

    public void processRecommendation(String interest) {

        List<String> items = dao.fetchData(interest);

        System.out.println("\nRecommended Items:");

        for (String item : items) {
            System.out.println("- " + item);
        }
    }
}
