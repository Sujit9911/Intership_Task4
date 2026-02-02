package controller;

import service.RecommendationService;

// controller layer
public class RecommendationController {

    RecommendationService service = new RecommendationService();

    // take request and call service
    public void getRecommendations(String interest) {
        service.processRecommendation(interest);
    }
}
