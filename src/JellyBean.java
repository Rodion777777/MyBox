public class JellyBean extends Sweet {

    private double count;

    public JellyBean(String name, double weight, double price, int count) {
        super(name, weight, price);
        this.count = count;
    }

    public double getCount() {
        return count;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", количество = " + count;
    }
}
