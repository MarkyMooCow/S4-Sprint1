public class Tourney {
        private String startDate, endDate, location, competitors, finalStandings;
        private double entryFee, cashPrize;

        public Tourney() // Default Constructor
        {
            this.startDate = null;
            this.endDate = null;
            this.location = null;
            this.competitors = null;
            this.finalStandings = null;
            this.entryFee = 0;
            this.cashPrize = 0;
        }

    public Tourney(
            String startDate, String endDate, String location, String competitors, String finalStandings,
            double entryFee, double cashPrize)
        {
            this.startDate = startDate;
            this.endDate = endDate;
            this.location = location;
            this.competitors = competitors;
            this.finalStandings = finalStandings;
            this.entryFee = entryFee;
            this.cashPrize = cashPrize;
        }
}
