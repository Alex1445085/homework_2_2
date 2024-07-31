public class Kogtevran extends Hogvarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Kogtevran(String name, String secondName, int magicPower, int transgression, int smart, int wise, int witty, int creativity) {
        super(name, secondName, magicPower, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }
    public int getWise() {
        return wise;
    }
    public int getWitty() {
        return witty;
    }
    public int getCreativity() {
        return creativity;
    }
    public void setSmart(int smart) {
        this.smart = smart;
    }
    public void setWise(int wise) {
        this.wise = wise;
    }
    public void setWitty(int witty) {
        this.witty = witty;
    }
    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public String toString() {
        return  this.getName() + " " + this.getSecondName() +
                ":\n    сила магии - " + this.getMagicPower() +
                ", трансгрессия - " + this.getTransgression() +
                "\n    баллы: ум - " + this.getSmart() + ", мудрость - " + this.getWise() +
                ", остроумие - " + this.getWitty() + ", творчество - " + this.getCreativity();
    }

}
