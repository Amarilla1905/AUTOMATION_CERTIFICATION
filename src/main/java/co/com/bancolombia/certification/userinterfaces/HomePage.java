package co.com.bancolombia.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

        public static final Target TXT_EMAIL_LOGIN = Target.the("enter the email").locatedBy("//input[@class='form-control ltr_override input ext-input text-box ext-text-box']");
        public static final Target TXT_PASSWORD_LOGIN = Target.the("enter the password").locatedBy("//input[@class='form-control input ext-input text-box ext-text-box']");
        public static final Target BTN_NEXT_LOGIN = Target.the("click on next").locatedBy("//input[@class='win-button button_primary button ext-button primary ext-primary']");
        public static final Target BTN_LOG_IN_LOGIN = Target.the("click on login").locatedBy("//input[@class='win-button button_primary button ext-button primary ext-primary']");
        public static final Target TXT_WORK_ITEM_ICON = Target.the("work item icon").locatedBy(".vss-HubTitle--titleText");
        public static final Target BTN_NEW_WORK_ITEM_ICON = Target.the("button work item icon").locatedBy("//button[@id='CommandBar1new-work-item']");
        public static final Target BTN_OPTION_TEST_PLAN = Target.the("button new test plan").locatedBy("//button[contains(.,'Plan Evidencia Pruebas')]");
        public static final Target BTN_OPTION_DOD= Target.the("button new dod").locatedBy("//button[contains(.,'DoD Concepto de Calidad')]");
        public static final Target BTN_SAVE = Target.the("button save test plan ").locatedBy("//button[@id='__bolt-save']");
        public static final Target MAXIMIZE_PERFORMANCE_TECHNICAL_INFORMATION = Target.the("Maximize information general section").locatedBy("//button[@class='work-item-form-toggle bolt-button bolt-icon-button enabled subtle icon-only bolt-focus-treatment' and @aria-label='Maximize Información Técnica de Performance en la Solución section']");
        public static final Target RESTORE_PERFORMANCE_TECHNICAL_INFORMATION = Target.the("Maximize information general section").locatedBy("//button[@class='bolt-button bolt-icon-button enabled subtle icon-only bolt-focus-treatment' and @aria-label='Restore Información Técnica de Performance en la Solución section']");
        public static final Target CODE_OF_TEST_PLAN= Target.the("Code of test plan").locatedBy("//div[.='{0}']");
        public static final Target BTN_ATTACHMENTS= Target.the("button attachments").locatedBy("//div[@class='bolt-tab focus-treatment flex-noshrink selected' and @aria-label='Attachments']");
        public static final Target BTN_ADD_ATTACHMENTS= Target.the("button attachments").locatedBy("//button[@class='vss-ZeroDataItem--action bolt-button enabled primary bolt-focus-treatment']");
        public static final Target SCREEN_ATTACHMENTS= Target.the("button attachments").locatedBy("vss-ZeroData flex-row justify-center single");

}

