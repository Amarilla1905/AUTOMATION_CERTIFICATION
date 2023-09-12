package co.com.bancolombia.certification.models.enums;

public enum ManagementCSV {
	COLUMN_ID("columnId");
	private String managementTypeData;

	private ManagementCSV(String managementTypeData) {
		this.setManagementTypeData(managementTypeData);
	}

	public String getManagementTypeData() {
		return managementTypeData;
	}

	private void setManagementTypeData(String managementTypeData) {
		this.managementTypeData = managementTypeData;
	}
}
