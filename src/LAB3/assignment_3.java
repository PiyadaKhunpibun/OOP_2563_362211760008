package LAB3;

import java.util.Scanner;

public class assignment_3 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int count = 0;

        while (count<3){
            System.out.print("Username : ");
            String user = cn.nextLine();

            System.out.print("Password : ");
            String pass = cn.nextLine();
            if(user.equals("admin") && pass.equals("saiyai")){
                System.out.println("Welcome to MT Website.");
                break;
            }
            else {
                System.out.println("username or password not correct.");
                count++;
            }
            if (count<3){
                System.out.println("You account has been locked. \n" + "Please, contect admin.");
            }
        }
    }
}
