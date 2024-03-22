public class ConferenceEvent extends event{
    private double breakfastCost;
    @SuppressWarnings("unused")
    private boolean lunchRequired;
    private double lunchCost;
    @SuppressWarnings("unused")
    private boolean dinnerRequired;
    private double dinnerCost;
    private double conferenceEventCost;

    public double getBreakfastCost(){
        return breakfastCost;
    }

    public void setBreakfastCost(double breakfastCost){
        this.breakfastCost = breakfastCost;
    }

    public double getLunchCost(){
        return lunchCost;
    }

    public void setLunchCost(double lunchCost){
        this.lunchCost = lunchCost;
    }

    public double getDinnerCost(){
        return dinnerCost;
    }

    public ConferenceEvent(String eventID, String eventName, String eventLocation, String pointOfContact, int totalParticipants, int totalEventDays, 
    double breakfastCost, double lunchCost, double dinnerCost){
        super(eventID, eventName, eventLocation, pointOfContact, totalParticipants, totalEventDays);
        this.breakfastCost = breakfastCost;
        this.lunchCost = lunchCost;
        this.dinnerCost = dinnerCost;
    }


    @Override
    public void calculateEventCost(){
        super.calculateEventCost();
        conferenceEventCost = getEventCost() + ((breakfastCost + lunchCost + dinnerCost) * getTotalParticipants() * getTotalEventDays());
    }


    @Override
    public String toString(){
        return "Conference Event details: " + "\n" +
        "Event ID: " + getEventCost() + "\n" +
        "Event Name: " + getEventCost() + "\n" +
        "Event Location: " + getEventLocation() + "\n" +
        "Total participants: " + getTotalParticipants() + "\n" +
        "Total Conference Cost: " + conferenceEventCost;
    }

    private String getTotalParticipants() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getTotalParticipants'");
    } 
        
}

    
