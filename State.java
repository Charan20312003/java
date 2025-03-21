public class State {
    String stateName;
    City refCity; 

    public State(String stateName, City refCity) {
        this.stateName = stateName;
        this.refCity = refCity;
    }

    public void displayState() {
        System.out.println("State: " + stateName);
        refCity.displayCity();
    }
}
