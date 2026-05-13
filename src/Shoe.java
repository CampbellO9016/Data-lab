public class Shoe {
    private String color;
    private String brand;
    private String shoeType;
    private double price;

    public Shoe(String color, String shoeType, String brand, double price) {
        this.color = color;
        this.shoeType = shoeType;
        this.brand = brand;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getShoeType() {
        return shoeType;
    }

    public void setShoeType(String shoeType) {
        this.shoeType = shoeType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {//String color, String shoeType, String brand, double price)
        return "Shoe brand: " + brand +"\nShoe Type: " + shoeType + "\nShoe Color: " + color + "\nPrice per unit: " + price;
    }
}
