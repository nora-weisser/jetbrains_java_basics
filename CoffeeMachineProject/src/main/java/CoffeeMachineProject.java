import java.util.Scanner;

public class CoffeeMachineProject {

    private static class CoffeeMachineState {

        private int water = 400;
        private int milk = 540;
        private int coffee = 120;
        private int cups = 9;
        private int money = 550;

        public CoffeeMachineState() {
        }

        public CoffeeMachineState(int water, int milk, int coffee, int cups, int money) {
            this.water = water;
            this.milk = milk;
            this.coffee = coffee;
            this.cups = cups;
            this.money = money;
        }

        public int getWater() {
            return water;
        }

        public int getMilk() {
            return milk;
        }

        public int getCoffee() {
            return coffee;
        }

        public int getCups() {
            return cups;
        }

        public int getMoney() {
            return money;
        }

        public void setWater(int water) {
            this.water = water;
        }

        public void subWater(int waterToSubtract) {
            this.water -= waterToSubtract;
        }

        public void addWater(int waterToAdd) {
            this.water += waterToAdd;
        }

        public void setMilk(int milk) {
            this.milk = milk;
        }

        public void subMilk(int milkToSubtract) {
            this.milk -= milkToSubtract;
        }

        public void addMilk(int milkToAdd) {
            this.milk += milkToAdd;
        }

        public void setCoffee(int coffee) {
            this.coffee = coffee;
        }

        public void subCoffee(int coffeeToSubtract) {
            this.coffee -= coffeeToSubtract;
        }

        public void addCoffee(int coffeeToAdd) {
            this.coffee += coffeeToAdd;
        }

        public void setCups(int cups) {
            this.cups = cups;
        }

        public void subCups(int cupsToSubtract) {
            this.cups -= cupsToSubtract;
        }

        public void addCups(int cupsToAdd) {
            this.cups += cupsToAdd;
        }

        public void setMoney(int money) {
            this.money = money;
        }

        public void subMoney(int moneyToSubtract) {
            this.money -= moneyToSubtract;
        }

        public void addMoney(int moneyToAdd) {
            this.money += moneyToAdd;
        }
    }

    public static void action() {

    }

    public static void actions(CoffeeMachineState initialState, Scanner scanner, String action) {
        switch (action) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String coffeeType = scanner.next();
                if (coffeeType.equals("1")) {
                    boolean canDo = true;
                    if (initialState.getWater() >= 250) {
                        canDo = true;
                    } else {
                        canDo = false;
                        System.out.println("Sorry, not enough water!");
                        break;
                    }
                    if (initialState.getCoffee() >= 16) {
                        canDo = true;
                    } else {
                        canDo = false;
                        System.out.println("Sorry, not enough coffee!");
                        break;
                    }
                    if (initialState.getCups() >= 1) {
                        canDo = true;
                    } else {
                        canDo = false;
                        System.out.println("Sorry, not enough cups!");
                        break;
                    }
                    System.out.println("I have enough resources, making you a coffee!");
                    initialState.subCups(1);
                    initialState.subCoffee(16);
                    initialState.subWater(250);
                    initialState.addMoney(4);
                } else if (coffeeType.equals("2")) {
                    boolean canDo = true;
                    if (initialState.getWater() >= 350) {
                        canDo = true;
                    } else {
                        canDo = false;
                        System.out.println("Sorry, not enough water!");
                        break;
                    }
                    if (initialState.getMilk() >= 75) {
                        canDo = true;
                    } else {
                        canDo = false;
                        System.out.println("Sorry, not enough milk!");
                        break;
                    }
                    if (initialState.getCoffee() >= 20) {
                        canDo = true;
                    } else {
                        canDo = false;
                        System.out.println("Sorry, not enough coffee!");
                        break;
                    }
                    if (initialState.getCups() >= 1) {
                        canDo = true;
                    } else {
                        canDo = false;
                        System.out.println("Sorry, not enough cups!");
                        break;
                    }
                    System.out.println("I have enough resources, making you a coffee!");
                    initialState.subWater(350);
                    initialState.subMilk(75);
                    initialState.subCoffee(20);
                    initialState.subCups(1);
                    initialState.addMoney(7);
                } else if (coffeeType.equals("3")){
                    boolean canDo = true;
                    if (initialState.getWater() >= 200) {
                        canDo = true;
                    } else {
                        canDo = false;
                        System.out.println("Sorry, not enough water!");
                        break;
                    }
                    if (initialState.getMilk() >= 100) {
                        canDo = true;
                    } else {
                        canDo = false;
                        System.out.println("Sorry, not enough milk!");
                        break;
                    }
                    if (initialState.getCoffee() >= 12) {
                        canDo = true;
                    } else {
                        canDo = false;
                        System.out.println("Sorry, not enough coffee!");
                        break;
                    }
                    if (initialState.getCups() >= 1) {
                        canDo = true;
                    } else {
                        canDo = false;
                        System.out.println("Sorry, not enough cups!");
                        break;
                    }
                    System.out.println("I have enough resources, making you a coffee!");
                    initialState.subWater(200);
                    initialState.subMilk(100);
                    initialState.subCoffee(12);
                    initialState.subCups(1);
                    initialState.addMoney(6);
                } else {
                    break;
                }
                break;
            case "fill":
                System.out.println("Write how many ml of water you want to add:");
                int addWater = scanner.nextInt();
                System.out.println("Write how many ml of milk you want to add:");
                int addMilk = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add:");
                int addCoffee = scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee you want to add:");
                int addCups = scanner.nextInt();
                initialState.addWater(addWater);
                initialState.addMilk(addMilk);
                initialState.addCoffee(addCoffee);
                initialState.addCups(addCups);
                break;
            case "take":
                System.out.println("I gave you $" + initialState.getMoney());
                int takeMoney = initialState.getMoney();
                initialState.subMoney(takeMoney);
                break;
        }

    }

    public static void printCurrentState(CoffeeMachineState initialState) {
        System.out.println("The coffee machine has:");
        System.out.println(initialState.getWater() + " ml of water");
        System.out.println(initialState.getMilk() + " ml of milk");
        System.out.println(initialState.getCoffee() + " ml of coffee beans");
        System.out.println(initialState.getCups() + " disposable cups");
        System.out.println("$" + initialState.getMoney() + " of money");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CoffeeMachineState initialState = new CoffeeMachineState();

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();
            if (action.equals("remaining")) {
                printCurrentState(initialState);
                continue;
            } else if (action.equals("exit")) {
                break;
            }
            actions(initialState, scanner, action);
        }
    }
}

