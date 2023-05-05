package edu.guilford;

public abstract class Animal implements Comparable<Animal> {

    protected String name;
    protected int age;
    protected String[] favoriteFoods;

    public Animal(String name, int age, String[] favoriteFoods) {
        this.name = name;
        this.age = age;
        this.favoriteFoods = favoriteFoods;
    }

    public abstract void makeSound();

    public String[] getFavoriteFoods() {
        return favoriteFoods;
    }

    public void setFavoriteFoods(String[] favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    @Override
    public int compareTo(Animal other) {
        if (this.age < other.age) {
            return -1;
        } else if (this.age > other.age) {
            return 1;
        } else {
            return 0;
        }
    }
}

class Bird extends Animal {

    public Bird(String name, int age, String[] favoriteFoods) {
        super(name, age, favoriteFoods);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }
}

class Fish extends Animal {

    public Fish(String name, int age, String[] favoriteFoods) {
        super(name, age, favoriteFoods);
    }

    @Override
    public void makeSound() {
        System.out.println("Glub glub!");
    }
}

class Mammal extends Animal {

    public Mammal(String name, int age, String[] favoriteFoods) {
        super(name, age, favoriteFoods);
    }

    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }
}
