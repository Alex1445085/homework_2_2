public class Griffindor extends Hogvarts {
    private int nobylity;
    private int honor;
    private int bravery;

    public Griffindor(String name, String secondName, int magicPower, int transgression, int nobylity, int honor, int bravery) {
        super(name, secondName, magicPower, transgression);
        this.nobylity = nobylity;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobylity() {
        return nobylity;
    }
    public int getHonor() {
        return honor;
    }
    public int getBravery() {
        return bravery;
    }
    public void setNobylity(int nobylity) {
        this.nobylity = nobylity;
    }
    public void setHonor(int honor) {
        this.honor = honor;
    }
    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    public int getPower() {
        return (this.getMagicPower() + this.getTransgression());
    }
    @Override
    public String toString() {
                return  this.getName() + " " + this.getSecondName() +
                        ":\n    сила магии - " + this.getMagicPower() +
                        ", трансгрессия - " + this.getTransgression() +
                        "\n    баллы: благородство - " + this.getNobylity() +
                        ", честь - " + this.getHonor() +
                        ", храбрость - " + this.getBravery();
    }

}
//nobility, honor, bravery  благородство, честь, храбрость