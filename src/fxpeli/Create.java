package fxpeli;

public class Create {

    static int health = 100;
    static int stamina = 50;

    static int scatteredweapons = 8;

    static int attackvalue = 10;

    static boolean foundweapon = false;

    static boolean dead = false;

    static int lives = 3;

    static int enemies = 10;

    static boolean attack = false;

    public static void main(String[] args) {
        start(health, stamina, attack);

        //alussa

        System.out.println("Initial Health: " + health);
        System.out.println("Initial Stamina: " + stamina);
        System.out.println("Initial Attack: " + attack);
        System.out.println("Attack value " + attackvalue);

        // hyökkäys
        attack = true;
        attacked();
        // löydetty ase
        foundweapon = true;
        foundweapon();

        // tiedot hyökkäyksen jälkeen
        System.out.println("Updated Health: " + health);
        System.out.println("Updated Stamina: " + stamina);
        System.out.println("Attack status: " + attack);
        System.out.println("Attack value " + attackvalue);

        //nollaa tiedot
        dead = true;
        death();
        System.out.println("Updated lives: " + lives);
    }

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
            foundweapon = false;
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
        }
    }


}
