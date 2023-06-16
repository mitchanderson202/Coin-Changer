import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        short change;   

        do {
            System.out.printf("Enter the change amount: ");
            try {
                change = scanner.nextShort();
                if(change > 0 && change < 32000)
                {
                    break;
                } else {
                    System.out.printf("Invalid input, please enter a NUMBER great than 0: ");
                }
            } catch (Exception e) {
                System.out.printf("Invalid input, please enter a NUMBER great than 0: ");
                scanner.nextLine();
            }
        } while (true);

        Fifty fifty = new Fifty();
        short numOfFifty = fifty.fiftyCoins(change);
        change -= numOfFifty * 50;

        Twenty twenty = new Twenty();
        short numOfTwenty = twenty.twentyCoins(change);
        change -= numOfTwenty * 20;

        Ten ten = new Ten();
        short numOfTen = ten.tenCoins(change);
        change -= numOfTen * 10;
            
        Five five = new Five();
        short numOfFive = five.fiveCoins(change);
        change -= numOfFive * 5;


            short coins = (short)(numOfFifty + numOfTwenty + numOfTen + numOfFive);

            System.out.println("You need " + coins + " coins!");
            System.out.println("You need " + numOfFifty + " 50c coins!");
            System.out.println("You need " + numOfTwenty + " 20c coins!");
            System.out.println("You need " + numOfTen + " 10c coins!");
            System.out.println("You need " + numOfFive + " 5c coins!");

        
            scanner.close();
        
    }
}
