import java.util.*;
public class App {
    public static double calculateFutureValue(double presentValue, double rate, int years) {
        // Base case
        if (years == 0) {
            return presentValue;
        }
        // Recursive case
        return (1 + rate) * calculateFutureValue(presentValue, rate, years - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter present value : ");
        double presentValue = sc.nextDouble();
        System.out.println("Enter growth rate : ");
        double growthRate = sc.nextDouble();   
        System.out.println("Enter years");
        int years = sc.nextInt(); 
        sc.close();       

        double futureValue = calculateFutureValue(presentValue, growthRate, years);
        System.out.printf("Future Value after %d years: %.2f\n", years, futureValue);
    }
}

