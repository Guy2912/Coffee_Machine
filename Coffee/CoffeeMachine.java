package Coffee;

interface CoffeeMachineInterface{
    void makeEspresso();
    void makeLatte();
    void makeCappuccino();
    int takeMoney();
    void fillwater(int water);
	void fillmilk(int milk);
    void fillbeans(int coffeeBeans);
    void fillcups(int cups);
}

public class CoffeeMachine implements CoffeeMachineInterface {
    private int water;
    private int milk;
    private int coffeeBeans;
    private int cups;
    private int money;

    public CoffeeMachine(int water, int milk, int coffeeBeans, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.cups = cups;
        this.money = money;
    }

    public void makeEspresso() {
        if (this.water >= 250 && this.coffeeBeans >= 16 && this.cups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            this.water -= 250;
            this.coffeeBeans -= 16;
            this.cups--;
            this.money += 4;
        } else if (this.water < 250) {
            System.out.println("Sorry, not enough water!");
        } else if (this.coffeeBeans < 16) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (this.cups < 1) {
            System.out.println("Sorry, not enough cups!");
        }
    }

    public void makeLatte() {
        if (this.water >= 350 && this.milk >= 75 && this.coffeeBeans >= 20 && this.cups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            this.water -= 350;
            this.milk -= 75;
            this.coffeeBeans -= 20;
            this.cups--;
            this.money += 7;
        } else if (this.water < 350) {
            System.out.println("Sorry, not enough water!");
        } else if (this.milk < 75) {
            System.out.println("Sorry, not enough milk!");
        } else if (this.coffeeBeans < 20) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (this.cups < 1) {
            System.out.println("Sorry, not enough cups!");
        }
    }

    public void makeCappuccino() {
        if (this.water >= 200 && this.milk >= 100 && this.coffeeBeans >= 12 && this.cups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            this.water -= 200;
            this.milk -= 100;
            this.coffeeBeans -= 12;
            this.cups--;
            this.money += 6;
        } else if (this.water < 200) {
            System.out.println("Sorry, not enough water!");
        } else if (this.milk < 100) {
            System.out.println("Sorry, not enough milk!");
        } else if (this.coffeeBeans < 12) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (this.cups < 1) {
            System.out.println("Sorry, not enough cups!");
        }
    }
    public String toString() {
        return String.format("The coffee machine has:\n%d of water\n%d of milk\n%d of coffee beans\n%d of disposable cups\n$%d of money", water, milk, coffeeBeans, cups, money);
    }
    public int takeMoney() {
        return money;
    }
    public void fillwater(int water) {
        this.water += water;
    }
    public void fillmilk(int milk){
        this.milk += milk;
    }
    public void fillbeans(int coffeebeans){
        this.coffeeBeans += coffeebeans;
    }
    public void fillcups(int cups){
        this.cups += cups;
    }
}