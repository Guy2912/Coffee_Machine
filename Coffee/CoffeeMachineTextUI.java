package Coffee;

import java.util.Scanner;

public class CoffeeMachineTextUI{ 
    private CoffeeMachineInterface coffeeMachine;
    private Scanner scanner;

    public CoffeeMachineTextUI() {
        this.coffeeMachine = new CoffeeMachine(800, 540, 120, 9, 0);
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;
        while (running) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();

            switch (action) {
                case "buy":
                    buyCoffee();
                    break;
                case "fill":
                    fillMachine();
                    break;
                case "take":
                    takeMoney();
                    break;
                case "remaining":
                    displayMachineStatus();
                    break;
                case "exit":
                    running = false;
                    break;
                default:
            }
        }
    }

    private void buyCoffee() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String selection = scanner.nextLine();

        switch (selection) {
            case "espresso":
                coffeeMachine.makeEspresso();
                break;
            case "latte":
                coffeeMachine.makeLatte();
                break;
            case "cappuccino":
                coffeeMachine.makeCappuccino();
                break;
            default:
                System.out.println("Invalid selection. Try again.");
        }
    }

    private void fillMachine() {
        System.out.println("Write how many ml of water you want to add:");
        int water = scanner.nextInt();
        coffeeMachine.fillwater(water);

        System.out.println("Write how many ml of milk you want to add:");
        int milk = scanner.nextInt();
        coffeeMachine.fillmilk(milk);

        System.out.println("Write how many grams of coffee beans you want to add:");
        int coffeeBeans = scanner.nextInt();
        coffeeMachine.fillbeans(coffeeBeans);

        System.out.println("Write how many disposable cups you want to add:");
        int cups = scanner.nextInt();
        coffeeMachine.fillcups(cups);
       
        System.out.println("complete");

    }

    private void takeMoney() {
        int money = coffeeMachine.takeMoney();
        System.out.printf("I gave you $%d\n", money);
    }

    private void displayMachineStatus() {
        System.out.println(coffeeMachine.toString());
    }

    public static void main(String[] args) {
        CoffeeMachineTextUI CoffeeMachinetextUI = new CoffeeMachineTextUI();
        CoffeeMachinetextUI.start();
    }
}