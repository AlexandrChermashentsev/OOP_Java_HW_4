package Seminar_4.Home_Work;


public class Apple extends Fruit{

    public Apple(){
        // Определяем вес одного яблока в граммах.
        this.weight = rnd.nextInt(150, 350);
    }
    public Apple(int weight){
        this.weight = weight;
    }

}
