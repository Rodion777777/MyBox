public class Gingerbread extends Sweet {


    private String taste;

    public Gingerbread(String name, float weight, float price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", вкус пряника = " + taste;
    }
}
