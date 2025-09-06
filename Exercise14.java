import java.util.Scanner;
public class Exercise14 {
    public static void menu(){

        System.out.println("----Menu----");
        System.out.println("1. Coca");
        System.out.println("2. Pepsi");
        System.out.println("3. Sprite");
        System.out.println("4. Snack");
        System.out.println("5. Shutdown Machine");
        System.out.println("Please enter the number: ");
    }

    public static double itemPrice(int item){
        switch (item){
            case 1:
                System.out.print("The price of Coca is: 2$. Please enter your money: ");
                return 2.0;
            case 2:
                System.out.print("The price of Pepsi is: 1$. Please enter your money: ");
                return 1.0;
            case 3:
                System.out.print("The price of Sprite ia: 3$. Please enter your money: ");
                return 3.0;
            case 4:
                System.out.print("The price of Snack is: 5$. Please enter your money: ");
                return 5.0;
            case 5:
                System.out.print("Machine is shutting down.");
                return 0.0;
            default:
                System.out.println("Please enter a valid number: ");
                return -1.0;
        }

    }

    public static void moneyChange (double price, double money){

        if (money >= price){
            money -= price;
            System.out.println("Your change is: " + money);
        }
        else{
            System.out.println("Not enough money to buy this item. Please select again. ");
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while (true){

            menu();
            int item = sc.nextInt();
            double price = itemPrice(item);

            if (price == 0.0) break;
            if (price == -1.0) continue;

            double money = sc.nextDouble();
            moneyChange(price, money);
        }
        sc.close();
    }
}
