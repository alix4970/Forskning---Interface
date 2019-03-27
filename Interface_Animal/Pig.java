class Pig implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }

    @Override
    public void eat() {
        // The body of eat() is provided here
        System.out.println("The pig eats: Apples");
    }
}