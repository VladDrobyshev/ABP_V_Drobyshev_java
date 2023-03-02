package Lectures;

public class lec_5 {

    public static void code(){
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Bear bear = new Bear();

        Animals[] animals = { lion, tiger, bear };

        Zoo zoo = new Zoo(animals);

        System.out.println("Результат = ");
        zoo.feedAnimals();
        System.out.println();
        zoo.makeAnimalsSound();
        System.out.println();
        zoo.allNames();







    }
}
