import java.util.Scanner;

public class Addition {

    /**
     * Adds two integers and returns the result.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt(); 

        Addition calc = new Addition();
        int result = calc.add(a, b);

        System.out.println("Sum is: " + result);

        sc.close();  
    }
}