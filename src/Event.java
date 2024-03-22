public class event{
public static final double insuranceCost = 1000.00;
public static final double tax = 0.3;
private static final String EventName = null;


private String eventID;
private String eventName;
private String eventLocation;
private String pointofContact;
private double eventCost;
private int totalParticipants;
private int totalEventdays;



public  event(String eventID,String eventName,String eventLocation,String pointofContact,
double eventCost,int totalParticipants){
 this.eventID = eventID;
 this. eventName= eventName;
 this. eventLocation=eventLocation ;
 this. pointofContact= pointofContact;
 this.eventCost = eventCost;
 this. totalParticipants= totalParticipants;
 this. totalEventdays= totalEventdays;
}
public event(String eventID2, String eventName2, String eventLocation2, String pointOfContact2, int totalParticipants2,
        int totalEventDays2) {
    //TODO Auto-generated constructor stub
}
public String getEventname(){
    return EventName;
}
public  void getEventname(String eventName){
    this.eventName = eventName;
}
public String geteventID(){
    return eventID;
}
public  void geteventID(String eventID){
    this.eventID = eventID;
}
public String getEventLocation(){
    return eventLocation;
}
public  void getEventLocation(String eventLocation){
    this.eventLocation = eventLocation;
}
public double getEventCost(){
    return eventCost;
}
public  void getEventCost(double eventCost){
    this.eventCost = eventCost + (eventCost * 0.3)+(insuranceCost);
}
public String getpointofContact(){
    return pointofContact ;
}
public  void getpointofContact(String pointofContact){
    this. pointofContact= pointofContact;


}
public int gettotalParticipants(int totalParticipants){
    return totalParticipants ;
}
public  void settotalParticipants(int totalParticipants ){
    this.totalParticipants = totalParticipants;

}
public int gettotalEventdays(int totalEventdays){
    return totalEventdays ;
}
public  void settotalEventdays(int totalEventdays ){
    this.totalEventdays = totalEventdays;

}

public String toString(){
    return eventName + " " + eventID + " " + eventLocation + " " 
    + pointofContact + " " + eventCost +" " + totalParticipants + ""
    + totalEventdays;
    
}

public void calculateEventCost(){
    this.eventCost = eventCost + (eventCost * tax)+insuranceCost;
}


}