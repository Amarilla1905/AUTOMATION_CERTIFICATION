package co.com.bancolombia.certification.userinterfaces.TP;

import net.serenitybdd.screenplay.targets.Target;

public class TestPlanCheckListSecurity {

    public static final Target TAB_CHECK_LIST_SECURITY = Target.the("Tab check list security").locatedBy("//div[@class='bolt-tab focus-treatment flex-noshrink' and @aria-label='Check List Seguridad']");
    public static final Target TXT_ENGINEER_OF_SECURITY= Target.the("Enter the name of the engineer of security").locatedBy("//input[@id='__bolt-Indique-el-dise-ador-de-ciberseguridad-asignado-al-EVC-CDE-input']");
    public static final Target BTN_DEVSECOPS_ASSIGNED = Target.the("Enter the name of the engineer of security").locatedBy("//div[@class='bolt-toggle-button-pill bolt-focus-treatment flex-noshrink']");
    public static final Target TXT_ENGINNER_OF_DEVSECOPS = Target.the("Enter the name of the engineer of security").locatedBy("//input[@id='__bolt-Seleccione-Ingeniero-de-Seguridad-de-TI---DevSecOps-input']");
    public static final Target TXT_HU_CYBERSECURITY = Target.the("Hu security").locatedBy("//div[contains(@data-placeholder,'Click to add Historia de Usuario trabajada con Ciberseguridad  (Siempre usa # para ingresar el ID):')]");
    public static final Target MAXIMIZE_PERFORMANCE_TECHNICAL_INFORMATION_SECURITY = Target.the("Maximize information general section").locatedBy("//button[@class='work-item-form-toggle bolt-button bolt-icon-button enabled subtle icon-only bolt-focus-treatment' and @aria-label='Maximize Información Técnica de Seguridad en la Solución section']");
    public static final Target RESTORE_PERFORMANCE_TECHNICAL_INFORMATION_SECURITY = Target.the("Maximize information general section").locatedBy("//button[@class='bolt-button bolt-icon-button enabled subtle icon-only bolt-focus-treatment' and @aria-label='Restore Información Técnica de Seguridad en la Solución section']");
    public static final Target TXT_SOLUTION_SECURITY= Target.the("Span with text of create new batch").locatedBy("//span[@class='font-size-ml font-weight-semibold' and contains(text(),'Información Técnica de Seguridad en la Solución')]");
    public static final Target TXT_FIELDS_CHECKLIST_SECURITY = Target.the("fields checklist security").locatedBy("//div[@class='combo input-text-box list drop']//input");
    public static final Target BTN_EVALUATE_CHECKLIST_SECURITY = Target.the("evaluate check security").locatedBy("//button[@class='evluarButton' and contains(text(),'Evaluar Checklist')]");
    public static final Target BTN_OK_SAVE_INFORMATION = Target.the("Button ok save information").locatedBy("//button[@id='ok']");


}