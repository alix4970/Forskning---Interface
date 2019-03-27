public class Dog implements Animal{
    @Override
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The Dog says: wuf wuf");
    }

    @Override
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("ZZZ");
    }

    @Override
    public void eat() {
        // The body of eat() is provided here
        System.out.println("The dog eats: Cats");
    }
}
