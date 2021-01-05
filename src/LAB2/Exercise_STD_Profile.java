package LAB2;

import java.util.Scanner;

public class Exercise_STD_Profile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("FullName : ");
        String fullname = sc.nextLine();

        System.out.print("ID : ");
        String std_id = sc.nextLine();

        System.out.print("Age : ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Tel : ");
        String tel = sc.nextLine();

        System.out.print("E-mail : ");
        String email = sc.nextLine();


        System.out.println("==================================");
        System.out.println("My name is : "+fullname);
        System.out.println("Id : "+std_id);
        System.out.println("I'm "+age+" Years Old");
        System.out.println("Tel : "+tel);
        System.out.println("E-mail : "+email);

    }
}
