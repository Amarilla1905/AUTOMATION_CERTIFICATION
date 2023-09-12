package co.com.bancolombia.certification.models.builders;

import co.com.bancolombia.certification.models.DataCertification;
import co.com.bancolombia.certification.utils.Builder;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class DataBuilder implements Builder<DataCertification> {

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

    protected static DataCertification objDataCertfication;


    private List<DataBuilder> listData = new ArrayList<>();

    private DataBuilder(Map<String, String> data) {

        this.tittleTestPlan = data.get("tittleTestPlan");
        this.assignedTo = data.get("assignedTo");
        this.area = data.get("area");
        this.iteration = data.get("iteration");
        this.description = data.get("description");
        this.typeTestPlan = data.get("typeTestPlan");
        this.relatedParent = data.get("relatedParent");
        this.relatedHu = data.get("relatedHu");
        this.fieldRelated = data.get("fieldRelated");
    }

    public static DataBuilder dataTestPlan(List<Map<String, String>> DataCertification) {
        return new DataBuilder(DataCertification);
    }

    public DataBuilder(List<Map<String, String>> dataCard) {
        createConstructor(dataCard);
    }

    private void createConstructor(List<Map<String, String>> dataCard) {
        for (Map<String, String> data : dataCard) {
            listData.add(new DataBuilder(data));
        }
    }

    public static void setData(DataCertification dataCertification) {
        DataBuilder.objDataCertfication = dataCertification;
    }


    @Override
    public DataCertification build() {
        DataCertification createdDataCertification = new DataCertification(this);
        DataBuilder.setData(createdDataCertification);
        return createdDataCertification;

    }

    public List<DataBuilder> getListData() {
        return listData;
    }
}

