class Customer {
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public double getTicketFee() {
        if (age < 5) return 0; // Free for kids under 5
        else if (age < 18) return 10; // Discounted fee for kids
        else return 20; // Standard fee for adults
    }

    public void displayInfo() {
        System.out.println("Customer Name: " + name + ", Age: " + age + ", Ticket Fee: $" + getTicketFee() + "L.E");
    }
}
