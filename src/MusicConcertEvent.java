public class MusicConcertEvent{
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOfContact;
    private double eventCost;
    private int totalParticipants;
    private int totalEventDays;
    private boolean merchandiseRequired;
    private double merchandiseCost;
    private CalculateEventCostClass calculateEventCostObject=new CalculateEventCostClass();

    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact, double eventCost, int totalParticipants,int totalEventDays, boolean merchandiseRequired, double merchandiseCost) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventPointOfContact = eventPointOfContact;
        this.eventCost = eventCost;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
        this.merchandiseRequired = merchandiseRequired;
        this.merchandiseCost = merchandiseCost;
    }

    public double calculateEventCost(){
        return eventCost = calculateEventCostObject.calculateEventCost() + (calculateEventCostObject.calculateEventCost() * 0.3);
    }
    public String toString() {
      return "Music Concert Event details:"+'\n'+
              "Event ID: "+eventID+'\n'+
              "Event Name: "+eventName+'\n'+
              "Event Location: "+eventLocation+'\n'+
              "Total Participants: "+totalParticipants+'\n'+
              "Total Event Cost:"+calculateEventCost()+'\n';
    }
}