package com.santosh.springjava8cheatsheet.streamapi;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class StreamExample1 {
    private List<Product> products = new ArrayList<>();
    private List<String> names = new ArrayList<>();

    @PostConstruct
    public void bootstrap() {
        // Adding Products
        products.add(new Product(1, "HP Laptop", 25000));
        products.add(new Product(2, "Dell Laptop", 30000));
        products.add(new Product(3, "Lenovo Laptop", 28000));
        products.add(new Product(4, "Sony Laptop", 28000));
        products.add(new Product(5, "Apple Laptop", 90000));

        //Adding names
        names.add("Ram");
        names.add("Sita");
        names.add("Hari");
        names.add("Ganesh");
    }

    public void test() {

        List<Double> productPriceList = products.stream()
                .filter(product -> product.getPrice() > 25000)
                .map(product -> product.getPrice())
                .collect(Collectors.toList());

        // displaying data
        productPriceList.forEach(price -> System.out.println(price));

        List<Double> productPriceList2 = products.stream()
                .filter(p -> p.getPrice() > 30000)// filtering data
                .map(Product::getPrice) // fetching price by referring getPrice method
                .collect(Collectors.toList()); // collecting as list

        System.out.println(productPriceList);

        // This is more compact approach for filtering data
        products.stream()
                .filter(product -> product.getPrice() == 30000)
                .forEach(product -> System.out.println(product.getPrice()));


        // Converting Product List into a Map
        Map<Integer, String> productNameMap = products.stream()
                .collect(Collectors.toMap(p -> p.getId(), p -> p.getName()));

        System.out.println(productNameMap);

        // looping map
        productNameMap.forEach((key, value) -> System.out.println("key : " + key + ", value : " + value));

        Map<Integer, String> productNameMap2 = products.stream()
                .filter(phone -> phone.getPrice() < 50000)
                .collect(Collectors.toMap(Product::getId, Product::getName));


        // Converting product List into Set
        Set<Double> productPriceSet = products.stream()
                .filter(product -> product.getPrice() < 30000)
                .map(product -> product.getPrice())
                .collect(Collectors.toSet());

        System.out.println(productPriceSet);

        // Using Collectors method to sum the prices.
        double totalPrice = products.stream()
                .collect(Collectors.summingDouble(product -> product.getPrice()));

        System.out.println(totalPrice);

        // make names uppercase and print all names
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        boolean anyStartsWithA = names.stream()
                .anyMatch(s -> s.startsWith("a"));

        System.out.println(anyStartsWithA);

        long startsWithA =
                names.stream()
                        .filter(s -> s.startsWith("a"))
                        .count();

        System.out.println(startsWithA);

        List<String> courses = Arrays.asList("Java", "PHP", "Angular", "Python");
        Stream<String> courseStream = courses.stream();

        courseStream.forEach(System.out::println);
        courses.forEach(course -> System.out.println(course));

        List<String> sortedCourses = courses.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        sortedCourses.stream()
                .forEach(System.out::println);

        List<String> sortedCourses2 = courses.stream()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .collect(Collectors.toList());

        sortedCourses2.stream()
                .forEach(System.out::println);
    }
}
