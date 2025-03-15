class Giraffe extends Animal {
    public Giraffe(String name, String coachName, String securityName) {
        super(name, "Giraffe", coachName, securityName);
    }

    @Override
    public void displayInfo() {
        System.out.println("Animal: " + getType());
        System.out.println("Name: " + getName());
        System.out.println("Coach: " + getCoachName());
        System.out.println("Security: " + getSecurityName());
    }
}
