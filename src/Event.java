import java.util.ArrayList;
import java.util.HashMap;

public class Event extends Annotation {
   private HashMap <String,Annotation> arguements;
   private String trigger;
   Event(String annotationID,String type,String trigger,HashMap<String, Annotation> arguements) { 
       super(annotationID,type);
       this.trigger = trigger; 
       this.arguements = arguements;
   }
    /**
     * @return the arguments
     */
    public HashMap <String,Annotation> getArguements() {
        return arguements;
    }

    /**
     * @param arguments the arguments to set
     */
    public void setArguements(HashMap <String,String> arguments) {
        this.arguements = arguements;
    }

    @Override
    public String toString() {
        return super.toString() + "Event{" + "arguements=" + arguements + '}';
    }
    
}