package fxpeli;

public class Create {

    public static int health = 100;
    public static int stamina = 50;
    public static int scatteredweapons = 8;
    public static int attackvalue = 10;
    static int experience = 1;
    static boolean loadEnemies = false;
    static boolean createNewmap = false;
    static int Maps = 2;
    static int xpvalue = 100;
    public static boolean foundweapon = false;
    public static boolean dead = false;
    public static boolean kill = false;
    public static int lives = 3;
    static int enemies = 10;
    public static boolean attack = false;


    public static void start(int starthealth, int startstamina, boolean startattack) {
        health = starthealth;
        stamina = startstamina;
        attack = startattack;
    }

    public static void attacked() {
        if (attack) {
            health -= 10;
            stamina -= 5;
            attack = false;
            enemies -= 1;


        }
    }
    public static void foundweapon() {
        if (foundweapon) {
            attackvalue += 50;
            scatteredweapons -= 1;
            foundweapon = false;
        }
    }
    public static void death() {
        if (dead) {
            attackvalue = 10;
            foundweapon = false;
            scatteredweapons = 8;
            lives -= 1;
            enemies = 10;
            dead = false;
        }
    }
        public static void killed() {
            if (kill) {
                attackvalue += 100;
                xpvalue += 100;
            }
    }

    public static void heal(int healAmount) {
        health += healAmount;
        if (health > 100) {
            health = 100; 
        }
    }

    public static void regenerateStamina(int staminaAmount) {
        stamina += staminaAmount;
        if (stamina > 50) {
            stamina = 50; 
        }
    }
    
    public static void levelup() {
        if (xpvalue == 1000) {
            attackvalue += 100;
            health += 100;
            experience += 1;

        }
    }

    public Create(int health, int stamina, int attackvalue, int scatteredweapons, int lives) {
        Create.health = health;
        Create.stamina = stamina;
        Create.attackvalue = attackvalue;
        Create.scatteredweapons = scatteredweapons;
        Create.lives = lives;
    }

    //toistaiseksi testataan toiminnallisuutta näin
     public static void displayStatus() {
        System.out.println("Health: " + health);
        System.out.println("Stamina: " + stamina);
        System.out.println("Attack Value: " + attackvalue);
        System.out.println("Scattered Weapons: " + scatteredweapons);
        System.out.println("Lives: " + lives);
        System.out.println("Enemies: " + enemies);
        System.out.println("Experience: " + experience);
        System.out.println("XP Value: " + xpvalue);
        System.out.println("Create New Map: " + createNewmap);
    }


}
