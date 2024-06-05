package core;

public class Item {
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

    public Item getItem() {
        return this;
    }
}
