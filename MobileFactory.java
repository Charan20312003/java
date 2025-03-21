class MobileFactory {
    public static void main(String[] args) {
        System.out.println(" Starting Mobile Phone Manufacturing Process...");

        Design.createDesign();
        ComponentAssembly.assembleComponents();
        SoftwareInstallation.installSoftware();
        QualityCheck.inspectPhone();
        Packaging.packPhone();

        System.out.println(" Mobile Phone Manufacturing Process Completed Successfully!");
    }
}
