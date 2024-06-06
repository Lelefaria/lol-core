package core;

public class Item {
    private int id;
    private String name;
    private int health;
    private int mana;
    private int attackDamage;
    private int abilityPower;
    private int armor;
    private int magicResistence;
    private double attackSpeed;
    private int reloadTime;
    private int critical;
    private int moveSpeed;

    public Item(String name, int health,
            int mana,
            int attackDamage,
            int abilityPower,
            int armor,
            int magicResistence,
            double attackSpeed,
            int reloadTime,
            int critical,
            int moveSpeed) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
        this.abilityPower = abilityPower;
        this.armor = armor;
        this.magicResistence = magicResistence;
        this.attackSpeed = attackSpeed;
        this.reloadTime = reloadTime;
        this.critical = critical;
        this.moveSpeed = moveSpeed;
    }

    public Item(String espadaLonga, double v) {

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getAbilityPower() {
        return abilityPower;
    }

    public void setAbilityPower(int abilityPower) {
        this.abilityPower = abilityPower;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
