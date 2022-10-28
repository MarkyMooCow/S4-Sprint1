public class Main {
    // Need to figure out how arrays work for this sort of thing...
    public static void main(String[] args) {
            Person Person1 = new Person(
                    "Air Ray","2 Detroit Street",
                    "Detroitborn@dmail.com", "444-4444",
                    "Single", "11/10/11", "1 Year");

        Tourney Tourney1 = new Tourney(
                "11/11/11", "11/15/11", "Detroit, Michigan",
                null, 3, 5.00, 10.00);

        Tourney1.addCompetitor(-1, Person1);
        Tourney1.addCompetitor(4, Person1);
        Tourney1.addCompetitor(0, Person1);
        Tourney1.getCompetitors();
    }
}