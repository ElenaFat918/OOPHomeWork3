public abstract class Animal implements Movement, Eat, Sounds{
    private String name;
    private Integer weight;


    public Animal(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return getClass() + " " + name + " " + weight;
    }
    // abstract void setEnvironment(); //среда обитания
    @Override
    public void movement() {
    }

    @Override
    public void sounds() {
    }

    @Override
    public void eat() {
    }

}
