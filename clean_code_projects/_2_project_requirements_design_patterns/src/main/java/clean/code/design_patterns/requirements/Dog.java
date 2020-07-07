package clean.code.design_patterns.requirements;

public class Dog extends Animal{
    private boolean bark;

    public Dog(int years, String name, boolean fur, boolean bark) {
        super(years, name, fur);
        this.bark = bark;
    }

    @Override
    public void makeNoise() {
        System.out.println("Ham");
    }
}
