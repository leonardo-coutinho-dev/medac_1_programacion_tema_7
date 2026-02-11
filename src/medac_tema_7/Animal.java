package medac_tema_7;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Leonardo Coutinho dos Santos 
 * 
 * Inheritance -> is-a -> the child class is also the parent class (dog is-a animal) 
 * Composition -> has-a (strong) -> animal has-a taxonomy 
 * Aggregation -> has-a (weak) -> zoo has-a animal
 * Nested classes -> literally define a class inside the code block of another class
 * 
 */

public class Animal {
    
    // 1) Shared counter for all animals
    private static int next_id = 1;

    // Attributes
    private final int id_number;
    private String name;
    private int age;
    private double height;
    private double weight;

    // Composition -> has-a (strong relationship)
    Taxonomy taxonomy;

    // Constructor
    public Animal(String name, int age, double height, double weight, Taxonomy taxonomy) {
        this.id_number = next_id++;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.taxonomy = taxonomy;
    }

    // Getters - accessor methods
    public int getIdNumber() {
        return id_number;
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
    
    public Taxonomy getTaxonomy() {
        return taxonomy;
    }

    // Setters - mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    // toString method
    
    @Override
    public String toString() {
        return "ID: " + id_number + "; " + "Name: " + name + "; " + "Age: " + age + " year(s) old; " + "Height: " + height + " meter(s); " + "Weight: " + weight + " kg(s).";
    }
    
    // Methods (custom)
    public void eat() {
        System.out.println("The animal is eating!");
    }
    
     // Methods (custom)
    public void drink() {
        System.out.println("The animal is drinking water!");
    }
    
    public void sleep() {
        System.out.println("The animal is sleeping!");
    }
   

}
