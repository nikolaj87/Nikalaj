package javasummary.march10th;

public class SuperHero {
    private String name;
    private int health;
    private int force;
    private Weapon weapon;
    private Protection protection;

    public SuperHero(String name, int health, int force, Weapon weapon, Protection protection) {
        this.name = name;
        this.health = health;
        this.force = force;
        this.weapon = weapon;
        this.protection = protection;
    }

    public SuperHero() {
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", force=" + force +
                ", weapon=" + weapon +
                ", protection=" + protection +
                '}';
    }

    static class Weapon{
        private String name;
        private int force;

        public Weapon(String name, int force) {
            this.name = name;
            this.force = force;
        }

        @Override
        public String toString() {
            return "Weapon{" +
                    "name='" + name + '\'' +
                    ", force=" + force +
                    '}';
        }
    }

    static class Protection {
        private String name;
        private int level;

        public Protection(String name, int level) {
            this.name = name;
            this.level = level;
        }

        @Override
        public String toString() {
            return "Protection{" +
                    "name='" + name + '\'' +
                    ", level=" + level +
                    '}';
        }
    }

    public static SuperHero generateRandomSuperhero () {

        String[] names = {"Kep America","SpiderMan","IronMan","Hulk"};
//        name = names[(int)(Math.random()*4)];
//        health = (int)(Math.random()*10);
//        force = (int)(Math.random()*10);
        String[] weapons = {"knife", "shield", "gun"};
//        weapon = new Weapon(weapons[(int)(Math.random()*3)], (int)(Math.random()*10));
        String[] protections = {"protection", "superProtect", "megaProtect"};
//        protection = new Protection(protections[(int)(Math.random()*3)], (int)(Math.random()*10));

//        SuperHero hero = new SuperHero(name, health, force, weapon, protection);
        return new SuperHero(names[1], 2, 3, new Weapon(weapons[1],2),
                new Protection(protections[3], 3));
    }

    public static void main(String[] args) {
        SuperHero hero1 = new SuperHero();
        hero1 = hero1.generateRandomSuperhero();
        System.out.println(hero1);
    }

}
