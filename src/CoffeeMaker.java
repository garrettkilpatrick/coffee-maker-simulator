import java.util.Scanner;

public class CoffeeMaker {
    //I chose static over instance fields for ease of access in methods.
    protected static int dollars = 550;
    protected static int water = 400;
    protected static int milk = 540;
    protected static int beans = 120;
    protected static int cups = 9;
    protected static int usedCups = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //While loop repeats the program until user decides to exit.
        while(true) {
            System.out.println("Write action (buy, fill, take, clean, remaining, exit):");
            String action = scanner.nextLine();
            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    makerStats();
                    break;
                case "clean":
                    clean();
                    break;
                case "exit":
                    return;
            }
        }
    }
    //Method for "cleaning" the coffee maker.
    private static void clean() {
        System.out.println("I have been cleaned!");
        usedCups = 0;
    }

    //Method that provides statistics for the coffee maker.
    private static void makerStats() {
        System.out.println("The coffee maker has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + dollars + " of money");
    }

    //Method for the buying process. It calls the methods from the CoffeeMaker subclasses.
    private static void buy() {
        if (usedCups == 10) {
            System.out.println("I need cleaning!");
            return;
        }
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String coffee = scanner.nextLine();
        if (coffee.equals("back")) {
            return;
        } else {

            int coffeeChoice = Integer.parseInt(coffee);
            switch(coffeeChoice) {
                case 1:
                    Espresso espresso = new Espresso();
                    espresso.buyEspresso();
                    break;
                case 2:
                    Latte latte = new Latte();
                    latte.buyLatte();
                    break;
                case 3:
                    Cappuccino cappuccino = new Cappuccino();
                    cappuccino.buyCappuccino();
                    break;
            }
        }
    }

    //Method for filling up the coffee maker with supplies.
    private static void fill() {
        System.out.println("Write how many ml of water you want to add:");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        beans += scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        cups += scanner.nextInt();
        scanner.nextLine(); //clearing the buffer
    }

    //Method for taking all money out of the coffee maker.
    private static void take() {
        System.out.println("I gave you $" + dollars);
        dollars = 0;
    }
}

//The 3 subclasses of CoffeeMaker include the process for making each type of coffee.
class Espresso extends CoffeeMaker {
    public void buyEspresso() {
        if (water < 250) {
            System.out.println("Sorry, not enough water!");
        } else if (beans < 16) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (cups < 1) {
            System.out.println("Sorry, not enough disposable cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 250;
            beans -= 16;
            cups -= 1;
            dollars += 4;
            usedCups += 1;
        }
    }
}

class Latte extends CoffeeMaker {
    public void buyLatte() {
        if (water < 350) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < 75) {
            System.out.println("Sorry, not enough milk!");
        } else if (beans < 20) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (cups < 1) {
            System.out.println("Sorry, not enough disposable cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 350;
            milk -= 75;
            beans -= 20;
            cups -= 1;
            dollars += 7;
            usedCups += 1;
        }
    }
}

class Cappuccino extends CoffeeMaker {
    public void buyCappuccino() {
        if (water < 200) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < 100) {
            System.out.println("Sorry, not enough milk!");
        } else if (beans < 12) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (cups < 1) {
            System.out.println("Sorry, not enough disposable cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 200;
            milk -= 100;
            beans -= 12;
            cups -= 1;
            dollars += 6;
            usedCups += 1;
        }
    }
}
