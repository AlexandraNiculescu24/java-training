package clean.code.design_patterns.requirements;

public class Cat extends Animal {
    private boolean purrs;

    public Cat(int years, String name, boolean fur, boolean purrs) {
        super(years, name, fur);
        this.purrs = purrs;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }
}
