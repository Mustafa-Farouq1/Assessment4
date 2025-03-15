class Security {
    private String name;
    private int id;

    public Security(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Security Name: " + name + ", ID: " + id);
    }
}
