public class Relation extends Annotation {
    String arg1;
    String arg2;
    Relation(String annotationID,String type, String arg1, String arg2) {
        super(annotationID,type);
        this.arg1 = arg1;
        this.arg2 = arg2;
    }
    @Override
    public String toString() {
        return super.toString() + "Relation{" + "arg1=" + arg1 + ", arg2=" + arg2 + '}';
    }
    
}