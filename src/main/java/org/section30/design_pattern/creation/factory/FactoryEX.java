package org.section30.design_pattern.creation.factory;

//1.create common interface
interface Animal {
    void sepeak();
}

//2 concreat classes that implement interface
class Dog implements Animal {
    @Override
    public void sepeak() {
        System.out.println(" barking");
    }
}

class Cat implements Animal {
    @Override
    public void sepeak() {
        System.out.println(" meo");
    }
}

//3 factory class that decides which type of animal obj to create
class AnimalFactory {

    public static Animal getAnimal(String animalType) {
        if (animalType == null) {
            return null;
        }
        if (animalType.equalsIgnoreCase("Dog")) {
            return new Dog();
        }
        if (animalType.equalsIgnoreCase("Cat")) {
            return new Cat();
        }
        return null;
    }
}

//4 client code uses factory to create obj
public class FactoryEX {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.getAnimal("Dog");
        dog.sepeak();

        Animal cat = AnimalFactory.getAnimal("cat");
        cat.sepeak();
    }
}
