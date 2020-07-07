package clean.code.design_patterns.requirements;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phoneNumber;
    private final String adress;

    private Person(PersonBuilder builder){
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
        this.age=builder.age;
        this.phoneNumber=builder.phoneNumber;
        this.adress=builder.adress;
    }


    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAdress() {
        return adress;
    }
    

    @Override
    public String toString() {
        return  "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", adress='" + adress + '\'' +
                '}';


     }
    public static class PersonBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phoneNumber;
        private String adress;

        public PersonBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }
        public PersonBuilder phone(String phone) {
            this.phoneNumber= phone;
            return this;
        }
        public PersonBuilder address(String address) {
            this.adress = address;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}

