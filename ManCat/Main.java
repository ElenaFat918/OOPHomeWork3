import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Man man = new Man("Артём");
        Animal cat = new Cat("Пушок", 3);
        Animal dog = new Dog("Шарик",10);
        Animal horse = new Horse("Игла", 300);
        Animal cow = new Cow("Зорька", 400);
        

        ArrayList<Animal> myList = new ArrayList<>();
        myList.add(dog);
        myList.add(cow);
        myList.add(cat);
        myList.add(horse);
        System.out.println(myList);
        Collections.sort(myList, new WeightComparator()); //по весу от меньшего к большему
        System.out.println(myList);
        
        man.call(cat); cat.movement();
        man.call(cow);
        man.call(horse);
        man.call(dog);
        man.feed(cat); cat.eat();
        man.feed(cow); cow.eat();
        man.stroked(cow); cow.sounds();
       
        Iterator<Animal> iterator = myList.iterator(); //перебор коллекций
        while (iterator.hasNext()) {
            Animal next = iterator.next();
            if (next.getWeight()<5){
                man.takeOnHand(next);
                man.stroked(next);
            }
        }
    }
}
/*
 * Проделать код ревью своих работ. Продумать, какие компоненты можно и нужно переписать.
 */