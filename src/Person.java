public class Person extends Tourney {
    private String name, address, email, phone, membershipType, membershipStart, membershipDuration, type;
    private Tourney currentTourney, lastTourney, nextTourney;

    public Person() {  // Default Constructor
        this.name = null;
        this.address = null;
        this.email = null;
        this.phone = null;
        this.membershipType = null;
        this.membershipStart = null;
        this.membershipDuration = null;
        this.currentTourney = null;
        this.lastTourney = null;
        this.nextTourney = null;
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
        this.lastTourney = null;
        this.nextTourney = null;
    }

    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhone(){
        return this.phone;
    }
    public String getMembershipType(){
        return this.membershipType;
    }
    public String getMembershipStart(){
        return this.membershipStart;
    }
    public String getMembershipDuration(){
        return this.membershipDuration;
    }
    public String getCurrentTourney(){
        return this.currentTourney.tourneyName;
    }
    public String getLastTourney(){
        return this.lastTourney.tourneyName;
    }
    public String getNextTourney(){
        return this.nextTourney.tourneyName;
    }

    public Tourney makeCurrentTourney(Tourney t){
        return this.currentTourney = t;
    }
    public Tourney makeLastTourney(Tourney t){
        return this.lastTourney = t;
    }
    public Tourney makeNextTourney(Tourney t){
        return this.nextTourney = t;
    }
    // public String toString()
}
