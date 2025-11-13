import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ExternalJavaPaper {
    public static void main(String[] args) {

        Map<String, List<String>> cardMap = new HashMap<>();

        String[] symbols = {"Spade", "Heart", "Diamond", "Club"};
        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (String symbol : symbols) {
            List<String> list = new ArrayList<>();
            for (String value : values) {
                list.add(value + " of " + symbol);
            }
            cardMap.put(symbol.toLowerCase(), list);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a card symbol to search (Spade / Heart / Diamond / Club): ");
        String userSymbol = sc.nextLine().toLowerCase();

        if (cardMap.containsKey(userSymbol)) {
            System.out.println("\nCards found in " + userSymbol.toUpperCase() + " :");
            List<String> result = cardMap.get(userSymbol);
            for (String card : result) {
                System.out.println(card);
            }
        } else {
            System.out.println("Invalid symbol! Try again.");
        }
    }
}
