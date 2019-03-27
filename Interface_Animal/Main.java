class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();  // Create a Pig object
        Dog myDog = new Dog();  // Create a Dog object
        myPig.animalSound();
        myPig.sleep();
        myPig.eat();
        myDog.animalSound();
        myDog.sleep();
        myDog.eat();
    }
}