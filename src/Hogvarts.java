public abstract class Hogvarts {
    private String name;
    private String secondName;
    private int magicPower;
    private int transgression;

    public Hogvarts(String name, String secondName, int magicPower, int transgression) {
        this.name = name;
        this.secondName = secondName;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }


    public String getName() {
        return name;
    }
    public String getSecondName() {
        return secondName;
    }
    public int getMagicPower() {
        return magicPower;
    }
    public int getTransgression() {
        return transgression;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }
    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
}
