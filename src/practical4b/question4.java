package practical4b;
class AddAmount {
    private double amount;

    public AddAmount() {
        this.amount = 50;
    }

    public AddAmount(double amount) {
        this.amount = 50 + amount;
    }

    public void display() {
        System.out.println("Amount: " + amount);
    }
}


public class question4 {
    public static void main(String[] args) {
        AddAmount addAmount1 = new AddAmount();
        AddAmount addAmount2 = new AddAmount(100);

        addAmount1.display();
        addAmount2.display();
    }
}
