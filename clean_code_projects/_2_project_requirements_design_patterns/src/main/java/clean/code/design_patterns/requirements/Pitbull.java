package clean.code.design_patterns.requirements;

public class Pitbull extends Dog{
    public boolean dangerous;

    public Pitbull(int years, String name, boolean fur, boolean bark, boolean dangerous) {
        super(years, name, fur, bark);
        this.dangerous = dangerous;
    }
}
