package Seminar_4.Home_Work;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {
    private List<T> fruits;

    public <T> Box(){
        fruits = new ArrayList<>();
    }

    public List <T> getListBox(){
        return fruits;
    }

    public void add(T t){
        fruits.add(t);
    }
    

    public void moveTo_2(Box<Fruit> anotherBox){
        boolean flag =  false;
        if (anotherBox.getListBox().isEmpty()){
            for (T f : fruits) {
                anotherBox.getListBox().add(f);
            }
            flag = true;

        } else {
            for (T f2 : fruits) {
                if ((anotherBox.getListBox().get(0) instanceof Apple) && (f2 instanceof Apple)){
                    anotherBox.getListBox().add(f2);

                } else if ((anotherBox.getListBox().get(0) instanceof Orange) && (f2 instanceof Orange)){
                    anotherBox.getListBox().add(f2);

                } else {break;}
                flag = true;
            }
        }
        if (flag){
            fruits.clear();
        }
    }


    @Override
    public String toString() {
        if (!(fruits.isEmpty())){
            if (fruits.get(0) instanceof Apple){
                return String.format("In Box -> Apples %s", fruits);
            } else if (fruits.get(0) instanceof Orange){
                return String.format("In Box -> Oranges %s", fruits);
            }
        }
        return "Box is Empty";
    }

    public void getInfoInBox(){
        int summ = 0;
        for (T t : fruits) {
            summ = summ + t.weight;
            System.out.println(t.getClass());
        }
        System.out.println("All fruit weight = " + summ + " g");
        System.out.println();
    }
}
