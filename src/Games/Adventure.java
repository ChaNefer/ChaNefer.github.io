package Games;

import java.util.Random;
import java.util.Scanner;

public class Adventure {
    public static void main(String[] args) {

        //System objects
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); //random number

        //Game variables
        String[] enemies = { "Skeleton", "Zombie", "Mummy", "Ghost", "Deamon" };
        int maxEnemyHealth = 125;
        int enemyAttackDamage = 200;


        //Player variables
        int health = 125;
        int attackDamage = 200;
        int numHealthPotions = 5;
        int healthPotionAmount = 20;
        int healthPotionDropChance = 55;

        boolean running = true;

        System.out.println("Welcome to the GAME!");


        GAME:
        while (running) {
            System.out.println("------------------------------------------------------");

            int enemyHealth = random.nextInt(maxEnemyHealth);
            String enemy = enemies[random.nextInt(enemies.length)]; //choosing an enemy beetwen 0 and 4 in the enemies array through its length (array)
            System.out.println("\t# " + enemy + " has appear! #\n");
            //      #   Zombie has appeared!   #     --->    example of game output!
            while (enemyHealth > 0) {
                System.out.println("\tYour HP: " + health);
                System.out.println("\t" + enemy + "s HP " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack.");
                System.out.println("\t2. Drink health potion.");
                System.out.println("\t3. RUN!");

                String input = scanner.nextLine(); //loading information from player
            }

        }



    }
}
