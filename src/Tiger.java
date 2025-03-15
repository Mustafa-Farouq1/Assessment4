class Tiger extends Animal {
    public Tiger(String name, String coachName, String securityName) {
        super(name, "Tiger", coachName, securityName);
    }

    @Override
    public void displayInfo() {
        System.out.println("Animal: " + getType());
        System.out.println("Name: " + getName());
        System.out.println("Coach: " + getCoachName());
        System.out.println("Security: " + getSecurityName());
    }
}
