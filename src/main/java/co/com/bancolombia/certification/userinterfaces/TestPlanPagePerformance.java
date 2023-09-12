package co.com.bancolombia.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TestPlanPagePerformance {

    public static final Target TAB_PERFORMANCE_TEST_PLAN = Target.the("Tab performance test plan").locatedBy("//div[@class='bolt-tab focus-treatment flex-noshrink' and @aria-label='Plan de Pruebas Performance']");
    public static final Target TXT_APPLICATION_CODE = Target.the("Enter the application code").locatedBy("//input[@id='__bolt-C-digo-de-Aplicaci-n-input']");
    public static final Target TXT_NAME_OF_APPLICATION_SOLUTION = Target.the("Enter the name of the application").locatedBy("//input[@id='__bolt-Nombre-del-Aplicativo-Soluci-n-input']");


}
