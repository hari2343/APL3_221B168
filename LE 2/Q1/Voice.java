class Voice {
    // Method to prepare the voice array
    public void prepareVoice() {
        // Create an array of Animal objects with size 5
        Animal[] animals = new Animal[5];
        
        // Assign objects to array elements
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
        
        // Call the hear method
        hear(animals);
    }

    // Method to loop through the array and call makeVoice
    public void hear(Animal[] animals) {
        for (Animal animal : animals) {
            animal.makeVoice(); // Polymorphism: Calls the appropriate makeVoice method based on the object type
        }
    }
}
