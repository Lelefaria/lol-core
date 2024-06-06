package core;

public class Troops {

    private int health;
    private int attackDamage;
    private int moveSpeed;
    private double attackSpeed;

    //construtor
    public Troops(int health,
    int attackDamage,
    int moveSpeed,
    double attackSpeed){
        this.health=health;
        this.attackDamage=attackDamage;
        this.moveSpeed=moveSpeed;
        this.attackSpeed=attackSpeed;
    }

    //metodos
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

}
