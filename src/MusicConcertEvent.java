public class MusicConcertEvent {
    public MusicConcertEvent(boolean b, double d) {
        //TODO Auto-generated constructor stub
    }

    public class MusicConcertEvent {  
        private boolean merchandiseRequired;  
        private double merchandiseCost;  
      
        public MusicConcertEvent(boolean merchandiseRequired, double merchandiseCost) {  
            this.merchandiseRequired = merchandiseRequired;  
            this.merchandiseCost = merchandiseCost;  
        }  
      
        public double calculateEventCost() {  
            double eventCost = 0.0;  
            if (merchandiseRequired) {  
                eventCost += merchandiseCost;  
            }  
            // Here you can add other costs related to the event, such as venue rental, artist fees, etc.  
            // For simplicity, we're assuming the merchandise cost is the only cost for now.  
            return eventCost;  
        }  
      
        @Override  
        public String toString() {  
            return "Music Concert Event Details:\n" +  
                    "Merchandise Required: " + merchandiseRequired + "\n" +  
                    "Merchandise Cost: $" + merchandiseCost;  
        }  
    }

    public double calculateEventCost() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateEventCost'");
    }
}
