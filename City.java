public class City {
    String cityName;
    Area refArea; 

    public City(String cityName, Area refArea) {
        this.cityName = cityName;
        this.refArea = refArea;
    }

    public void displayCity() {
        System.out.println("City: " + cityName);
        refArea.displayArea();
    }
}
