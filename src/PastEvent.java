
import java.time.LocalDate;  
  
class Event {  
    // Event class implementation (if needed)  
}  
  
class PastEvents extends Event {  
    private LocalDate eventStartDate;  
    private LocalDate eventEndDate;  
    private String paymentStatus;  
    private boolean requiresExtension;  
    private static final double eventCost = 10_000;  
    private String paymentDetails;  
  
    public void PastEvent(LocalDate eventStartDate, LocalDate eventEndDate, String paymentStatus, boolean requiresExtension) {  
        this.eventStartDate = eventStartDate;  
        this.eventEndDate = eventEndDate;  
        this.paymentStatus = paymentStatus;  
        this.requiresExtension = requiresExtension;  
        updatePaymentDetails();  
    }  
  
    

    private void updatePaymentDetails() {  
        paymentDetails = "The event cost was " + eventCost + " and the payment status is " + paymentStatus + ". The Customer requires extension?: " + requiresExtension;  
    }  
  
    @Override  
    public String toString() {  
        return "PastEvents{" +  
                "eventStartDate=" + eventStartDate +  
                ", eventEndDate=" + eventEndDate +  
                ", paymentStatus='" + paymentStatus + '\'' +  
                ", requiresExtension=" + requiresExtension +  
                ", paymentDetails='" + paymentDetails + '\'' +  
                '}';  
    }  
  
    public String getPaymentDetails() {  
        return paymentDetails;  
    }  
}  
  