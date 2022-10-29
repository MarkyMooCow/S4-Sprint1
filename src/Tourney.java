public class Tourney {
        public String tourneyName, startDate, endDate, location;;
        public Person[] competitors, finalStandings;
        public double entryFee, cashPrize;

        public Tourney() // Default Constructor
        {
            this.tourneyName = null;
            this.startDate = null;
            this.endDate = null;
            this.location = null;
            this.competitors = new Person[5]; // 5 will be the default competitor amount;
            this.finalStandings = new Person[3];
            this.entryFee = 0;
            this.cashPrize = 0;
        }

    public Tourney(
            String tourneyName, String startDate, String endDate, String location,
            int compLength, double entryFee, double cashPrize)
        {
            this.tourneyName = tourneyName;
            this.startDate = startDate;
            this.endDate = endDate;
            this.location = location;
            this.competitors = new Person[compLength];
            this.finalStandings = new Person[3];
            this.entryFee = entryFee;
            this.cashPrize = cashPrize;
        }
    public String getTourneyName(){
        return this.tourneyName;
    }
    public String getStartDate() { return this.startDate; }
    public String getEndDate(){
        return this.endDate;
    }
    public String getLocation(){
        return this.location;
    }
    public Person getCompetitor(int x){
        return this.competitors[x];
    }
    public void getCompetitors(){
            System.out.println("Here's our current competitors!");
        for (int i = 0; i < this.competitors.length; i++) {
            if (this.competitors[i] != null) {
                System.out.println(this.competitors[i].getName());
            } else {
                System.out.println("[Vacant]");
            }}}
    public void addCompetitor(int i, Person Peep){
            if (i > this.competitors.length || i < 0) {
                System.out.println("Competitor placement is outside of the competitor range!");
            } else {
                    if (this.competitors[i] != null) {
                        System.out.println("Slot filled! " + this.competitors[i].getName() + " will be replaced!");
                        this.competitors[i] = Peep;
                        Peep.makeCurrentTourney(this);
                        System.out.println("Competitor replaced!");
                    } else {
                        this.competitors[i] = Peep;
                        Peep.makeCurrentTourney(this);
                        System.out.println("Competitor added!");
                    }
                }}
    public String createFinalStandings(int first, int second, int third) {
        this.finalStandings[0] = this.competitors[first];
        this.finalStandings[1] = this.competitors[second];
        this.finalStandings[2] = this.competitors[third];
        return "Final Standings Created!" +
                "\n First: " + this.finalStandings[0].getName() +
                "\n Second: " + this.finalStandings[1].getName() +
                "\n Third: " + this.finalStandings[2].getName();
        }
        public String getFinalStandings(){
            if (this.finalStandings[0] == null) {
                return "There is no final standings yet! You must create them!";
            } else {
            return "Final Standings!" +
                "\n First: " + this.finalStandings[0].getName() +
                "\n Second: " + this.finalStandings[1].getName() +
                "\n Third: " + this.finalStandings[2].getName();
        }}
    public double getEntryFee() {
        return this.entryFee;
    }
    public double getCashPrize() {
        return this.cashPrize;
    }
}
