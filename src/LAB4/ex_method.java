package LAB4;

public class ex_method {

    public static void B(int num){ // no return type
        System.out.println("Hello B "+num);
    }//B

    public static void main(String[] args) {
        System.out.println("Hello Main");
        //call A()
        A();
        A();
        //call B()
        //B(num);
        //call C()
        //int result = C(x:5 , y:5);

    }//main

    public static void A (){  // no return type , no parameter
        //statement or method body
        System.out.println("Hello A");
    }//A

    public static int C (int x ,int y){
        System.out.println("Hello C");
        return  x + y;
    }//C
}
