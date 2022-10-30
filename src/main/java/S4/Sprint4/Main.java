package S4.Sprint4;

public class Main {
    public static void main(String[] args) {
        // Create our real people
        Person Person1 = new Person(
                "Air Ray","2 Detroit Street",
                "Detroitborn@dmail.com", "444-4444",
                "Single", "11/10/11", "1 Year");
        Person Person2 = new Person(
                "Detroit Michigan","3 Detroit Street",
                "Detroithimself@dmail.com", "420-6969",
                "Premium", "11/11/11", "5 Years");
        Person Person3 = new Person(
                "Bob","0 Bob Bob",
                "Bob@bob.bob", "808-8008",
                "Bob", "08/08/08", "10 Years");

        // Create a test tournament!
        Tourney Tourney1 = new Tourney(
                "Wuhu Island Cup", "11/11/11", "11/15/11", "Detroit, Michigan",
                3, 5.55, 55.55); // I'm cheap OK?

        // These won't succeed at all lmao
        Tourney1.addCompetitor(-1, Person1);
        Tourney1.addCompetitor(4, Person1);
        System.out.println("/////////////////");
        // Will actually succeed
        Tourney1.addCompetitor(0, Person1);
        Tourney1.addCompetitor(1, Person2);
        Tourney1.addCompetitor(2, Person3);
        System.out.println("/////////////////");
        // Show off the goods and go through an entire tournament!
        Tourney1.getCompetitors();
        System.out.println("/////////////////");
        System.out.println(Tourney1.getFinalStandings()); // Meant to fail.
        System.out.println("/////////////////");
        System.out.println(Tourney1.createFinalStandings(0, 1, 2));
        System.out.println("/////////////////");
        System.out.println(Tourney1.getFinalStandings());
        System.out.println("/////////////////");
        // toString() methods
        Person1.finishCurrentTourney();
        Person2.finishCurrentTourney();
        Person3.finishCurrentTourney();
        System.out.println(Person1);
        System.out.println("/////////////////");
        System.out.println(Tourney1);
}}