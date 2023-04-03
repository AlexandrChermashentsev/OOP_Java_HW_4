package Seminar_4.Home_Work;

import java.util.Random;

public abstract class Fruit {
    protected String classFruit;
    protected int weight;
    protected static Random rnd;
    // protected static int defaultIndex;

    static {
        // Fruit.defaultIndex = 1;
        Fruit.rnd = new Random();
    }

    public int getWeight(){
        return weight;
    }
    public String getClassFruit(){
        return classFruit;
    }

    @Override
    public String toString() {
        return "weight = " + weight + " g";
    }
    
}
