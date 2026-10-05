import java.util.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - Rs. " + price;
    }
}

public class OnlineShopping {

    public static void main(String[] args) {

        // MAP - Stores product ID and product details
        Map<Integer, Product> products = new HashMap<>();

        products.put(101, new Product(101, "Laptop", 55000));
        products.put(102, new Product(102, "Smartphone", 25000));
        products.put(103, new Product(103, "Headphones", 2000));
        products.put(104, new Product(104, "Keyboard", 1500));

        // LIST - Stores products added to cart
        List<Product> cart = new ArrayList<>();

        cart.add(products.get(101));
        cart.add(products.get(103));
        cart.add(products.get(104));

        // SET - Stores unique product categories
        Set<String> categories = new HashSet<>();

        categories.add("Electronics");
        categories.add("Computers");
        categories.add("Accessories");
        categories.add("Electronics");

        // QUEUE - Stores orders waiting to be processed
        Queue<String> orders = new LinkedList<>();

        orders.add("Order 1001");
        orders.add("Order 1002");
        orders.add("Order 1003");

        // Display available products
        System.out.println("===== ONLINE SHOPPING CART SYSTEM =====");

        System.out.println("\nAvailable Products:");

        for (Product product : products.values()) {
            System.out.println(product);
        }

        // Display cart
        System.out.println("\nShopping Cart:");

        double total = 0;

        for (Product product : cart) {
            System.out.println(product);
            total += product.price;
        }

        System.out.println("Total Cart Amount: Rs. " + total);

        // Display categories
        System.out.println("\nProduct Categories:");

        for (String category : categories) {
            System.out.println(category);
        }

        // Display orders
        System.out.println("\nOrders Waiting for Processing:");

        for (String order : orders) {
            System.out.println(order);
        }

        // Process orders
        System.out.println("\nProcessing Orders:");

        while (!orders.isEmpty()) {
            System.out.println("Processed: " + orders.poll());
        }

        System.out.println("\nAll orders processed successfully.");
    }
}

