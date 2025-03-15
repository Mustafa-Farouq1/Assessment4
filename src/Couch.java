class Coach {
    private String name;
    private int id;

    public Coach(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Coach Name: " + name + ", ID: " + id);
    }
}

