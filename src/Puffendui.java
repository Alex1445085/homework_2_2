public class Puffendui extends Hogvarts {

    private int hardWork;
    private int loyal;
    private int honest;

    public Puffendui(String name, String secondName, int magicPower, int transgression, int hardWork, int loyal, int honest) {
        super(name, secondName, magicPower, transgression);
        this.hardWork = hardWork;
        this.loyal = loyal;
        this. honest = honest;
    }

    public int getHardWork() {
        return hardWork;
    }
    public int getLoyal() {
        return loyal;
    }
    public int getHonest() {
        return honest;
    }
    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }
    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }
    public void setHonest(int honest) {
        this.honest = honest;
    }

    public String toString() {
        return  this.getName() + " " + this.getSecondName() +
                ":\n    сила магии - " + this.getMagicPower() +
                ", трансгрессия - " + this.getTransgression() +
                "\n    баллы: трудолюбивость - " + this.getHardWork() +
                ", верность - " + this.getLoyal() +
                ", честность - " + this.getHonest();
    }
}
