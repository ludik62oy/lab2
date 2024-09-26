package lab2.com;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCart {
    private Queue<Item> queue;
    private int maxSize;

    // Constructor
    public QueueCart(int maxSize) {
        this.maxSize = maxSize;
        this.queue = new LinkedList<>();
    }

    // Method to add an item to the cart
    public void push(Item item) {
        if (queue.size() >= maxSize) {
            System.out.println("The cart is full!");
        } else {
            queue.offer(item);
        }
    }

    // Method to remove an item from the cart
    public Item pop() {
        if (queue.isEmpty()) {
            System.out.println("The cart is empty!");
            return null;
        } else {
            return queue.poll();
        }
    }

    // Method to calculate the total price of items in the cart
    public float totalPrice() {
        float sum = 0;
        for (Item item : queue) {
            sum += item.getPrice();
        }
        return sum;
    }

    // Increase the price of all items in the cart
    public void increasePrices(float percent) {
        for (Item item : queue) {
            item.increasePrice(percent);
        }
    }

    // Decrease the price of all items in the cart
    public void decreasePrices(float percent) {
        for (Item item : queue) {
            item.decreasePrice(percent);
        }
    }
}
