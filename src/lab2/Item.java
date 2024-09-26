package lab2.com;

public class Item {private String name;
    private float price;

    public Item(String name, float price) {
        this.name = name;
        setPrice(price);
    }

    public void increasePrice(float percent) {
        this.price += (this.price * percent / 100);
    }

    public void decreasePrice(float percent) {
        this.price -= (this.price * percent / 100);
        if (this.price < 0) {
            this.price = 0;
        }
    }

    public float getPrice() {
        return this.price;
    }

    private void setPrice(float price) {
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public String toString() {
        return name + " - " + price + " UAH";
    }
}
