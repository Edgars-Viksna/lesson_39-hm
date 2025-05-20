public class Order {
    private String city;
    private int number;
    private double weight;

    public Order(String city, int number, double weight) {
        this.city = city;
        this.number = number;
        this.weight = weight;
    }

    public String getCity() {
        return city;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order{");
        sb.append("city='").append(city).append('\'');
        sb.append(", number=").append(number);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }


}
