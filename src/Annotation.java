public class Annotation {
    private String annotation_Id;
    private String type;//sematic
    public Annotation(String annotation_Id, String type) {
        this.annotation_Id = annotation_Id;
        this.type = type;
    }
    /**
     * @return the annotation_Id
     */
    public String getAnnotation_Id() {
        return annotation_Id;
    }
    /**
     * @param annotation_Id the annotation_Id to set
     */
    public void setAnnotation_Id(String annotation_Id) {
        this.annotation_Id = annotation_Id;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Annotation{" + "annotation_Id=" + annotation_Id + ", type=" + type + '}';
    }

}