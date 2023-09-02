public class Dog {
    private String name;
    private int age;
    private String color;
    private Breed breed;


    public Dog(String name, int age, String color, Breed breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }


    public Dog(String name, String color, Breed breed) {
        this(name, 5, color, breed);
    }


    public Dog(int age, String color, Breed breed) {
        this("Wolf", age, color, breed);
    }


    public void bark() {
        System.out.println(this.getName() + " barks a lot!");
    }


    public void sleep() {
        System.out.println(this.getName() + " sleeps a lot!");
    }


    public void play() {
        System.out.println(this.getName() + " plays a lot!");
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return this.age;
    }


    public String getColor() {
        return this.color;
    }


    public Breed getBreed() {
        return this.breed;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public static void main(String[] args) {
        Dog snoopy = new Dog("Loopy", 8, "Brown", Dog.Breed.BULLDOG);
        snoopy.setName("Snoopy");
        System.out.println("New Name: " +snoopy.getName());
        System.out.println("Age: " + snoopy.getAge());
        System.out.println("Color: " + snoopy.getColor());
        System.out.println("Breed: " + snoopy.getBreed());
        snoopy.bark();


        Dog spot = new Dog("Spot", "Black", Dog.Breed.DACHSHUND);
        System.out.println("Name: " + spot.getName());
        System.out.println("Age: " + spot.getAge());
        spot.setColor("Black and Brown");
        System.out.println("Color: "+ spot.getColor());
        System.out.println("Breed: " + spot.getBreed());
        spot.sleep();
        Dog wolf = new Dog(9, "White", Dog.Breed.POODLE);
        System.out.println("Name: " + wolf.getName());
        wolf.setAge(10);
        System.out.println("Age: " + wolf.getAge());
        System.out.println("Color: " + wolf.getColor());
        System.out.println("Breed: " + wolf.getBreed());
        wolf.play();
    }


    public static enum Breed {
        POODLE,
        BULLDOG,
        DACHSHUND;


        private Breed() {
        }
    }
}
