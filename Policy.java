public class Policy { // Begin Policy Class

    int policyNumber;
    String providerName;
    String firstName;
    String lastName;
    int age;
    String smokingStatus;
    float height;
    float weight;

    // No-arg Constructor
    public Policy() {
        this.policyNumber = 0;
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokingStatus = "";
        this.height = 0.0f;
        this.weight = 0.0f;
    }
    // Overloaded Constructor---Fully inits our object
    public Policy(int policyNumber, String providerName, String firstName, String lastName, int age, String smokingStatus, float height, float weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }
    public double calcBmi() {
        return (this.weight * 703) / (Math.pow(this.height, 2));
    }
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }
    public int getPolicyNumber() {
        return this.policyNumber;
    }
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
    public String getProviderName() {
        return this.providerName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }
    public String getSmokingStatus() {
        return this.smokingStatus;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getHeight() {
        return this.height;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public float getWeight() {
        return this.weight;
    }

} // End Policy Class


