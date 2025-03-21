class CarFactory {
    public static void main(String[] args) {
        System.out.println("Starting Car Manufacturing Process");

        Design.createDesign();
        EngineAssembly.assembleEngine();
        BodyAssembly.buildBody();
        PaintShop.paintCar();
        QualityCheck.inspectCar();

        System.out.println("Car Manufacturing Process Completed Successfully");
    }
}
