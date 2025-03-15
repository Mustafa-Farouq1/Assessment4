import java.util.ArrayList;
import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        // Arrays to store animals and customers
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();
        double totalIncome = 0;
        int kidCount = 0, adultCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Menu
            System.out.println("===== Zoo Management System =====");
            System.out.println("1. Add Animal");
            System.out.println("2. Add Customer");
            System.out.println("3. Display Animals");
            System.out.println("4. Display Total Income");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Add Animal
                    System.out.print("Enter Animal Type (Tiger/Monkey/Lion/Giraffe/Elephant/Cheetah): ");
                    String type = scanner.next();
                    System.out.print("Enter Animal Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Coach Name: ");
                    String coachName = scanner.next();
                    System.out.print("Enter Security Name: ");
                    String securityName = scanner.next();

                    // Create the appropriate animal based on type
                    Animal animal;
                    switch (type.toLowerCase()) {
                        case "tiger":
                            animal = new Tiger(name, coachName, securityName);
                            break;
                        case "monkey":
                            animal = new Monkey(name, coachName, securityName);
                            break;
                        case "lion":
                            animal = new Lion(name, coachName, securityName);
                            break;
                        case "giraffe":
                            animal = new Giraffe(name, coachName, securityName);
                            break;
                        case "elephant":
                            animal = new Elephant(name, coachName, securityName);
                            break;
                        case "cheetah":
                            animal = new Cheetah(name, coachName, securityName);
                            break;
                        default:
                            System.out.println("Invalid animal type. Try again.");
                            continue;
                    }
                    animals.add(animal);
                    System.out.println(type + " added successfully!");
                    break;

                case 2: // Add Customer
                    System.out.print("Enter Customer Name: ");
                    String customerName = scanner.next();
                    System.out.print("Enter Customer Age: ");
                    int age = scanner.nextInt();

                    Customer customer = new Customer(customerName, age);
                    customers.add(customer);

                    double fee = customer.getTicketFee();
                    totalIncome += fee;

                    // Update counts
                    if (customer.isAdult()) {
                        adultCount++;
                    } else {
                        kidCount++;
                    }

                    System.out.println("Customer added. Ticket Fee: $" + fee);
                    break;

                case 3: // Display Animals
                    System.out.println("===== Animal Details =====");
                    for (Animal animal1 : animals) {
                        animal1.displayInfo();
                        System.out.println("-------------------");
                    }
                    break;

                case 4: // Display Total Income
                    System.out.println("===== Income Summary =====");
                    System.out.println("Total Income: $" + totalIncome);
                    System.out.println("Kids Count: " + kidCount);
                    System.out.println("Adults Count: " + adultCount);
                    break;

                case 5: // Exit
                    System.out.println("Exiting... Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}