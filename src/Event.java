import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.ArrayList;  
import java.util.Date;  
import java.util.InputMismatchException;  
import java.util.Scanner;  
  
public class Event {  
    private String eventID;  
    private String eventName;  
    private String eventVenue;  
    private Date eventDate;  
    private ArrayList<String> eventAttendees;   
    public Event(String eventID, String eventName, String eventVenue, String eventDate) throws ParseException {  
        this.eventID = eventID;  
        this.eventName = eventName;  
        this.eventVenue = eventVenue;  
        this.eventDate = new SimpleDateFormat("yyyy-MM-dd").parse(eventDate);  
        this.eventAttendees = new ArrayList<>();  
    }    
    public String getEventID() {  
        return eventID;  
    }  
  
    public void setEventID(String eventID) {  
        this.eventID = eventID;  
    }  
  
    public String getEventName() {  
        return eventName;  
    }  
  
    public void setEventName(String eventName) {  
        this.eventName = eventName;  
    }  
  
    public String getEventVenue() {  
        return eventVenue;  
    }  
  
    public void setEventVenue(String eventVenue) {  
        this.eventVenue = eventVenue;  
    }  
  
    public Date getEventDate() {  
        return eventDate;  
    }  
  
    public void setEventDate(String eventDate) throws ParseException {  
        this.eventDate = new SimpleDateFormat("yyyy-MM-dd").parse(eventDate);  
    }  
  
    public ArrayList<String> getEventAttendees() {  
        return eventAttendees;  
    }  
  
    public void setEventAttendees(ArrayList<String> eventAttendees) {  
        this.eventAttendees = eventAttendees;  
    }   
    public void addAttendee(String attendee) {  
        eventAttendees.add(attendee);  
    }    
    public void removeAttendee(String attendee) {  
        eventAttendees.remove(attendee);  
    }  
    public void updateAttendee(String oldName, String newName) {  
        int index = eventAttendees.indexOf(oldName);  
        if (index != -1) {  
             eventAttendees.set(index, newName);  
         }  
     }  
  
 
    public boolean findAttendee(String attendee) {  
        return eventAttendees.contains(attendee);  
    }  
  
     
    public int getTotalAttendees() {  
        return eventAttendees.size();  
    }  
  
   
    @Override  
    public String toString() {  
        return "Event{" +  
                "eventID='" + eventID + '\'' +  
                ", eventName='" + eventName + '\'' +  
                ", eventVenue='" + eventVenue + '\'' +  
                ", eventDate=" + eventDate +  
                ", eventAttendees=" + eventAttendees +  
                '}';  
    }  
  
    
    public void organizeEvent() {  
         
        System.out.println("Event organized: " + this);  
        System.out.println("Total attendees: " + getTotalAttendees());  
    }  
  
    
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        try {  
            System.out.println("Enter event ID:");  
            String eventID = scanner.nextLine();  
            System.out.println("Enter event name:");  
            String eventName = scanner.nextLine();  
            System.out.println("Enter event venue:");  
            String eventVenue = scanner.nextLine();  
            System.out.println("Enter event date (yyyy-MM-dd):");  
            String eventDate = scanner.nextLine();  
  
            Event event = new Event(eventID, eventName, eventVenue, eventDate);
            while (true) {  
                System.out.println("\nEvent Management Menu:");  
                System.out.println("1. Add Attendee");  
                System.out.println("2. Remove Attendee");  
                 System.out.println("3. Update Attendee");  
                System.out.println("4. Find Attendee");  
                System.out.println("5. Display Attendees");  
                System.out.println("6. Exit");  
    
                System.out.print("Enter your choice: ");  
                int choice = scanner.nextInt();  
                scanner.nextLine();   
    
                switch (choice) {  
                    case 1:  
                        System.out.print("Enter attendee name: ");  
                        String attendeeName = scanner.nextLine();  
                        event.addAttendee(attendeeName);  
                        break;  
                    case 2:  
                        System.out.print("Enter attendee name to remove: ");  
                        String removeName = scanner.nextLine();  
                        event.removeAttendee(removeName);  
                        break;  
                    case 3:  
                         System.out.print("Enter old attendee name: ");  
                        String oldName = scanner.nextLine();  
                         System.out.print("Enter new attendee name: ");  
                         String newName = scanner.nextLine();  
                           event.updateAttendee(oldName, newName); 
                        break;  
                    case 4:  
                        System.out.print("Enter attendee name to find: ");  
                        String findName = scanner.nextLine();  
                        if (event.findAttendee(findName)) {  
                            System.out.println(findName + " is attending the event.");  
                        } else {  
                            System.out.println(findName + " is not attending the event.");  
                        }  
                        break;  
                    case 5:  
                        System.out.println("Attendees:");  
                        for (String attendee : event.getEventAttendees()) {  
                            System.out.println(attendee);  
                        }  
                        break;  

                    case 6:  
                        System.out.println("Exiting...");  
                        event.organizeEvent(); 
                        scanner.close();  
                        return;  
                    default:  
                        System.out.println("Invalid choice. Please try again.");  
                }  
            }  
        } catch (ParseException | InputMismatchException e) {  
            System.out.println("Error: " + e.getMessage());  
        }  
    }

}