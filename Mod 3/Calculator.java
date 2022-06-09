import java.util.Scanner; 

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("List of operations: add substract multiply divide alphabetize" );
        System.out.println("Enter an operation:");
        String op = input.next();
        op.toLowerCase();

        switch (op) {
        case  "add": 
            System.out.println("Enter two integers:" );
            int a, b;
            a = input.nextInt();
            b = input.nextInt();
            System.out.println("Answer: " + (a + b) );
            break;
        
        case "subtract":
            System.out.println("Enter two integers:" );
            int c, d;
            c = input.nextInt();
            d = input.nextInt();
            System.out.println("Answer: " + (c - d));
            break;

        case "multiply":
            System.out.println("Enter two doubles:" );
            double e, f, ff;
            e = input.nextDouble();
            f = input.nextDouble();
            ff = e * f;
            System.out.printf("Answer: %.2f", ff);
            break;
        
        case "divide":
            System.out.println("Enter two doubles:" );
            double g, h, hh;
            g = input.nextDouble();
            h = input.nextDouble();
            if(h == 0) {
                System.out.println("Invalid input entered. Terminating...");
            } else {
            hh =  g /h ;
            System.out.printf("Answer: %.2f", hh);}
            break;
     
        case "alphabetize":
            System.out.println("Enter two words:" );
            String i, j;
            i = input.next();
            j = input.next();
            String x = new String(i.toLowerCase());
            String y = new String(j.toLowerCase());

            if( x.compareTo(y) < 0) {
                System.out.println("Answer: " + i + " comes before " + j + " alphabetically");
            } else 
            if( x.compareTo(y) > 0) {
                System.out.println("Answer: " + j + " comes before " + i + " alphabetically");
            }
            else {
                System.out.println("Answer: Chicken or Egg.");
            }
           
            break;
        default:
            System.out.println("Invalid input entered. Terminating...");
        
    }
    }
}
