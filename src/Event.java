import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Scanner;  
import java.util.ArrayList;  
import java.util.List;  
  
public class Event {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        List<Event> events = new ArrayList<>();  
  
         
        while (true) {  
            System.out.println("Please enter the details of an event (or 'exit' to quit):");  
  
             
            System.out.print("Enter event name: ");  
            String eventName = scanner.nextLine();  
            if (eventName.equalsIgnoreCase("exit")) {  
                break;   
            }  
  
             
            System.out.print("Enter event venue: ");  
            @SuppressWarnings("unused")
            String eventVenue = scanner.nextLine();  
  
              
            System.out.print("Enter event date (YYYY-MM-DD): ");  
            String eventDateString = scanner.nextLine();  
  
             
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
            @SuppressWarnings("unused")
            Date eventDate = null;  
            try {  
                eventDate = dateFormat.parse(eventDateString);  
            } catch (ParseException e) {  
                System.out.println("Invalid date format. Please try again.");  
                continue;  
            }  
  
             
            System.out.print("Enter the names of the participants (separated by commas): ");  
            @SuppressWarnings("unused")
            String[] participantNames = scanner.nextLine().split(",");  
  
            
  
            
            System.out.println("Created event:");  
            System.out.println("event");  
  
            
            System.out.println("All events created:");  
            for (Event e : events) {  
                System.out.println(e);  
            }  
        }  
  
         
        scanner.close();  
    }  
}  
  
