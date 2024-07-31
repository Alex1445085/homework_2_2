public class Slyserin extends Hogvarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourceFulness;
    private int power;

    public Slyserin(String name, String secondName, int magicPower, int transgression, int cunning, int determination, int ambition, int resourceFulness, int power) {
        super(name, secondName, magicPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourceFulness = resourceFulness;
        this.power = power;
    }

    public int getCunning() {
        return cunning;
    }
    public int getDetermination() {
        return determination;
    }
    public int getAmbition() {
        return ambition;
    }
    public int getResourceFulness() {
        return resourceFulness;
    }
    public int getPower() {
        return power;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }
    public void setDetermination(int determination) {
        this.determination = determination;
    }
    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }
    public void setResourceFulness(int resourceFulness) {
        this.resourceFulness = resourceFulness;
    }
    public void setPower(int power) {
        this.power = power;
    }

    public String toString() {
        return  this.getName() + " " + this.getSecondName() +
                ":\n    сила магии - " + this.getMagicPower() +
                ", трансгрессия - " + this.getTransgression() +
                "\n    баллы: хитрость - " + this.getCunning() + ", решительность - " + this.getDetermination() +
                ", амбициозность - " + this.getAmbition() + ", находчивость - " + this.getResourceFulness() +
                ", жажда власти - " + this.getPower();
    }
}
