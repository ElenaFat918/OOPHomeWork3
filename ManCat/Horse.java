public class Horse extends Animal implements Movement, Eat, Sounds{

    public Horse(String name,Integer weight) {
        super(name, weight);
    }
    
    @Override
    public void movement() {
        System.out.println("Лошадь подошла " );
    }

    @Override
    public void sounds() {
        System.out.println("Лошадь сказала <Пруу> " );
    }

    @Override
    public void eat() {
        System.out.println("Лошадь поела");
    }
}
