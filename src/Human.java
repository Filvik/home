public class Human {

    private String name;
    int age;
    int weight;
    String address;
    String work;

    public Human(String name, int age) {

        this.name = name;
        this.age = age;
        this.weight = 20;
    }

    public Human(String name, String address) {

        this.name = name;
        this.age = 15;
        this.weight = 30;
        this.address = address;
    }

    public Human(String name, int age, int weight) {

        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Human(String name, int age, String work) {

        this.name = name;
        this.age = age;
        this.weight = 50;
        this.work = work;
    }

    public Human(int age, int weight, String address, String work) {

        this.name = "name";
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }

    public String getName() {
        return name;
    }
}
