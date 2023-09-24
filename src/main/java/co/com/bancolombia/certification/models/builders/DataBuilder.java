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
    private String applicationCode;
    private String applicationSolutionName;
    private String evc;
    private String modularTestingOrE2E;
    private String transactionType;
    private String processBatchTitle;
    private String typeCertification;
    private String maximumNumberRecords;
    private String selectTypeRecords;
    private String maximumFileSize;
    private String selectTypeSize;
    private String maximumExecutionTime;
    private String selectTypeTime;
    private String errorRate;
    private String growthRate;
    private String runsOnMesh;
    private String assignedCybersecurity;
    private String assignedDevSecOps;
    private String cybersecurityHu;
    private String itRiskRating;
    private String typeInitiative;
    private String cybersecurityPerson;
    private String continuousSecurityTesting;
    private String securityTestAnalyst;


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

    public String getApplicationCode() {
        return applicationCode;
    }

    public String getApplicationSolutionName() {
        return applicationSolutionName;
    }

    public String getEvc() {
        return evc;
    }

    public String getModularTestingOrE2E() {
        return modularTestingOrE2E;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public String getProcessBatchTitle() {
        return processBatchTitle;
    }

    public String getTypeCertification() {
        return typeCertification;
    }

    public String getMaximumNumberRecords() {
        return maximumNumberRecords;
    }

    public String getSelectTypeRecords() {
        return selectTypeRecords;
    }

    public String getMaximumFileSize() {
        return maximumFileSize;
    }

    public String getSelectTypeSize() {
        return selectTypeSize;
    }

    public String getMaximumExecutionTime() {
        return maximumExecutionTime;
    }

    public String getSelectTypeTime() {
        return selectTypeTime;
    }

    public String getErrorRate() {
        return errorRate;
    }

    public String getGrowthRate() {
        return growthRate;
    }

    public String getRunsOnMesh() {
        return runsOnMesh;
    }

    public String getAssignedCybersecurity() {
        return assignedCybersecurity;
    }

    public String getAssignedDevSecOps() {
        return assignedDevSecOps;
    }

    public String getCybersecurityHu() {
        return cybersecurityHu;
    }

    public String getItRiskRating() {
        return itRiskRating;
    }

    public String getTypeInitiative() {
        return typeInitiative;
    }

    public String getCybersecurityPerson() {
        return cybersecurityPerson;
    }

    public String getContinuousSecurityTesting() {
        return continuousSecurityTesting;
    }

    public String getSecurityTestAnalyst() {
        return securityTestAnalyst;
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
        this.tittleTestPlan = data.get("tittleTestPlan");
        this.assignedTo = data.get("assignedTo");
        this.area = data.get("area");
        this.iteration = data.get("iteration");
        this.description = data.get("description");
        this.typeTestPlan = data.get("typeTestPlan");
        this.relatedParent = data.get("relatedParent");
        this.relatedHu = data.get("relatedHu");
        this.applicationCode = data.get("applicationCode");
        this.applicationSolutionName = data.get("applicationSolutionName");
        this.evc = data.get("evc");
        this.modularTestingOrE2E = data.get("modularTestingOrE2E");
        this.transactionType = data.get("transactionType");
        this.processBatchTitle = data.get("processBatchTitle");
        this.typeCertification = data.get("typeCertification");
        this.maximumNumberRecords = data.get("maximumNumberRecords");
        this.selectTypeRecords = data.get("selectTypeRecords");
        this.maximumFileSize = data.get("maximumFileSize");
        this.selectTypeSize = data.get("selectTypeSize");
        this.maximumExecutionTime = data.get("maximumExecutionTime");
        this.selectTypeTime = data.get("selectTypeTime");
        this.errorRate = data.get("errorRate");
        this.growthRate = data.get("growthRate");
        this.runsOnMesh = data.get("runsOnMesh");
        this.assignedCybersecurity = data.get("assignedCybersecurity");
        this.assignedDevSecOps = data.get("assignedDevSecOps");
        this.cybersecurityHu = data.get("cybersecurityHu");
        this.itRiskRating = data.get("itRiskRating");
        this.typeInitiative = data.get("typeInitiative");
        this.cybersecurityPerson = data.get("cybersecurityPerson");
        this.continuousSecurityTesting = data.get("continuousSecurityTesting");
        this.securityTestAnalyst = data.get("securityTestAnalyst");

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

