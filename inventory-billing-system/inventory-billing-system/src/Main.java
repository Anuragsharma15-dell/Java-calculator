import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();
        ArrayList<Transaction> transactions = new ArrayList<>();

        while (true) {
            System.out.println("\n=== SMART INVENTORY & BILLING SYSTEM ===");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Create Bill");
            System.out.println("4. View Transactions");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();

                    inventory.addProduct(new Product(id, name, price, qty));
                }

                case 2 -> inventory.listProducts();

                case 3 -> {
                    Billing bill = new Billing();
                    while (true) {
                        System.out.print("Enter Product ID (0 to finish): ");
                        int pid = sc.nextInt();
                        if (pid == 0) break;

                        Product p = inventory.searchProduct(pid);
                        if (p == null) {
                            System.out.println("❌ Product not found.");
                            continue;
                        }

                        System.out.print("Qty: ");
                        int q = sc.nextInt();

                        bill.addItem(p, q);
                    }

                    Transaction t = bill.generateBill();
                    transactions.add(t);
                }

                case 4 -> {
                    System.out.println("\n--- All Transactions ---");
                    for (Transaction t : transactions) System.out.println(t);
                }

                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
