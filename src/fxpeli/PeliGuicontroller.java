package fxpeli;

public class PeliGuicontroller {

        public void simuloidaanGameActions() {

            // aloitetaan perusarvoilla
            Create.start(Create.health, Create.stamina, Create.attack);

            //varmistetaan toimivuus
            System.out.println("Initial Health: " + Create.health);
            System.out.println("Initial Stamina: " + Create.stamina);
            System.out.println("Initial Attack: " + Create.attack);
            System.out.println("Attack value " + Create.attackvalue);

            //hyökätään
            Create.attack = true;
            Create.attacked();

            // löysimme aseen
            Create.foundweapon = true;
            Create.foundweapon();

            //toinen ase
            Create.foundweapon = true;
            Create.foundweapon();


            // tapoin vihollisen
            Create.kill = true;
            Create.killed();

            // noustaan tasoa
            Create.levelup();


            //uusi levelup
            Create.levelup();

            // näiden jälkeen
            System.out.println("Updated Health: " + Create.health);
            System.out.println("Updated Stamina: " + Create.stamina);
            System.out.println("Attack status: " + Create.attack);
            System.out.println("Attack value " + Create.attackvalue);

            // Simuloidaan kuolemaa
            Create.dead = true;
            Create.death();
            System.out.println("Updated lives: " + Create.lives);
        }

        public static void main(String[] args) {
            PeliGuicontroller controller = new PeliGuicontroller();
            controller.simuloidaanGameActions();
        }
    }
