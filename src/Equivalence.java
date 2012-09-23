public class Equivalence extends Annotation {
    private String ann1;
    private String ann2;
    Equivalence(String annotation_id,String sematic, String annID1, String annID2) {
        super(annotation_id,sematic);
        this.ann1 = annID1;
        this.ann2 = annID2;
    }
    @Override
    public String toString() {
        return super.toString() + "Equivalence{" + "ann1=" + ann1 + ", ann2=" + ann2 + '}';
    }
}