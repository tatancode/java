/*
 * This program will calculate the monthly car payment
 * a user should expect to make after taking out a car
 * loan
 */
public class CarLoan {
    public static void main(String[] args) {
        //1
        int carLoan = 10000;

        //2
        int loanLength = 3; //years

        //3
        int interestRate = 5;

        //4
        int downPayment = 2000;

        //5
        if(carLoan <= 0 || interestRate <= 0){
            //6
            System.out.println("Error: Loan amount and interest rate should be greater than 0");
        } else if(downPayment >= carLoan){ //7
            //8
            System.out.println("The car can be paid in full.");
        }
        else{
            //9 and 10
            int remainingBalance = carLoan - downPayment;
            // 11
            int months = loanLength * 12;
            //12
            int monthlyBalance = remainingBalance / months;
            // 13
            int interest = monthlyBalance * interestRate / 100;
            //14
            int monthlyPayment = monthlyBalance + interest;
            // 15
            System.out.println(monthlyPayment);
        }
    }
}