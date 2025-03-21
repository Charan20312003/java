public class Country {
    String countryName;
    State refState; 

    public Country(String countryName, State refState) {
        this.countryName = countryName;
        this.refState = refState;
    }

    public void displayCountry() {
        System.out.println("Country: " + countryName);
        refState.displayState();
    }
}
