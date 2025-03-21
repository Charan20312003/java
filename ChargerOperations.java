public class ChargerOperations {
    static int chargerCount = 0;
    static boolean isAvailable = true;
    static int chargingTime = 30;
    static double chargingCost = 5.0;
    static String userName = "John Doe";
    static int chargerId = 101;

    public static void chargerAvailable() {
        System.out.println("A charger is now available.");
        chargerCount++;
        isAvailable = true;
        System.out.println("Total Chargers Available: " + chargerCount);
    }

    public static void chargerUsed() {
        System.out.println(userName + " is using Charger ID: " + chargerId);
        if (chargerCount > 0 && isAvailable) {
            chargerCount--;
            System.out.println("Charging in progress... Estimated Time: " + chargingTime + " minutes");
            System.out.println("Charging Cost: $" + chargingCost);
            System.out.println("Chargers Left: " + chargerCount);
            isAvailable = chargerCount > 0;
        } else {
            System.out.println("No Chargers Available.");
        }
    }

    public static void chargerLeft() {
        System.out.println(userName + " has finished charging and left.");
        chargerCount++;
        isAvailable = true;
        System.out.println("Charger Left. Chargers Available: " + chargerCount);
    }

    public static void updateChargingTime(int newTime) {
        chargingTime = newTime;
        System.out.println("Updated Charging Time: " + chargingTime + " minutes");
    }

    public static void updateChargingCost(double newCost) {
        chargingCost = newCost;
        System.out.println("Updated Charging Cost: $" + chargingCost);
    }

    public static void assignUser(String newUser, int newChargerId) {
        userName = newUser;
        chargerId = newChargerId;
        System.out.println("User Assigned: " + userName + " | Charger ID: " + chargerId);
    }
}
