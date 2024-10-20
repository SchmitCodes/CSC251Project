import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

class Project_shannon_smith {
    /*
     * The policyPrice method determines the policy price
     * @param age How old the policy holder is
     * @param isSmoker Does the policy holder smoke
     * @param bmi Body mass index of the policy holder
     * @return fee Total price of the policy
     */
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
    public static void main(String[] args) throws IOException {
        // Array to hold policy objects
        ArrayList<Policy> polices = new ArrayList<Policy>();
        // Read the file and create new objs
        //File file = new File("Policyinformation.txt");
        File file = new File("Policyinformation.txt"); // Specify the path to your file here

        Scanner inputFile = new Scanner(file);

        String policyNumberString;
        int policyNumber;
        String providerName;
        String firstName;
        String lastName;
        String ageString;
        int age;
        String smokingStatus;
        String heightString;
        float height;
        String weightString; 
        float weight;

        while(inputFile.hasNext()) {
            // First line
            policyNumberString = inputFile.nextLine();
            policyNumber = Integer.parseInt(policyNumberString);
            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            ageString = inputFile.nextLine();
            age = Integer.parseInt(ageString);
            smokingStatus = inputFile.nextLine();
            heightString = inputFile.nextLine();
            height = Float.parseFloat(heightString);
            weightString = inputFile.nextLine();   
            weight = Float.parseFloat(weightString);
            if(inputFile.hasNext())
            { 
                System.out.print("\n");   
               inputFile.nextLine();//skip the blank line if we have not reached the end of the file
            }
            Policy policyObj = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
            polices.add(policyObj);
        }
        inputFile.close();
        int isSmoker = 0;
        for (Policy p : polices) {
            policyNumber = p.getPolicyNumber();
            providerName = p.getProviderName();
            String providerFirstName = p.getFirstName();
            String providerLastName = p.getLastName();
            age = p.getAge();
            smokingStatus = p.getSmokingStatus();
            if (smokingStatus.equals("smoker")) {isSmoker++;}
            height = p.getHeight();
            weight = p.getWeight();
            double bmi = p.calcBmi();
            float pPrice = policyPrice(age, smokingStatus, bmi);

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
            policyNumber, providerName, providerFirstName, 
            providerLastName, age, smokingStatus, 
            height, weight, bmi, pPrice);
            } // End for loop for display
            int nonSmoker = polices.size() - isSmoker;
            System.out.printf("\nThe number of policies with a smoker is: %d", isSmoker);
            System.out.printf("\nThe number of policies with a non-smoker is: %d", nonSmoker);


    } // end main
} // end class