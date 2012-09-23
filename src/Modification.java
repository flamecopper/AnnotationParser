public class Modification extends Annotation {
    private String eventID;
    Modification(String annotationID, String type, String eventID) {
       super(annotationID,type);
       this.eventID = eventID;
    }

    @Override
    public String toString() {
        return super.toString() + "Modification{" + "eventID=" + eventID + '}';
    }
}