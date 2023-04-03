package Seminar_4.Home_Work;

// Есть классы: GoldenApple -> Apple -> Fruit
//                             Orange -> Fruit
// Есть класс Box. Нужно:
// 1. Организовать его так, чтобы он мог хранить только фрукты какого-то типа
// 2. Реализовать методы добавления фрукта, пересыпания в другую коробку, получение сумарного веса
// Ограничения:
// В коробку с апельсинами нельзя добавить яблоки
// В коробку с золотыми яблоками нельзя добавить апельсины и яблоки
// Пересыпать из коробки с золотыми яблоками в коробку с яблоками можно!
// 3.* Реализовать итерируемость по коробке

public class Main {
    public static void main(String[] args) {
        
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        GrannySmith greenApple1 = new GrannySmith();
        GrannySmith greenApple2 = new GrannySmith();
        GrannySmith greenApple3 = new GrannySmith();

        Box<Apple> boxApple = new Box<>();
        Box<Orange> boxOrange = new Box<>();
        Box <Fruit> anotherBox = new Box<>();
        Box <GrannySmith> grannySmithBox = new Box<>();


        System.out.println();
        boxApple.add(apple1);
        boxApple.add(apple3);
        boxApple.add(greenApple3);
        // boxApple.add(orange1);
        
        boxOrange.add(orange2);
        boxOrange.add(orange3);
        // boxOrange.add(apple2);

        grannySmithBox.add(greenApple1);
        grannySmithBox.add(greenApple2);
        // grannySmithBox.add(apple1);
        // grannySmithBox.add(orange2);
        
        System.out.println("boxOrange 1 " + boxOrange);
        boxOrange.getInfoInBox();
        
        boxApple.moveTo_2(anotherBox);
        boxOrange.moveTo_2(anotherBox);

        System.out.println("boxApple " + boxApple);
        boxApple.getInfoInBox();

        System.out.println("boxOrange 2 " + boxOrange);
        boxOrange.getInfoInBox();

        System.out.println("anotherBox " + anotherBox);
        anotherBox.getInfoInBox();


    }
}
