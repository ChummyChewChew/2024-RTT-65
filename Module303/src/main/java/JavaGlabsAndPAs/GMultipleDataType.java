package JavaGlabsAndPAs;

public class GMultipleDataType <Datatypeone, Datatypetwo> {
    Datatypeone valueone;
    Datatypetwo valuetwo;

    public  GMultipleDataType (Datatypeone valueone, Datatypetwo valuetwo) {
        this.valueone = valueone;
        this.valuetwo = valuetwo;
    }

    public Datatypeone getValueone() {
        return valueone;
    }
    public void setValueone(Datatypeone valueone) {
        this.valueone = valueone;
    }
    public Datatypetwo getValuetwo() {
        return valuetwo;
    }
    public void setValuetwo(Datatypetwo valuetwo) {
        this.valuetwo = valuetwo;
    }
}
