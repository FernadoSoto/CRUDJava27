/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

/**
 *
 * @author yofer
 */
public class Animal {
    // Atributos
    private String nombre;
    private int edad;
    
    // Constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Método para obtener el nombre del animal
    public String getNombre() {
        return nombre;
    }
    
    // Método para establecer el nombre del animal
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Método para obtener la edad del animal
    public int getEdad() {
        return edad;
    }
    
    // Método para establecer la edad del animal
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // Método para que el animal hable
    public void hablar() {
        System.out.println("Soy un animal y estoy haciendo un sonido.");
    }
    
    public static void main(String[] args) {
        // Crear un objeto Animal
        Animal miAnimal = new Animal("Rex", 5);
        
        // Obtener y mostrar los atributos del animal
        System.out.println("Nombre del animal: " + miAnimal.getNombre());
        System.out.println("Edad del animal: " + miAnimal.getEdad());
        
        // Hacer que el animal hable
        miAnimal.hablar();
    }
}

