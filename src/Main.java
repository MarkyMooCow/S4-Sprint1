public class Main {
    public static void main(String[] args) {
            Person Person1 = new Person(
                    "Air Ray","2 Detroit Street",
                    "Detroitborn@dmail.com", "444-4444",
                    "Single", "11/10/11", "1 Year");

        Tourney Tourney1 = new Tourney(
                "11/11/11", "11/15/11", "Detroit, Michigan",
                Person1.getName(), null, 5.00, 10.00);

        System.out.println(Tourney1.competitors);
    }
}