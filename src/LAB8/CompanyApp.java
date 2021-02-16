package LAB8;

import LAB7.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args) {

        Employee emp1 = new Employee();

        ArrayList<Employee> myEmployee = new ArrayList<Employee>();
        for (int i = 0; i < 3; i++){
            //input data to object
            System.out.println("Please, enter Employee info "+(i+1)+":");
            Employee e = inputDataObject();
            myEmployee.add(e);
            displayObject(myEmployee);
        }

        //display object data
        System.out.println(emp1.toString());


    }//main

    private static Employee inputDataObject() {
        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();
        System.out.print("Enter Employee emp: ");
        String id = sc.nextLine();
        e.setEmpID(id);

        System.out.print("Enter Employee Position: ");
        e.setPosition(sc.nextLine());

        System.out.print("Enter Employee Salary: ");
        e.setSalary(sc.nextInt());
        return e;
    }

    private static void displayObject(ArrayList<Employee> myEmployee) {
        System.out.println("All objects in Arraylist");
        for (Employee e:myEmployee){
            System.out.println(e.toString());
        }
    }
}
