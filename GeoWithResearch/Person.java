public class Person implements Comparable<Person>{
/**
    * выделяем сущность "Персона": говорим класс Person, для этой сущности определены  поля - fullName и возраст
*/
    public String fullName;
    public int age;
    /**
     *  конструктор отвечает за инициализацию имени и возраста
     * @param fullName
     * @param age
     */
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    /**
     * Метод получения имени
     * @return
     */
    public String getFullName() {
        return fullName;
    }
    /**
     * Метод получения возраста
     * @return
     */
    public int getAge() {
        return age;
    }
    
    @Override
    public int compareTo(Person o) {
        return this.getAge()-o.getAge();
    }
}
