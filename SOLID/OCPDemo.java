abstract class Discount {
    abstract double apply(double amount);
}

class ChristmasDiscount extends Discount {
    public double apply(double amount) {
        return amount * 0.8;
    }
}

class NewYearDiscount extends Discount {
    public double apply(double amount) {
        return amount * 0.9;
    }
}

class OCPDemo {
    public static void main(String[] args) {
        Discount d = new ChristmasDiscount();
        System.out.println("Final Price: " + d.apply(1000));
    }
}
