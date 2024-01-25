package co.com.bancolombia.certification.userinterfaces.DOD;

import net.serenitybdd.screenplay.targets.Target;

public class InformationDoD {
    public static final Target TXT_TITTLE_DOD = Target.the("Enter the tittle of DoD").locatedBy("//input[contains(@placeholder,'Enter title')]");
    public static final Target TXT_DIRECT_DATA_CHANGES  = Target.the("data changes in production").locatedBy("//input[@id='__bolt-La-soluci-n-contiene-cambios-directos-de-datos-en-producci-n-solicitados-por-el-usuario-del-negocio--input']");
    public static final Target TXT_SOLUTION_DOCUMENTATION  = Target.the("documentation for the solution").locatedBy("//input[@id='__bolt-Se-actualiza-o-se-crea-documentacion-para-esta-solucuci-n-que-se-va-a-desplegar--input']");
    public static final Target TXT_LINK_SOLUTION_DOCUMENTATION  = Target.the("link documentation for the solution").locatedBy("//input[@id='__bolt-Ruta-Documentaci-n-input']");
    public static final Target TXT_DEPLOYMENT_TOOL = Target.the("deployment tool").locatedBy("//input[@id='__bolt-Herramienta-de-despliegue-input']");
    public static final Target TXT_PIPELINE = Target.the("release name").locatedBy("//input[@id='__bolt-Nombre-del-Release--CodigoAW_Nombrecomponente_PDN--input']");
    public static final Target TXT_ARTIFACT = Target.the("enter the artifact").locatedBy("//input[@id='__bolt-Artefacto--Opcional--input']");
    public static final Target TXT_SPECIALIZED_TESTS = Target.the("enter the artifact").locatedBy("//input[@id='__bolt-Se-ejecutaron-pruebas-especializadas-para-esta-solucion-input']");
    public static final Target TXT_EVIDENCE_VSTS = Target.the("evidence vsts + tp number").locatedBy("//div[@class='focus-out-shell rooster-wrapper']//div[@data-placeholder='Click to add Evidencia pruebas/Checklist P.E.']");







}
