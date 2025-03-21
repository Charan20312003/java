class CarFactory1 {
    public static void main(String[] args) {
        System.out.println(" Starting Car Manufacturing Process...");

        Design.createDesign();
        EngineAssembly.assembleEngine();
        BodyAssembly.buildBody();
        PaintShop.paintCar();
        QualityCheck.inspectCar();

        System.out.println(" Car Manufacturing Process Completed Successfully!");
    }
}

class Design {
    public static void createDesign() {
        System.out.println(" Car design is finalized!");
    }
}

class EngineAssembly {
    public static void assembleEngine() {
        System.out.println(" Engine assembly is complete!");
    }
}

class BodyAssembly {
    public static void buildBody() {
        System.out.println(" Car body has been built!");
    }
}

class PaintShop {
    public static void paintCar() {
        System.out.println(" Car has been painted!");
    }
}

class QualityCheck {
    public static void inspectCar() {
        System.out.println("Car has passed quality inspection!");
    }
}
