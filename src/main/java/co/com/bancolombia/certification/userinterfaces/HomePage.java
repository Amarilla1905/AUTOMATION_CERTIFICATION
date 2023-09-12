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
        public static final Target BTN_SAVE = Target.the("button save test plan ").locatedBy("//button[@id='__bolt-save']");

    }

