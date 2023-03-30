package service;

import residentInfo.Resident;
import residentInfo.Vehicle;

import java.util.Scanner;

public class ToDoList {
    /**
     * This method is used for taking all the required inputs of resident and does validation for phone number
     * which must be 10 digits.
     * @param scanner
     * @param resident
     */
    public void residentInfo(Scanner scanner, Resident resident) {
        System.out.println("Enter your name::");
        String name = scanner.nextLine();
        resident.setName(name);
        System.out.println("Enter your email address::");
        String email = scanner.nextLine();
        resident.setEmail(email);
        System.out.println("Enter your flat number::");
        int flatNum = scanner.nextInt();
        resident.setFlatNumber(flatNum);
        int count = 0;
        do {
            System.out.println("Enter your mobile number::");
            long mobile = scanner.nextLong();

            if (checkMobile(mobile)) {
                resident.setPhoneNum(mobile);
                break;

            } else {
                count++;
                System.err.println("try-again");
            }

        } while (count < 3);
    }

    /**
     * This method validates if the phone number is correct or not and returns true or false to the method which
     * takes the phone number
     * @param mobile
     * @return
     */
    private boolean checkMobile(long mobile) {
        String molieToString = String.valueOf(mobile);
        if (molieToString != null && molieToString.length() == 10) {
            return true;
        }
        return false;
    }

    /**
     * This method takes the input of vehicle information and has a validation of registration number
     * @param scanner
     * @param vehicle
     */

    public void vehicleInfo(Scanner scanner, Vehicle vehicle) {
        System.out.println("choose '1' for two-wheeler and '2' for 4 wheeler vehicle:: ");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                vehicle.setRegistrationType("2 wheeler");
                break;
            case 2:
                vehicle.setRegistrationType("4 wheeler");
                break;
        }

        System.out.println("The number should not be more than 8 digits");
        System.out.println("Enter your registration number ::");
        int reg = scanner.nextInt();
        if (checkRegistration(reg)) {
            vehicle.setRegistrationNumber(reg);
        }

    }

    /**
     * This method validates if the given registration number is less than 8 or equal to digits
     * @param reg
     * @return
     */
    private boolean checkRegistration(int reg) {
        String regToString = String.valueOf(reg);
        if (regToString.length() <= 8) {
            return true;
        }
        return false;

    }

    /**
     * This method displays the information on resident and vehicle
     * @param resident
     * @param vehicle
     */
    public void display(Resident resident, Vehicle vehicle) {
        System.out.println("Please review the information you have entered" +
                "\n name:: " + resident.getName() +
                "\n email address:: " + resident.getEmail() +
                "\n flat number::" + resident.getFlatNumber() +
                "\n mobile number ::" + resident.getPhoneNum() +
                "\n type of Vehicle::" + vehicle.getRegistrationType() +
                "\n registration number ::" + vehicle.getRegistrationNumber());

    }
}
