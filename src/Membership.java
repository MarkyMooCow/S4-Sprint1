public class Membership {
    private String date, duration, type, currentTourney, pastTourneys, futureTourneys;

    public Membership() {  // Default Constructor
        this.date = null;
        this.duration = null;
        this.type = null;
        this.currentTourney = null;
        this.pastTourneys = null;
        this.futureTourneys = null;
    }

    // Need to figure out the arrays for past and future...
    public Membership(String da, String du, String ty, String cTour, String pTour, String fTour) {  // Regular Constructor
        this.date = da;
        this.duration = du;
        this.type = ty;
        this.currentTourney = cTour;
        this.pastTourneys = pTour;
        this.futureTourneys = fTour;
    }
    public String getDate(){
        return this.date;
    }
    public String getDuration(){
        return this.duration;
    }
    public String getType(){
        return this.type;
    }
    public String getCurrentTourney(){
        return this.currentTourney;
    }
    public String getPastTourneys(){
        return this.pastTourneys;
    }
    public String getFutureTourneys(){
        return this.futureTourneys;
    }
}

