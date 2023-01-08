import java.util.Comparator;

public class WeightComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getWeight() - o2.getWeight();
    }    
}
