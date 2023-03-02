package Lectures;

public class Zoo {
    private Animals[] animals;

    public Zoo(Animals[] animals) {
        this.animals = animals;
    }

    public void feedAnimals() {
        for (Animals animal : animals) {
            animal.feed();
        }
    }

    public void makeAnimalsSound() {
        for (Animals animal : animals) {
            animal.makeSound();
        }
    }

    public void allNames(){
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Bear bear = new Bear();
        System.out.println("Всі імена: ");
        System.out.println(tiger.name);
        System.out.println(lion.name);
        System.out.println(bear.name);

    }
}