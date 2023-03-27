package objects;

public class Shoes {

    private String model;
    private String brand;
    private float price;
    private float size;


    public Shoes(String model, String brand, float price, float size) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.size = size;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "Shoes{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
