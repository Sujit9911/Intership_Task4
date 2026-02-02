import controller.RecommendationController;
import java.util.Scanner;

// main class
public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RecommendationController controller = new RecommendationController();

        System.out.println("---- RECOMMENDATION SYSTEM ----");
        System.out.print("Enter your interest (tech / sports / music): ");
        String interest = sc.nextLine();

        controller.getRecommendations(interest);
    }
}
