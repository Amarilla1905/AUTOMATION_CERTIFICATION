package co.com.bancolombia.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TestPlanCheckListPerformance {

    public static final Target TAB_CHECK_LIST_PERFORMANCE = Target.the("Tab check list performance").locatedBy("//div[@class='bolt-tab focus-treatment flex-noshrink' and @aria-label='Check List Performance']");
    public static final Target TXT_EVC_TEST_PLAN = Target.the("Enter the value of EVC").locatedBy("//input[@id='__bolt-EVC-CDE-input']");
    public static final Target TXT_APP_CODE_TEST_PLAN = Target.the("Enter the value of applicattion code").locatedBy("//input[@id='__bolt-C-digo-de-Aplicaci-n-input']");
    public static final Target MAXIMIZE_PERFORMANCE_TECHNICAL_INFORMATION_PERFORMANCE = Target.the("Maximize information general section").locatedBy("//button[@class='work-item-form-toggle bolt-button bolt-icon-button enabled subtle icon-only bolt-focus-treatment' and @aria-label='Maximize Información Técnica de Performance en la Solución section']");
    public static final Target RESTORE_PERFORMANCE_TECHNICAL_INFORMATION_PERFORMANCE = Target.the("Maximize information general section").locatedBy("//button[@class='bolt-button bolt-icon-button enabled subtle icon-only bolt-focus-treatment' and @aria-label='Restore Información Técnica de Performance en la Solución section']");
    public static final Target TXT_FIELDS_CHECKLIST_PERFORMANCE = Target.the("Enter the value E2E").locatedBy("//div[@class='combo input-text-box list drop']//input");
    public static final Target ALERT_OF_SAVE = Target.the("Alert of save").locatedBy("//div[@class='ui-dialog no-close ui-widget ui-widget-content ui-front ui-dialog-buttons ui-draggable ui-resizable bowtie-style']");
    public static final Target BTN_OK_ALERT_OF_SAVE = Target.the("Button ok alert of save").locatedBy("//button[@class='cta ui-button ui-corner-all ui-widget']");
    public static final Target BTN_CANCEL_ALERT_OF_SAVE = Target.the("Button cancel alert of save").locatedBy("//button[@class='ui-button ui-corner-all ui-widget']");
    public static final Target ENTER_NEW_BATCH_PROCESS = Target.the("Link enter the new batch process").locatedBy("//li[@class='menu-item']//span[@class='text' and contains(text(),'Ingresar Nuevo Proceso Batch')]");
    public static final Target TXT_SOLUTION_PERFORMANCE = Target.the("Span with text of create new batch").locatedBy("//span[@class='font-size-ml font-weight-semibold' and contains(text(),'Información Técnica de Performance en la Solución')]");
    public static final Target TXT_CREATE_NEW_BATCH_PROCESS = Target.the("Span with text of create new batch").locatedBy("//span[@id='ui-id-1' and contains(text(),'Crear Proceso Batch')]");
    public static final Target NAME_NEW_BATCH_PROCESS = Target.the("Enter the name new batch process").locatedBy("//td//input[@class='note-title requiredInfoLight']");
    public static final Target MAXIMUM_NUMBER_BATCH_PROCESS = Target.the("Enter maximum number of records to process new batch process").locatedBy("//td//input[@class='registro-max requiredInfoLight']");
    public static final Target SELECT_MAXIMUM_NUMBER_BATCH_PROCESS = Target.the("Enter type maximum number of records to process new batch process").locatedBy("//td//select[@class='registrounid requiredInfoLight']//option[@value='{0}']");
    public static final Target MAXIMUM_SIZE_FILES_BATCH_PROCESS = Target.the("Enter maximum size of file(s) to process new batch process").locatedBy("//td//input[@class='tamanomax requiredInfoLight']");
    public static final Target SELECT_MAXIMUM_SIZE_FILES_BATCH_PROCESS = Target.the("Enter type maximum size of file(s) to process new batch process").locatedBy("//td//select[@class='tamanounid requiredInfoLight']//option[@value='{0}']");
    public static final Target MAXIMUM_EXPECTED_TIME_BATCH_PROCESS = Target.the("Enter the maximum time to new batch process").locatedBy("//td//input[@class='time requiredInfoLight']");
    public static final Target SELECT_MAXIMUM_EXPECTED_TIME_BATCH_PROCESS = Target.the("Enter the type maximum time to new batch process").locatedBy("//td//select[@class='timeunid requiredInfoLight']//option[@value='{0}']");
    public static final Target ERROR_PERCENTAGE = Target.the("Enter the error percentage to new batch process").locatedBy("//td//input[@class='porcerror requiredInfoLight']");
    public static final Target PERCENTAGE_OF_GROWTH = Target.the("Enter the percentage of growth to new batch process").locatedBy("//td//input[@class='crecimiento requiredInfoLight']");
    public static final Target SELECT_PROCESS_RUN_IN_MESH = Target.the("Process run in mesh to new batch process").locatedBy("//td//select[@class='malla requiredInfoLight']//option[@value='{0}']");
    public static final Target CHECKBOX_SQOOP_PROCESS = Target.the("Checkbox of sqoop process lz").locatedBy("//td//input[@class='lz' and @type='checkbox']");
    public static final Target BTN_OK_BATCH_PROCESS = Target.the("Button ok batch process").locatedBy("//button[@id='ok' and @class='cta ui-button ui-corner-all ui-widget']");
    public static final Target BTN_CANCEL_BATCH_PROCESS = Target.the("Button cancel batch process").locatedBy("//button[@id='cancel' and @class='ui-button ui-corner-all ui-widget']");
    public static final Target BTN_EXIT_BATCH_PROCESS = Target.the("Button cancel batch process").locatedBy("//span[@class='close_batch']");
    public static final Target BTN_EVALUATE_CHECKLIST_PERFORMANCE = Target.the("evaluate check performance").locatedBy("//button[@class='evluarButton' and contains(text(),'Evaluar Checklist')]");
}