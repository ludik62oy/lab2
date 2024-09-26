package lab2.com;

public class StackCart {
    private Item[] stack;
    private int top;
    private int maxSize;

    // Constructor
    public StackCart(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new Item[maxSize];
        this.top = -1;
    }

    // Method to add an item to the cart
    public void push(Item item) {
        if (top == maxSize - 1) {
            System.out.println("The cart is full!");
        } else {
            stack[++top] = item;
        }
    }

    // Method to remove an item from the cart
    public Item pop() {
        if (top == -1) {
            System.out.println("The cart is empty!");
            return null;
        } else {
            return stack[top--];
        }
    }

    // Method to calculate the total price of items in the cart
    public float totalPrice() {
        float sum = 0;
        for (int i = 0; i <= top; i++) {
            sum += stack[i].getPrice();
        }
        return sum;
    }

    // Increase the price of all items in the cart
    public void increasePrices(float percent) {
        for (int i = 0; i <= top; i++) {
            stack[i].increasePrice(percent);
        }
    }

    // Decrease the price of all items in the cart
    public void decreasePrices(float percent) {
        for (int i = 0; i <= top; i++) {
            stack[i].decreasePrice(percent);
        }
    }
}
