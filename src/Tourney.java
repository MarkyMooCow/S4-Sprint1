public class Tourney {
        public String startDate, endDate, location;
        public String[] competitors, finalStandings;
        public double entryFee, cashPrize;

        public Tourney() // Default Constructor
        {
            this.startDate = null;
            this.endDate = null;
            this.location = null;
            this.competitors = new String[5]; // 5 will be the default competitor amount;
            this.finalStandings = new String[3];
            this.entryFee = 0;
            this.cashPrize = 0;
        }

    public Tourney(
            String startDate, String endDate, String location,
            int compLength, double entryFee, double cashPrize)
        {
            this.startDate = startDate;
            this.endDate = endDate;
            this.location = location;
            this.competitors = new String[compLength];
            this.finalStandings = new String[3];
            this.entryFee = entryFee;
            this.cashPrize = cashPrize;
        }
    public String getStartDate(){
        return this.startDate;
    }
    public String getEndDate(){
        return this.endDate;
    }
    public String getLocation(){
        return this.location;
    }
    public String getCompetitor(int x){
        return this.competitors[x];
    }
    public void getCompetitors(){
        for (int i = 0; i < this.competitors.length; i++) {
            if (this.competitors[i] != null) {
                System.out.println(this.competitors[i]);
            } else {
                System.out.println("[Vacant]");
            }}}
    public void addCompetitor(int i, Person Peep){
            if (i > this.competitors.length || i < 0) {
                System.out.println("I is out of the range in this scenario, so don't execute the Queen Of France");
            } else {
                if (this.competitors[i] != null) {
                    System.out.println("Slot filled! " + this.competitors[i] + " will be replaced!");
                    this.competitors[i] = Peep.getName();
                    System.out.println("Competitor replaced!");
                } else {
                    this.competitors[i] = Peep.getName();
                    System.out.println("Competitor added!");
                }}}
    public String createFinalStandings(int first, int second, int third) {
        this.finalStandings[0] = this.competitors[first];
        this.finalStandings[1] = this.competitors[second];
        this.finalStandings[2] = this.competitors[third];
        return "Final Standings Created!" +
                "\n First: " + this.finalStandings[0] +
                "\n Second: " + this.finalStandings[1] +
                "\n Third: " + this.finalStandings[2];
        }
        public String showFinalStandings(){
            if (this.finalStandings[0] == null) {
                return "There is no final standings yet! You must create them!";
            } else {
            return "Final Standings!" +
                "\n First: " + this.finalStandings[0] +
                "\n Second: " + this.finalStandings[1] +
                "\n Third: " + this.finalStandings[2];
        }}
    /* public String getFinalStandings(){
        return this.finalStandings;
    } */
    public double getEntryFee() {
        return this.entryFee;
    }
    public double getCashPrize() {
        return this.cashPrize;
    }
}
