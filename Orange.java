package Seminar_4.Home_Work;

public class Orange extends Fruit {
    
    public Orange(){
        // Определяем вес одного апельсина в граммах.
        this.weight = rnd.nextInt(150, 350);
    }
    public Orange(int weight){
        this.weight = weight;
    }
}
