class MobileFactory1 {
    public static void main(String[] args) {
        System.out.println("Starting Mobile Phone Manufacturing Process...");

        Design.createDesign();
        ComponentAssembly.assembleComponents();
        SoftwareInstallation.installSoftware();
        QualityCheck.inspectPhone();
        Packaging.packPhone();

        System.out.println("Mobile Phone Manufacturing Process Completed Successfully!");
    }
}

class Design {
    public static void createDesign() {
        System.out.println("Step 1: Phone design is finalized.");
    }
}

class ComponentAssembly {
    public static void assembleComponents() {
        System.out.println("Step 2: Components (Processor, Camera, Battery) are assembled.");
    }
}

class SoftwareInstallation {
    public static void installSoftware() {
        System.out.println("Step 3: Operating System and apps are installed.");
    }
}

class QualityCheck {
    public static void inspectPhone() {
        System.out.println("Step 4: Mobile phone has passed quality inspection.");
    }
}

class Packaging {
    public static void packPhone() {
        System.out.println("Step 5: Mobile phone is packed and ready for shipment.");
    }
}
