package example_1;

/**
 * Created by Mezentsev.Y on 2/24/2016.
 */
public class Person {



    public Person(String lastName,
                  String firstName,
                  String midName,
                  String salutation,
                  String state,
                  String street,
                  boolean isFemale,
                  boolean isEmployed,
                  boolean isHaveHome) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.midName = midName;
        this.salutation = salutation;
        this.state = state;
        this.street = street;
        this.isFemale = isFemale;
        this.isEmployed = isEmployed;
        this.isHaveHome = isHaveHome;
    }

    private String lastName;
    private String firstName;
    private String midName;
    private String salutation;
    private String state;
    private String street;
    private boolean isFemale;
    private boolean isEmployed;
    private boolean isHaveHome;

    static class PersonBuilder{


        public PersonBuilder(String lastName, String firstName) {
            this.lastName = lastName;
            this.firstName = firstName;
        }

        private String lastName; //required
        private String firstName; //required
        private String midName; //optional
        private String salutation; //optional
        private String state; //optional
        private String street; //optional
        private boolean isFemale; //optional
        private boolean isEmployed; //optional
        private boolean isHaveHome; //optional



        public PersonBuilder setMidName(String midName) {
            this.midName = midName;
            return this;
        }


        public PersonBuilder setSalutation(String salutation) {
            this.salutation = salutation;
            return this;
        }


        public PersonBuilder setState(String state) {
            this.state = state;
            return this;
        }


        public PersonBuilder setStreet(String street) {
            this.street = street;
            return this;
        }


        public PersonBuilder setIsFemale(boolean isFemale) {
            this.isFemale = isFemale;
            return this;
        }



        public PersonBuilder setIsEmployed(boolean isEmployed) {
            this.isEmployed = isEmployed;
            return this;
        }


        public PersonBuilder setIsHaveHome(boolean isHaveHome) {
            this.isHaveHome = isHaveHome;
            return this;
        }

        public Person buildPerson(){
            return new Person(lastName,
                    firstName,
                    midName,
                    salutation,
                    state,
                    street,
                    isFemale,
                    isEmployed,
                    isHaveHome);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", midName='" + midName + '\'' +
                ", salutation='" + salutation + '\'' +
                ", state='" + state + '\'' +
                ", street='" + street + '\'' +
                ", isFemale=" + isFemale +
                ", isEmployed=" + isEmployed +
                ", isHaveHome=" + isHaveHome +
                '}';
    }
}
