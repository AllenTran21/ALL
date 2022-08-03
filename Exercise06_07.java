package chapter6;
import java.util.Scanner;
public class Exercise06_07 {

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        double futureInvestmentValue = investmentAmount * years;
        return futureInvestmentValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The amount invested: ");
        double investmentAmount = input.nextDouble();
        System.out.println("Annual interest rate: ");
        double monthlyInterestRate = input.nextDouble() / 12;
        
        
        int i;
        //for (i = 0; i < 30; i++){
            
        //}
    }
}
