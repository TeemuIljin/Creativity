package fxpeli;

public class Create {

    static int health = 100;
    static int stamina = 50;

    static int scatteredweapons = 8;

    static int attackvalue = 10;

    static boolean foundweapon = false;

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
        }
    }
    public static void foundweapon() {
        if (foundweapon) {
            attackvalue += 50;
            foundweapon = false;
            scatteredweapons -= 1;
        }
    }

}
