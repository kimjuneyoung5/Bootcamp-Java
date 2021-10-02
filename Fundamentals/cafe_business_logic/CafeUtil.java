import java.util.ArrayList;
public class CafeUtil {
    public void militaryHoursTest() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 24; i++) {
            arr.add(i);
            System.out.println(i);
        }
    }

    public void specialsAlert() {
        for (int j = 6; j < 16; j++) {
            if (j % 3 == 0) {
                System.out.println("Buy one get one free for the next 15 minutes!");
            }
            else {
                System.out.println("Stay tuned for deals announced throughout the day.");
            }
        }
    }

    public Integer leadsAtDay10() {
        int sum = 0;
        for (int k = 1; k < 11; k++) {
            sum += k;
        }
        return sum;
    }

    public void displayMenu(String[] menu) {
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
    }
    
    public double getOrderTotal(double[] items) {
        double sum = 0;
        for (int i = 0; i < items.length; i++) {
            sum += items[i];
        }
        return sum;
    }

    public double getHighestPrice(double[] items) {
        double highestPrice = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] > highestPrice) {
                highestPrice = items[i];
            }
        }
        return highestPrice;
    }
}