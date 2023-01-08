public class Cat extends Animal {

    public Cat (String name, Integer weight) {
        super(name, weight);      
    }
    
    @Override
    public void movement() {
        System.out.println("Кошка подошла " );
    }

    @Override
    public void sounds() {
        System.out.println("Кошка сказала <Мяу> " );
    }

    @Override
    public void eat() {
        System.out.println("Кошка поела");
    }

    
    // /**
    //  * Метод вывода в консоль отклика кошки
    //  * @param name
    //  */
    // public void respond(String name){
    //     System.out.println("кошка " + name + " подошла и сказала мяу");
    // }
    // /**
    //  * Метод вывода в консоль отрицательного отклика кошки
    //  * @param name
    //  */
    // public void respondNot(String name){
    //     System.out.println("кошка " + name + " убежала");
    // }
    // public String getName() {
    //     return name;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }

}
