public class Main {
    // Need to figure out how arrays work for this sort of thing...
    public static void main(String[] args) {
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

        Tourney Tourney1 = new Tourney(
                "11/11/11", "11/15/11", "Detroit, Michigan",
                3, 5.00, 10.00);

        Tourney1.addCompetitor(-1, Person1);
        Tourney1.addCompetitor(4, Person1);
        Tourney1.addCompetitor(0, Person1);
        Tourney1.addCompetitor(1, Person2);
        Tourney1.addCompetitor(2, Person3);
        Tourney1.getCompetitors();
        System.out.println(Tourney1.showFinalStandings());
        System.out.println(Tourney1.createFinalStandings(0, 1, 2));
        System.out.println(Tourney1.showFinalStandings());

}}