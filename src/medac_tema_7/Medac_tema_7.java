/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medac_tema_7;

import java.util.ArrayList;
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

        // Class Animal variables
        int animal_id_search;
        String animal_name;
        int animal_age;
        double animal_height;
        double animal_weight;

        // Animals list variable
        ArrayList<Animal> animals_list = new ArrayList<>();

        // Class Taxonomy variables (to add later)
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

            // -> Consume the line left behind (try to understand what happens under the hood)
            sn_keyboard.nextLine();

            // Logic of the program based on the user option
            switch (user_option) {
                // 1. Create animal
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

                    new_animal.toString();

                    animals_list.add(new_animal);

                }
                // 2. Read animal
                case 2 -> {
                    System.out.println("\n2. Read animal\n");

                    System.out.println("What is the animal's id number?\n");

                    animal_id_search = sn_keyboard.nextInt();

                    for (Animal animal : animals_list) {
                        if (animal.getIdNumber() == animal_id_search) {
                            System.out.println(animal.toString());
                        }
                    }
                }
                // 3. Update animal
                case 3 -> {
                    System.out.println("\n3. Update animal");

                    System.out.println("What is the animal's id number?\n");

                    animal_id_search = sn_keyboard.nextInt();

                    for (Animal animal : animals_list) {
                        if (animal.getIdNumber() == animal_id_search) {
                            System.out.println(animal.toString());
                        }
                    }

                    System.out.println("\nWhat information do you want to update?\n");

                    System.out.println("1. Name\n");
                    System.out.println("2. Age\n");
                    System.out.println("3. Height\n");
                    System.out.println("4. Weight\n");

                    user_option = sn_keyboard.nextInt();

                    switch (user_option) {
                        case 1 -> {
                            for (Animal animal : animals_list) {
                                if (animal.getIdNumber() == animal_id_search) {
                                    animal.setName("new_name_here");
                                }
                            }
                        }
                        case 2 -> {
                            for (Animal animal : animals_list) {
                                if (animal.getIdNumber() == animal_id_search) {
                                    animal.setAge(0);
                                }
                            }
                        }
                        case 3 -> {
                            for (Animal animal : animals_list) {
                                if (animal.getIdNumber() == animal_id_search) {
                                    animal.setHeight(0);
                                }
                            }
                        }
                        case 4 -> {
                            for (Animal animal : animals_list) {
                                if (animal.getIdNumber() == animal_id_search) {
                                    animal.setWeight(0);
                                }
                            }
                        }
                    }

                }
                // 4. Delete animal
                case 4 -> {
                    System.out.println("\n4. Delete animal");
                }
                // 5. Delete (all) animals - clear the list
                case 5 -> {
                    System.out.println("\n5. Delete all");
                }
                // 6. View the list (all animals)
                case 6 -> {
                    System.out.println("\n6. View all\n");

                    for (Animal animal : animals_list) {
                        System.out.println((animals_list.indexOf(animal) + 1) + ". " + animal.toString());
                    }
                }
                // 7. End program
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
