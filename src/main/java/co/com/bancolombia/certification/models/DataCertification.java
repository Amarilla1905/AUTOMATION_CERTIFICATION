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
        this.tittleTestPlan = dataBuilder.getListData().get(0).getTittleTestPlan();
        this.assignedTo = dataBuilder.getListData().get(0).getAssignedTo();
        this.area = dataBuilder.getListData().get(0).getArea();
        this.iteration = dataBuilder.getListData().get(0).getIteration();
        this.description = dataBuilder.getListData().get(0).getDescription();
        this.typeTestPlan = dataBuilder.getListData().get(0).getTypeTestPlan();
        this.relatedParent = dataBuilder.getListData().get(0).getRelatedParent();
        this.relatedHu = dataBuilder.getListData().get(0).getRelatedHu();
        this.applicationCode = dataBuilder.getListData().get(0).getApplicationCode();
        this.applicationSolutionName = dataBuilder.getListData().get(0).getApplicationSolutionName();
        this.evc = dataBuilder.getListData().get(0).getEvc();
        this.modularTestingOrE2E = dataBuilder.getListData().get(0).getModularTestingOrE2E();
        this.transactionType = dataBuilder.getListData().get(0).getTransactionType();
        this.processBatchTitle = dataBuilder.getListData().get(0).getProcessBatchTitle();
        this.typeCertification = dataBuilder.getListData().get(0).getTypeCertification();
        this.maximumNumberRecords = dataBuilder.getListData().get(0).getMaximumNumberRecords();
        this.selectTypeRecords = dataBuilder.getListData().get(0).getSelectTypeRecords();
        this.maximumFileSize = dataBuilder.getListData().get(0).getMaximumFileSize();
        this.selectTypeSize = dataBuilder.getListData().get(0).getSelectTypeSize();
        this.maximumExecutionTime = dataBuilder.getListData().get(0).getMaximumExecutionTime();
        this.selectTypeTime = dataBuilder.getListData().get(0).getSelectTypeTime();
        this.errorRate = dataBuilder.getListData().get(0).getErrorRate();
        this.growthRate = dataBuilder.getListData().get(0).getGrowthRate();
        this.runsOnMesh = dataBuilder.getListData().get(0).getRunsOnMesh();
        this.assignedCybersecurity = dataBuilder.getListData().get(0).getAssignedCybersecurity();
        this.assignedDevSecOps = dataBuilder.getListData().get(0).getAssignedDevSecOps();
        this.cybersecurityHu = dataBuilder.getListData().get(0).getCybersecurityHu();
        this.itRiskRating = dataBuilder.getListData().get(0).getItRiskRating();
        this.typeInitiative = dataBuilder.getListData().get(0).getTypeInitiative();
        this.cybersecurityPerson = dataBuilder.getListData().get(0).getCybersecurityPerson();
        this.continuousSecurityTesting = dataBuilder.getListData().get(0).getContinuousSecurityTesting();
        this.securityTestAnalyst = dataBuilder.getListData().get(0).getSecurityTestAnalyst();


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


 }

