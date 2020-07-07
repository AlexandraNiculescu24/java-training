package clean.code.design_patterns.requirements;

public class Animal {
    private int years;
    private String name;
    private boolean fur;

    public Animal(int years, String name, boolean fur){
        this.years=years;
        this.name=name;
        this.fur=fur;
    }

    public int getYears() {
        return years;
    }

    public String getName() {
        return name;
    }

    public boolean isFur() {
        return fur;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public void makeNoise() {
        System.out.println("Generic noise");
    }
}
