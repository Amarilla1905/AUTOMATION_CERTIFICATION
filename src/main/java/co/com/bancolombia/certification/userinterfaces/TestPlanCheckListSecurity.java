package co.com.bancolombia.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TestPlanCheckListSecurity {

    public static final Target TAB_CHECK_LIST_SECURITY = Target.the("Tab check list security").locatedBy("//div[@class='bolt-tab focus-treatment flex-noshrink' and @aria-label='Check List Seguridad']");
    public static final Target TXT_ENGINEER_OF_SECURITY= Target.the("Enter the name of the engineer of security").locatedBy("//input[@id='__bolt-Indique-el-dise-ador-de-ciberseguridad-asignado-al-EVC-CDE-input']");
    public static final Target BTN_DEVSECOPS_ASSIGNED = Target.the("Enter the name of the engineer of security").locatedBy("//div[@class='bolt-toggle-button-pill bolt-focus-treatment flex-noshrink']");

    public static final Target TXT_ENGINNER_OF_DEVSECOPS = Target.the("Enter the name of the engineer of security").locatedBy("//input[@id='__bolt-Seleccione-Ingeniero-de-Seguridad-de-TI---DevSecOps-input']");
    public static final Target TXT_HU_CYBERSECURITY = Target.the("Hu security").locatedBy("//div[contains(@data-placeholder,'Click to add Historia de Usuario trabajada con Ciberseguridad  (Siempre usa # para ingresar el ID):')]");
    public static final Target TXT_FIELDS_CHECKLIST_SECURITY = Target.the("fields checklist security").locatedBy("//div[@class='combo input-text-box list drop']//input");
    public static final Target BTN_EVALUATE_CHECKLIST_SECURITY = Target.the("evaluate check security").locatedBy("//button[@class='evluarButton' and contains(text(),'Evaluar Checklist')]");


}
