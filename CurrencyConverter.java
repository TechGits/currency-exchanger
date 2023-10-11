// Ricki Angel's Version
public class CurrencyConverter {

    public static void main(String[] args) {
        double poundOverEuroRatio = 1.16;
        double euroOverPoundRatio = 0.86;

        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.println("\nBirkleys Bank PLC");
        System.out.println("-----------------\n");
             
        boolean finished = false;
        while (!finished) {
            System.out.println("Select your option:\n");
            System.out.println("   1 - Exchange pounds into euro");
            System.out.println("   2 - Exchange euro into pounds");
            System.out.println("   0 - Exit the program");
            System.out.println();
            System.out.print(  "> ");
            int choice = scan.nextInt();
            switch (choice) {
            case 1:
                System.out.print("Enter number of pounds to exchange into Euro: £");
                double userInputPounds = scan.nextDouble();

                double yourEuro = userInputPounds * euroOverPoundRatio;
                System.out.println("£" + userInputPounds + " gives you " +  "€"+yourEuro+" Euro.");
                break;
            case 2:
                System.out.print("Enter number of Euros to exchange into pounds: € ");
                double userInputEuro   = scan.nextDouble();
                double yourPounds = userInputEuro * euroOverPoundRatio;
                System.out.println("£" + userInputEuro + " gives you " +  "£"+yourPounds);
                break;
            case 0:
                finished = true;
                break;
            default:
                System.out.println("Sorry, that is not a valid option");
            }
        }
        System.out.println("Thank you for banking with Birkleys.");
    }
}
