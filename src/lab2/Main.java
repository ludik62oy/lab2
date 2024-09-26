package lab2.com;

public class Main {
    public static void main(String[] args) {
        StackCart cart = new StackCart(6);

        cart.push(new Item("Smartwatch", 250));
        cart.push(new Item("Tablet", 400));
        cart.push(new Item("Camera", 800));
        cart.push(new Item("Drone", 1200));
        cart.push(new Item("Portable Speaker", 120));

        System.out.println("Total price before increase: " + cart.totalPrice());

        cart.increasePrices(15);
        System.out.println("Total price after increasing by 15%: " + cart.totalPrice());

        cart.decreasePrices(30);
        System.out.println("Total price after decreasing by 30%: " + cart.totalPrice());
    }
}