public class Person extends Tourney {
    // Variables!
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
    public Person( // Regular Constructor
            String name, String address, String email, String phone,
            String membershipType, String membershipStart, String membershipDuration)
    {
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

    // We're acquiring the information we need.
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
    // These are more advanced so the code doesn't crash.
    public String getCurrentTourney(){
        if (currentTourney == null) {
            return null;
        } else {
            return this.currentTourney.getTourneyName();
        }}
    public String getLastTourney(){
        if (this.lastTourney == null) {
        return null;
        } else {
        return this.lastTourney.getTourneyName();
    }}
    public String getNextTourney(){
        if (this.nextTourney == null) {
            return null;
        } else {
        return this.nextTourney.getTourneyName();
    }}

    // These change up our tournaments.
    public Tourney makeCurrentTourney(Tourney t){
        return this.currentTourney = t;
    }
    public void finishCurrentTourney(){
        this.lastTourney = this.currentTourney;
        this.currentTourney = null;
    }
    public Tourney makeLastTourney(Tourney t){
        return this.lastTourney = t;
    }
    public Tourney makeNextTourney(Tourney t){
        return this.nextTourney = t;
    }
    // And finally, our toString()!
    public String toString()
    {
        return
                "Here's this persons information!" +
                "\n Name: " + getName() +
                "\n Address: " + getAddress() +
                "\n Email: " + getEmail() +
                "\n Phone: " + getPhone() +
                "\n Membership Type: " + getMembershipType() +
                "\n Membership Start: " + getMembershipStart() +
                "\n Membership Duration: " + getMembershipDuration() +
                "\n Current Tourney: " + getCurrentTourney() +
                "\n Last Tourney: " + getLastTourney() +
                "\n Next Tourney: " + getNextTourney();
    }
}
