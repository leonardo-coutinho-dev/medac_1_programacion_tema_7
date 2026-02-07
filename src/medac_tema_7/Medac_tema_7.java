/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medac_tema_7;

import java.util.Scanner;

/**
 *
 * @author Leonardo Coutinho dos Santos
 *
 * Project: List of animals in the zoo.
 *
 * Description: the user will be able to create a list of animals that are in
 * the zoo, with 4 basic functions (add, subtract, clean all the list, view the
 * list).
 *
 * Lessons learned:
 *
 * # 1 - Arrays → fixed size / ArrayList → dynamic size (grows automatically)
 *
 * # 2 - Every array has a single, fixed element type (cannot add multiple
 * element types in a array).
 *
 */
public class Medac_tema_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Introduction message
        System.out.println("Welcome to the ZOO!");

        // Control variables
        boolean running_program = true;
        int user_option;

        // Keyboard access
        Scanner sn_keyboard = new Scanner(System.in);

        // Class animal variables
        String animal_name;
        int animal_age;
        double animal_height;
        double animal_weight;

        // Program
        while (running_program) {
            System.out.println("\nChoose a option: \n");

            // Menu for the user
            System.out.println("1. Create animal"); // Create (1 animal)
            System.out.println("2. Read animal"); // Read (1 animal)
            System.out.println("3. Update animal"); // Update (1 animal)
            System.out.println("4. Delete animal"); // Delete (1 animal)
            System.out.println("5. Delete all"); // Delete all animals on the list
            System.out.println("6. View all"); // View all animals on the list
            System.out.println("7. End program"); // Finish program

            // Variable to store the user option as a integer
            user_option = sn_keyboard.nextInt();
            // -> Consume the line left behind
            sn_keyboard.nextLine();

            // Logic of the program based on the user option
            switch (user_option) {
                case 1 -> {
                    System.out.println("\n1. Add animal\n");

                    // Start here - CREATE A ANIMAL
                    System.out.println("What is the name of the animal?");
                    animal_name = sn_keyboard.nextLine();

                    System.out.println("What is the age of the animal?");
                    animal_age = sn_keyboard.nextInt();

                    System.out.println("What is the height of the animal?");
                    animal_height = sn_keyboard.nextDouble();

                    System.out.println("What is the weight of the animal?");
                    animal_weight = sn_keyboard.nextDouble();

                    System.out.println("\nAnimal has been added to the list: \n");

                    Animal new_animal = new Animal(animal_name, animal_age, animal_height, animal_weight, new Taxonomy());

                    System.out.println("Name: " + new_animal.getName());
                    System.out.println("Age: " + new_animal.getAge());
                    System.out.println("Height: " + new_animal.getHeight());
                    System.out.println("Weight: " + new_animal.getWeight());

                }
                case 2 -> {
                    System.out.println("\n2. Read animal");
                }
                case 3 -> {
                    System.out.println("\n3. Update animal");
                }
                case 4 -> {
                    System.out.println("\n4. Delete animal");
                }
                case 5 -> {
                    System.out.println("\n5. Delete all");
                }
                case 6 -> {
                    System.out.println("\n6. View all");
                }
                case 7 -> {
                    System.out.println("\n7. End program!");
                    running_program = false;
                }
            }
        }

        // Testing code - to see if it's working
    }
;

};
