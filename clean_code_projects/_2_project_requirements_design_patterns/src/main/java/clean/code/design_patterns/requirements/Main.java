package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {
        //TODO implement your design patterns in this package

        Person necunoscut = new Person.PersonBuilder("Zat", "Bogdan")
                .address("Cernisoara")
                .build();

        Person necunoscut2 = new Person.PersonBuilder("Niculescu", "Ionela")
                .age(21)
                .phone("0764019528")
                .address("Vaideeni")
                .build();

    }
}