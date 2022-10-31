package S4.Sprint4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MavenTest {

    // These tests are designed to slowly get more complicated as they go on. Then it tests!

    @Test
    public void test1(){
        Person Person = new Person(
                "Air Ray","2 Detroit Street",
                "Detroitborn@dmail.com", "444-4444",
                "Single", "11/10/11", "1 Year");

    Assertions.assertTrue(Person.getName() == "Air Ray");
    }

    @Test
    public void test2(){
        Person Person = new Person(
                "Air Ray","2 Detroit Street",
                "Detroitborn@dmail.com", "444-4444",
                "Single", "11/10/11", "1 Year");

        Assertions.assertTrue(Person.getCurrentTourney() == null);
    }

    @Test
    public void test3(){
        Person Person = new Person(
                "Air Ray","2 Detroit Street",
                "Detroitborn@dmail.com", "444-4444",
                "Single", "11/10/11", "1 Year");
        Tourney Tourney = new Tourney(
                "Wuhu Island Cup", "11/11/11", "11/15/11", "Detroit, Michigan",
                3, 5.55, 55.55);
        Tourney.addCompetitor(0, Person);

        Assertions.assertTrue(Person.getCurrentTourney().endsWith("up"));
    }

    @Test
    public void test4(){
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
        Tourney Tourney = new Tourney(
                "Wuhu Island Cup", "11/11/11", "11/15/11", "Detroit, Michigan",
                3, 5.55, 55.55);
        Tourney.addCompetitor(0, Person1);
        Tourney.addCompetitor(1, Person2);
        Tourney.addCompetitor(2, Person3);

        Assertions.assertTrue(Tourney.getCompetitor(0) == Person1.getName());
    }
    @Test
    public void test5(){
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
        Tourney Tourney = new Tourney(
                "Wuhu Island Cup", "11/11/11", "11/15/11", "Detroit, Michigan",
                3, 5.55, 55.55);
        Tourney.addCompetitor(0, Person1);
        Tourney.addCompetitor(1, Person2);
        Tourney.addCompetitor(2, Person3);

        Tourney.createFinalStandings(0, 1, 2);
        Person1.finishCurrentTourney();
        Person2.finishCurrentTourney();
        Person3.finishCurrentTourney();

        Assertions.assertTrue(Person1.getLastTourney() == Tourney.getTourneyName());
    }

}
