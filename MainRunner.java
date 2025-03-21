public class MainRunner {
    public static void main(String[] args) {
        ChargerOperations.chargerAvailable();
        ChargerOperations.assignUser("Alice", 202);
        ChargerOperations.updateChargingTime(45);
        ChargerOperations.updateChargingCost(7.5);
        ChargerOperations.chargerUsed();
        ChargerOperations.chargerLeft();
    }
}
