abstract class Animal {
    private String name;
    private String type;
    private String coachName;
    private String securityName;

    public Animal(String name, String type, String coachName, String securityName) {
        this.name = name;
        this.type = type;
        this.coachName = coachName;
        this.securityName = securityName;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCoachName() {
        return coachName;
    }

    public String getSecurityName() {
        return securityName;
    }

    public abstract void displayInfo();
}