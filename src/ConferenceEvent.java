import com.sun.java.accessibility.util.EventID;

public class ConferenceEvent{
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOfContact;
    private double eventCost;
    private int totalParticipants;
    private int totalEventDays;
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;
    private CalculateEventCostClass calculateEventCostObject=new CalculateEventCostClass();


    public ConferenceEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact, double eventCost, int totalParticipants, int totalEventDays,boolean breakfastRequired, double breakfastCost, boolean lunchRequired, double lunchCost, boolean dinnerRequired, double dinnerCost) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventPointOfContact = eventPointOfContact;
        this.eventCost = eventCost;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
        this.breakfastRequired = breakfastRequired;
        this.breakfastCost = breakfastCost;
        this.lunchRequired = lunchRequired;
        this.lunchCost = lunchCost;
        this.dinnerRequired = dinnerRequired;
        this.dinnerCost = dinnerCost;
    }

    public double calculateEventCost(){
         return  eventCost = calculateEventCostObject.calculateEventCost() + (calculateEventCostObject.calculateEventCost() * 0.3);
    }
    public String toString() {
        return "Conference Event details:"+'\n'+
                "Event ID: "+ eventID +'\n'+
                "Event Name: "+eventName+'\n'+
                "Event Location: "+eventLocation+'\n'+
                "Total Participants: "+totalParticipants+'\n'+
                "Total Event Cost:"+eventCost+'\n';
    }
}
