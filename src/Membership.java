/* public class Membership {
    private String date, duration, type;
    private Tourney currentTourney, pastTourneys, futureTourneys;

    public Membership() {  // Default Constructor
        this.date = null;
        this.duration = null;
        this.type = null;
        this.currentTourney = null;
        this.pastTourneys = null;
        this.futureTourneys = null;
    }

    // Need to figure out the arrays for past and future...
    public Membership( // Regular Constructor
            String da, String du, String ty,
            Tourney cTour, Tourney pTour, Tourney fTour)
    {
        this.date = da;
        this.duration = du;
        this.type = ty;
        this.currentTourney = cTour;
        this.pastTourneys = pTour;
        this.futureTourneys = fTour;
    }

    // Get the information!
    public String getDate(){
        return this.date;
    }
    public String getDuration(){
        return this.duration;
    }
    public String getType(){
        return this.type;
    }
    public Tourney getCurrentTourney(){
        return this.currentTourney;
    }
    public Tourney getPastTourneys(){
        return this.pastTourneys;
    }
    public Tourney getFutureTourneys(){
        return this.futureTourneys;
    }
}

*/