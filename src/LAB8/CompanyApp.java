package LAB8;

public class CompanyApp {
    public static void main(String[] args) {

        Employee emp1 = new Employee();

        emp1.setPid("1809900840125");
        emp1.setName("Piyada Khunpibun");
        emp1.setAge(23);
        emp1.setGender("Female");
        emp1.setTel("0897457455");

        emp1.setEmpID("emp001");
        emp1.setPosition("Programmer");
        emp1.setSalary(30000.00);

        //display object data
        System.out.println(emp1.toString());

    }//main
}
