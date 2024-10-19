public class Policy { // Begin Policy Class

    // Declaring Fields
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
    /*
     * The calcBmi method finds the Bmi of the policy holder
     * @return body mass index
     */
    }
    public double calcBmi() {
        return (this.weight * 703) / (Math.pow(this.height, 2));
    }
    /*
     * The setPolicyNumber method sets the policy number
     * @param policyNumber Policy number of the holder
     */
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }
    /*
     * The getPolicyNumber method gets the policy number that you set
     * @return Policy number of the holder
     */
    public int getPolicyNumber() {
        return this.policyNumber;
    }
    /*
     * The setProviderName method sets the proivders name
     * @param providerName The name of the insurance provider
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
    /*
     * The getProviderName method gets the providers name
     * @return The insurance providers name
     */
    public String getProviderName() {
        return this.providerName;
    }
    /* 
     * The setFirstName method sets the first name of the policy holder
     * @param firstName First name of the policy holder
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /*
     * The getFirstName method gets the first name of the policy holder
     * @return The first name of the policy holder
     */
    public String getFirstName() {
        return this.firstName;
    }
    /* 
     * The setLastName method sets the last name of the policy holder
     * @param lastName The last name of the policy holder
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /* 
     * The getLastName method gets the last name of the policy holder
     * @return The last name of the policy holder
     */
    public String getLastName() {
        return this.lastName;
    }
    /*
     * The setAge method sets the age of the policy holder
     * @param age The age of the policy holder
     */
    public void setAge(int age) {
        this.age = age;
    }
    /* 
     * The getAge method gets the age of the policy holder
     * @return The age of the policy holder
     */
    public int getAge() {
        return this.age;
    }
    /* 
     * The setSmokingStatus method sets the smoking status of the policy holder
     * @param smokingStatus The smoking status of the policy holder
     */
    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }
    /*
     * The getSmokingStatus method gets the smoking status of the policy holder
     * @return The smoking status of the policy holder
     */
    public String getSmokingStatus() {
        return this.smokingStatus;
    }
    /*
     * The setHeight method sets the height of the policy holder
     * @param height How tall the policy holder is
     */
    public void setHeight(float height) {
        this.height = height;
    }
    /* 
     * The getHeight method gets the height of the policy holder
     * @return The height of policy holder
     */
    public float getHeight() {
        return this.height;
    }
    /*
     * the setWeight method sets the weight of the policy holder
     * @param weight How much the policy holder weighs
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }
    /*
     * the getWeight method gets the weight of the policy holder
     * @return The weight of the policy holder
     */
    public float getWeight() {
        return this.weight;
    }

} // End Policy Class


