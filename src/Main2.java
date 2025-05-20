import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {

        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order("Berlin", 1, 1.99));
        orderList.add(new Order("Berlin", 2, 1.00));
        orderList.add(new Order("Leipzig", 1, 3.00));
        orderList.add(new Order("Leipzig", 1, 1.50));
        orderList.add(new Order("Stuttgart", 1, 6.00));
        System.out.println(orderList);
        System.out.println("-------------- Sorted ----------------");
        System.out.println(orderList.stream().collect(Collectors.groupingBy(order -> order.getCity())));


    }

//    public static List<String> sortByCity(List<Order> orders) {
//        //TreeSet<Order> result = new TreeSet<>(orders);
//        return orders.stream().collect(Collectors
//                .toMap(order -> order.getCity(), order -> order.getWeight())).toString();
//
//
//    }


}
