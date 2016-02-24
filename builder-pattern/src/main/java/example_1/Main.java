package example_1;

/**
 * Created by Mezentsev.Y on 2/24/2016.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("Yuriy","Mezentsev")
                .setMidName("Ser")
                .setIsEmployed(true)
                .setIsFemale(true)
                .setIsHaveHome(true)
                .setSalutation("rrrr")
                .setState("XXXX")
                .setStreet("Newton")
                .buildPerson();

        System.out.println(person.toString());
    }
}
