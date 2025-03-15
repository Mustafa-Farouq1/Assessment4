class Elephant extends Animal {
    public Elephant(String name, String coachName, String securityName) {
        super(name, "Elephant", coachName, securityName);
    }

    @Override
    public void displayInfo() {
        System.out.println("Animal: " + getType());
        System.out.println("Name: " + getName());
        System.out.println("Coach: " + getCoachName());
        System.out.println("Security: " + getSecurityName());
    }
}
