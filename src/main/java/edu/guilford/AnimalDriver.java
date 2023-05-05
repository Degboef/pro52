package edu.guilford;
import java.util.Arrays;

public abstract class AnimalDriver {

        public static void main(String[] args) {
    
            Bird bird1 = new Bird("Polly", 2, new String[] { "seeds", "fruit" });
            Bird bird2 = new Bird("Tweety", 1, new String[] { "seeds" });
            Bird bird3 = new Bird("Rio", 3, new String[] { "fruit" });
    
            Fish fish1 = new Fish("Nemo", 1, new String[] { "algae", "plankton" });
            Fish fish2 = new Fish("Dory", 2, new String[] { "plankton" });
            Fish fish3 = new Fish("Bubbles", 1, new String[] { "algae" });
    
            Mammal mammal1 = new Mammal("Bessie", 5, new String[] { "grass" });
            Mammal mammal2 = new Mammal("Fido", 3, new String[] { "dog food" });
            Mammal mammal3 = new Mammal("Milo", 1, new String[] { "milk" });
    
            Animal[] animals = new Animal[] { bird1, bird2, bird3, fish1, fish2, fish3, mammal1, mammal2, mammal3 };
            Arrays.sort(animals);
    
            for (Animal animal : animals) {
                System.out.println(animal.name + " is " + animal.age + " years old and likes " + Arrays.toString(animal.favoriteFoods));
                animal.makeSound();
            }
        }
    }
    
