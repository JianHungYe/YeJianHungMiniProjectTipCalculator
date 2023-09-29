import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //Gather data

        System.out.println("Welcome to Tip Calculator. \n\nEnter your total bill please:");
        double bill = scan.nextDouble();
        System.out.println("\nEnter your tip percentage as a whole number.");
        double percentage = scan.nextDouble();
        System.out.println("\nEnter the total amount of people at your table.");
        int people = scan.nextInt();

        // Calculation

        double decimalPercentage = percentage * 0.01;
        double totalTip = (Math.round(bill * decimalPercentage * 100.0)) / 100.0;
        double personalTip = (Math.round(totalTip / people *100.0)) /100.0;

        // Displaying results

        System.out.println("\nBill: $" + bill + "\nTip Percent: " + percentage + "%\nPeople: " + people);
        System.out.println("\nSplit evenly, the tip per person is $" + personalTip);
        System.out.println("The total tip of the table is $" + totalTip);
    }
}

