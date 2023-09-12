package co.com.bancolombia.certification.models;


import co.com.bancolombia.certification.models.builders.DataBuilder;

public class DataCertification {

    private String idTypeCertification;
    private String tittleTestPlan;
    private String assignedTo;
    private String area;
    private String iteration;
    private String description;
    private String typeTestPlan;
    private String relatedParent;
    private String relatedHu;
    private String fieldRelated;

    public DataCertification(DataBuilder dataBuilder){
        this.idTypeCertification = dataBuilder.getListData().get(0).getIdTypeCertification();
        this.tittleTestPlan = dataBuilder.getListData().get(0).getTittleTestPlan();
        this.assignedTo = dataBuilder.getListData().get(0).getAssignedTo();
        this.area = dataBuilder.getListData().get(0).getArea();
        this.iteration = dataBuilder.getListData().get(0).getIteration();
        this.description = dataBuilder.getListData().get(0).getDescription();
        this.typeTestPlan = dataBuilder.getListData().get(0).getTypeTestPlan();
        this.relatedParent = dataBuilder.getListData().get(0).getRelatedParent();
        this.relatedHu = dataBuilder.getListData().get(0).getRelatedHu();
        this.fieldRelated = dataBuilder.getListData().get(0).getFieldRelated();

    }

    public String getIdTypeCertification() {
        return idTypeCertification;
    }

    public String getTittleTestPlan() {
        return tittleTestPlan;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public String getArea() {
        return area;
    }

    public String getIteration() {
        return iteration;
    }

    public String getDescription() {
        return description;
    }

    public String getTypeTestPlan() {
        return typeTestPlan;
    }

    public String getRelatedParent() {
        return relatedParent;
    }

    public String getRelatedHu() {
        return relatedHu;
    }

    public String getFieldRelated() {
        return fieldRelated;
    }
}
