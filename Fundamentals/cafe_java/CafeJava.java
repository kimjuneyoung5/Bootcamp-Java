public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.8;
        double latte = 3.7;
        double cappucino = 4.2;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
        
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
            System.out.println(displayTotalMessage + dripCoffeePrice);
        }
        else if (isReadyOrder1 == false) {
            System.out.println(customer1 + pendingMessage);
        }
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappucino);
        }
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
            double total = latte + latte;
            System.out.println(displayTotalMessage + total);
        }
        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
            double difference = latte - dripCoffeePrice;
            System.out.println("You need to pay " + difference);
        }
        // Example:
        //System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
    }
}
