public class GovernmentRunner {
    public static void main(String[] args) {
        
        String citizenName = "Rahul Sharma";
        int citizenAge = 30;
        String officeName = "Central Government Office";

       
        Citizen citizen = new Citizen(citizenName, citizenAge);
        VerificationOffice verificationOffice = new VerificationOffice();
        TaxDepartment taxDepartment = new TaxDepartment();
        PoliceClearance policeClearance = new PoliceClearance();
        PassportOffice passportOffice = new PassportOffice();
        GovernmentOffice governmentOffice = new GovernmentOffice(officeName, verificationOffice, taxDepartment, policeClearance, passportOffice);

        
        governmentOffice.processPassportApplication(citizen);
    }
}
