package co.com.bancolombia.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TestPlanCheckListSecurity {

    public static final Target TAB_CHECK_LIST_SECURITY = Target.the("Tab check list security").locatedBy("//div[@class='bolt-tab focus-treatment flex-noshrink' and @aria-label='Check List Seguridad']");
    public static final Target TXT_ENGINEER_OF_SECURITY = Target.the("Enter the name of the engineer of security").locatedBy("//input[@id='__bolt-Indique-el-dise-ador-de-ciberseguridad-asignado-al-EVC-CDE-input']");
    public static final Target TXT_HU_CYBERSECURITY = Target.the("Hu security").locatedBy("//div[@class='lean-rooster rooster-editor propagate-keydown-event text-element view-mode']");
    public static final Target TXT_FIELDS_CHECKLIST_SECURITY = Target.the("fields checklist security").locatedBy("//div[@class='combo input-text-box list drop']//input");
    public static final Target BTN_EVALUATE_CHECKLIST_SECURITY = Target.the("evaluate check security").locatedBy("//button[@class='evluarButton' and contains(text(),'Evaluar Checklist')]");


}
