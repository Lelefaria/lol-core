package core;

public class Champion {
    private int id;
    private String name;

    private int health;
    private int healthMax;
    private int manaInitial;
    private int attackDamage;
    private int abilityPower;
    private int armor;
    private int magicResistence;
    private double attackSpeed;
    private int reloadTime;
    private int critical;
    private int moveSpeed;
    private int exp;
    private int maxLevel;
    private int level;

    private Inventory inventory;
    // private Abilities abilities;

    //construtor
    public Champion(int health, int manaInitial, int attackDamage, int armor, int magicResistence, double attackSpeed,
                    int reloadTime,int critical, int moveSpeed, int level ){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getManaInitial() {
        return manaInitial;
    }

    public void setManaInitial(int manaInitial) {
        this.manaInitial = manaInitial;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getMagicResistence() {
        return magicResistence;
    }

    public void setMagicResistence(int magicResistence) {
        this.magicResistence = magicResistence;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public int getReloadTime() {
        return reloadTime;
    }

    public void setReloadTime(int reloadTime) {
        this.reloadTime = reloadTime;
    }

    public int getCritical() {
        return critical;
    }

    public void setCritical(int critical) {
        this.critical = critical;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
