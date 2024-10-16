
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//1 DRY
class OrderService {
    public void createOrder(String productName, int quantity, double price) {
        double totalPrice = calculateTotalPrice(quantity, price);
        System.out.println("Order for " + productName + " created. Total: " + totalPrice);
    }

    public void updateOrder(String productName, int quantity, double price) {
        double totalPrice = calculateTotalPrice(quantity, price);
        System.out.println("Order for " + productName + " updated. New total: " + totalPrice);
    }

    public double calculateTotalPrice(int quantity, double price) {
        return quantity * price;
    }
}





public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.createOrder("Computer",20,200000);

    }
}


