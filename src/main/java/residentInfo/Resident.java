package residentInfo;

        /*Write a java Program for Car Parking lot of Housing Apartment:

                Background of car parking systems, in housing apartment there are 2 type of parking level one for 4 wheeler another for 2 wheeler.
                Now we have to write a java program where residents will register their respective 4 wheeler and 2 wheeler for the parking.

                Save the resident information to Database with parking information.
                Resident details like, 'name', 'email', 'flatNumber', 'mobileNumber', 'vechicleInfo'. Under vehicleInfo, ‘type’ and ‘registrationNumber’.

                Few Validation need to be,
                1. Phone number should be in the length of 10. If fails error message will be thrown as the "Mobile Number is invalid please enter again"
                2. Vehicle details like 4 wheeler or 2 wheeler with valid registration number (need to keep validation here, registration number should not be more than 8 character).
                If fails error message will be thrown as the "Please provide valid registration number"

                Create a hibernate xml application

                create 2 table name "Resident" and "Vehicle". Resident table will be connected with Vehicle table in OneToOne relationship.*/


public class Resident {
    private int residentId;

    private String name;
    private String email;
    private int flatNumber;
    private long phoneNum;

    public int getResidentId() {
        return residentId;
    }

    public void setResidentId(int residentId) {
        this.residentId = residentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }
}