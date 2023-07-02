import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int balance = 5000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("ATM");
            System.out.println("1 for withdraw");
            System.out.println("2 for deposit");
            System.out.println("3 for Balance");
            System.out.println("4 for Quit");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter Money To Be Withdraw :");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Enter money to be deposited :");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance : " + balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);

            }

        }
    }

}
