public class GovernmentOffice {
    String officeName;
    VerificationOffice verificationOffice;
    TaxDepartment taxDepartment;
    PoliceClearance policeClearance;
    PassportOffice passportOffice;

    public GovernmentOffice(String officeName, VerificationOffice verificationOffice, TaxDepartment taxDepartment, PoliceClearance policeClearance, PassportOffice passportOffice) {
        this.officeName = officeName;
        this.verificationOffice = verificationOffice;
        this.taxDepartment = taxDepartment;
        this.policeClearance = policeClearance;
        this.passportOffice = passportOffice;
    }

    public void processPassportApplication(Citizen citizen) {
        System.out.println(officeName + " is processing the passport application.");
        citizen.applyForPassport();
        verificationOffice.verifyDocuments(citizen);
        taxDepartment.checkTaxStatus(citizen);
        policeClearance.checkCriminalRecord(citizen);
        passportOffice.issuePassport(citizen);
        System.out.println("Passport application process completed for " + citizen.name);
    }
}
