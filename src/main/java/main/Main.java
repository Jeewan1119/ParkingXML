package main;

import residentInfo.Resident;
import residentInfo.Vehicle;
import service.ToDatabase;
import service.ToDoList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Resident resident = new Resident();
        Vehicle vehicle = new Vehicle();
        ToDoList toDoList = new ToDoList();
        ToDatabase toDatabase = new ToDatabase();

        toDoList.residentInfo(scanner,resident);
        toDoList.vehicleInfo(scanner,vehicle);
        toDoList.display(resident,vehicle);
        toDatabase.execute(resident,vehicle);

        scanner.close();
    }
}