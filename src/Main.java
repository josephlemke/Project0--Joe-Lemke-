import java.lang.invoke.StringConcatException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("What is the length of the deck ");
        double deckLength = Double.parseDouble(myScanner.nextLine());

        System.out.print("What is the width of the deck");
        double deckWidth = Double.parseDouble(myScanner.nextLine());

        System.out.print("What is the length of the board you are buying? ");
        double boardLength = Double.parseDouble(myScanner.nextLine());

        System.out.print("What is the width of the board you are buying? ");
        double boardWidth = Double.parseDouble(myScanner.nextLine());

        System.out.print("What is the price per board? ");
        double boardPrice = Double.parseDouble(myScanner.nextLine());

        double deckArea = deckWidth * deckLength;
        double boardSize = boardLength * boardWidth;
        double numberBoards = deckArea/boardSize;
        double totalPrice = numberBoards * boardPrice;
        double discountPrice = 0;

        if( totalPrice >= 2000 ){
            discountPrice = totalPrice * 0.15;
        }
        else if (totalPrice >= 1000){
           discountPrice = totalPrice * 0.10;
        }
        else {
             discountPrice = 0;
        }
        totalPrice -= discountPrice;

        System.out.print("What is estimated hours of work? ");
        double workHours = Double.parseDouble(myScanner.nextLine());

        System.out.print("What is the price of labor per hour? ");
        double laborPrice = Double.parseDouble(myScanner.nextLine());

        double estimatedLabor = workHours * laborPrice;

        System.out.print("Does the customer get a discount? (y or n)");
        String discountOption = myScanner.nextLine();

        double discountPercent = 0.0;

        if (discountOption.equalsIgnoreCase("y")){
            System.out.print("What is the discount? (use 0.0 format) ");
             discountPercent = Double.parseDouble(myScanner.nextLine());
             double discount = estimatedLabor * discountPercent;
             estimatedLabor -= discount;
        }
        System.out.print("The total costs of labor and supplies is $" + (estimatedLabor + totalPrice));

}  }