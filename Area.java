public class Area {
    String areaName;
    Street refStreet; 

    public Area(String areaName, Street refStreet) {
        this.areaName = areaName;
        this.refStreet = refStreet;
    }

    public void displayArea() {
        System.out.println("Area: " + areaName);
        refStreet.displayStreet();
    }
}
