public class Person extends Tourney {
    private String name, address, email, phone, membershipType, membershipStart, membershipDuration, type;
    private Tourney currentTourney, pastTourneys, futureTourneys;

    public Person() {  // Default Constructor
        this.name = null;
        this.address = null;
        this.email = null;
        this.phone = null;
        this.membershipType = null;
        this.membershipStart = null;
        this.membershipDuration = null;
        this.currentTourney = null;
        this.pastTourneys = null;
        this.futureTourneys = null;
    }
    public Person(String name, String address, String email, String phone,
                  String membershipType, String membershipStart, String membershipDuration
    ) {  // Regular Constructor
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.membershipType = membershipType;
        this.membershipStart = membershipStart;
        this.membershipDuration = membershipDuration;
        this.currentTourney = null;
        this.pastTourneys = null;
        this.futureTourneys = null;
    }

    public String getName(){
        return this.name;
    }
}
