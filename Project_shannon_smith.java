import java.util.Scanner;

class Project_shannon_smith {
    public static float policyPrice(int age, String isSmoker, double bmi) {
        float fee = 600;

        if (age > 50) {
            fee += 75;
        }
        if (isSmoker.equalsIgnoreCase("smoker")) {
            fee += 100;
        }
        if (bmi > 35) {
            fee += (bmi - 35) * 20;
        }
        return fee;
    }
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the Policy Number: ");
        int policyNumber = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Please enter the Provider Name: ");
        String providerName = keyboard.nextLine();
        System.out.print("Please enter the Policyholder's First Name: ");
        String firstName = keyboard.nextLine();
        System.out.print("Please enter the Policyholder's Last Name: ");
        String lastName = keyboard.next();
        System.out.print("Please enter the Policyholders Age: ");
        int age = keyboard.nextInt();
        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        String smokingStatus = keyboard.next();
        System.out.print("Please enter the Policyholder's Height (in inches): ");
        float height = keyboard.nextFloat();
        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        float weight = keyboard.nextFloat();
        keyboard.close();
        Policy policyObj = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
        double bmi = policyObj.calcBmi();
        float policyPrice = policyPrice(policyObj.age, policyObj.smokingStatus, bmi);
        System.out.printf("\nPolicy Number: %s\n" + 
        "Provider Name: %s\n" + 
        "Policyholder's First Name: %s\n" + 
        "Policyholder's Last Name: %s\n" + 
        "Policyholder's Age: %d\n" + 
        "Policyholder's Smoking Status: %s\n" + 
        "Policyholder's Height: %.2f\n" + 
        "Policyholder's Weight: %.2f\n" + 
        "Policyholder's BMI: %.2f\n" + 
        "Policy Price: $%.2f\n", 
        policyObj.policyNumber, policyObj.providerName, policyObj.firstName, 
        policyObj.lastName, policyObj.age, policyObj.smokingStatus, 
        policyObj.height, policyObj.weight, bmi, policyPrice);

    }
}