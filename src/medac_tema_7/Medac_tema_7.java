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
 */
public class Medac_tema_7 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("Lets learn OOP with Taxonomy!");
        
        boolean running_program = true;
        
        int user_option;
        
        Scanner sn_keyboard = new Scanner(System.in);
        
        while(running_program) {
            System.out.println("Choose a option: \n");
            
            System.out.println("1. Add animal \n");
            System.out.println("2. Remove animal \n");
            System.out.println("3. Clean the list \n");
            System.out.println("4. View the list \n");
            System.out.println("5. End program \n");
            
            user_option = sn_keyboard.nextInt();
            
            System.out.println("\nYou choose: " + user_option);
            
            switch(user_option) {
                case 1 -> System.out.println("1. Add animal\n");
                case 2 -> System.out.println("2. Remove animal\n");
                case 3 -> System.out.println("3. Clean animal\n");
                case 4 -> System.out.println("4. View animal\n");
                case 5 -> running_program = false;
            }
            
        }

        Animal Dog = new Animal("Rufus", 7, 1.70, 20.0, new Taxonomy(
                "Eukaryota",
                "Animalia",
                "Chordata",
                "Mamalia",
                "Carnivora",
                "Canidae",
                "Canis",
                "lupus",
                "familiaris"
        ));
        
        Dog.setName("Alf");

        System.out.println("\nDog name: " + Dog.getName());
        
        Dog.eat();
        
        Dog.sleep();
        
        System.out.println("\nDog taxonomy\n");

        System.out.println("1. Dog domain: " + Dog.taxonomy.getDomain());
        System.out.println("2. Dog kingdom: " + Dog.taxonomy.getKingdom());
        System.out.println("3. Dog phylum: " + Dog.taxonomy.getPhylum());
        System.out.println("4. Dog class: " + Dog.taxonomy.getTaxClass());
        System.out.println("5. Dog order: " + Dog.taxonomy.getOrder());
        System.out.println("6. Dog family: " + Dog.taxonomy.getFamily());
        System.out.println("7. Dog genus: " + Dog.taxonomy.getGenus());
        System.out.println("8. Dog species: " + Dog.taxonomy.getSpecies());
        System.out.println("9. Dog subspecies: " + Dog.taxonomy.getSubspecies());

    }

}
