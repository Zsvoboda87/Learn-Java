import java.util.Scanner; 

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an operation: (add, substract, multiply, divide, or alphabetize)" );
        String op = input.next();
        op.toLowerCase();

        // if( op.equals("alphabetize")) {
           
        // }


        if( op.equals("add")) {
            System.out.println("Enter two integers:" );
            int a, b;
            a = input.nextInt();
            b = input.nextInt();
            System.out.println(a + b );
        } else if (op.equals("subtract")){
            System.out.println("Enter two integers:" );
            int a, b;
            a = input.nextInt();
            b = input.nextInt();
            System.out.println(a - b );
        } else if (op.equals("multiply")){
            System.out.println("Enter two doubles:" );
            double a, b;
            a = input.nextInt();
            b = input.nextInt();
            System.out.println(a * b );
        } else if (op.equals("divide")){
            System.out.println("Enter two doubles:" );
            double a, b;
            a = input.nextInt();
            b = input.nextInt();
            if(b == 0) {
                System.out.println("Invalid input entered. Terminating...");
            } else {
            System.out.println(a / b );}
        } else {
            System.out.println("Invalid input entered. Terminating...");
        }

    }
}
