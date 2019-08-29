public class Candy extends Sweet {

    private String manufacturer;

    public Candy(String name, double weight, double price, String manufacturer) {
        super(name, weight, price);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", производитель = " + manufacturer;
    }
}
