public class Tourney {
        public String startDate, endDate, location, finalStandings;
        public String[] competitors;
        public double entryFee, cashPrize;

        public Tourney() // Default Constructor
        {
            this.startDate = null;
            this.endDate = null;
            this.location = null;
            this.competitors = new String[5]; // 5 will be the default competitor amount;
            this.finalStandings = null;
            this.entryFee = 0;
            this.cashPrize = 0;
        }

    public Tourney(
            String startDate, String endDate, String location, String finalStandings,
            int compLength, double entryFee, double cashPrize)
        {
            this.startDate = startDate;
            this.endDate = endDate;
            this.location = location;
            this.competitors = new String[compLength];
            this.finalStandings = finalStandings;
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
                System.out.println("I is in the range, so BRAAAAP");
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
