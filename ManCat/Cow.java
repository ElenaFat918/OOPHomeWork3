public class Cow extends Animal implements Movement, Eat, Sounds{
       
    public Cow(String name, Integer weight) {
        super(name, weight);
        }
    
    @Override
    public void movement() {
        System.out.println("Корова подошла " );
    }

    @Override
    public void sounds() {
        System.out.println("Корова сказала <Муу> " );
    }

    @Override
    public void eat() {
        System.out.println("Корова поела");
    }

}
