package co.com.bancolombia.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TestPlanPageEvidence {

    public static final Target TAB_TEST_PLAN_EVIDENCE = Target.the("Tab Test plan and evidence of testing").locatedBy("//div[@class='bolt-tab focus-treatment flex-noshrink' and @aria-label='Plan y evidencia de Pruebas']");
    public static final Target TXT_TITTLE_TEST_PLAN = Target.the("Enter the tittle of the test plan").locatedBy("//input[contains(@placeholder,'Enter title')]");
    public static final Target TXT_ASSIGNED_TEST_PLAN = Target.the("Enter the name to whom the test plan was assigned").locatedBy("#__bolt-identity-picker-downdown-textfield-1");
    public static final Target OPTION_LIST = Target.the("Select in the list, assigned to").locatedBy("//div[@class='fontSizeM text-ellipsis'][normalize-space()='{0}']");
    public static final Target TXT_STATE_TEST_PLAN = Target.the("Enter state").locatedBy("#//input[@id='__bolt-Stat-e-input']");
    public static final Target TXT_AREA_TEST_PLAN = Target.the("Enter the area").locatedBy("//input[@id='__bolt--Area-input']");
    public static final Target TXT_ITERATION_TEST_PLAN = Target.the("Enter the iteration").locatedBy("//input[@id='__bolt-Ite-ration-input']");
    public static final Target TXT_DESCRIPTION_TEST_PLAN = Target.the("Text expand the description").locatedBy("//div[@data-placeholder='Click to add Descripción.']");
    public static final Target BTN_TYPE_TEST_PLAN = Target.the("Select the type of test plan ").locatedBy("button[aria-label='Collapse Tipo de Test Plan section']']");
    public static final Target TXT_TYPE_TEST_PLAN = Target.the("Enter the type of test plan ").locatedBy("//input[@id='__bolt-Selecciona-el-tipo-de-test-plan-input']");
    public static final Target TXT_RELATED_WORK = Target.the("Related work ").locatedBy("//span[normalize-space()='Related Work']");
    public static final Target LINK_ADD_RELATED_PARENT = Target.the("Add Parent related ").locatedBy("//span[.='Add an existing work item as a parent']");
    public static final Target TXT_PARENT_RELATED_HU = Target.the("Enter the word Parent and related  ").locatedBy("//div[@class='bolt-editable-dropdown bolt-editable-dropdown-with-selection bolt-dropdown-expandable bolt-dropdown-expandable-text-field bolt-expandable-textfield']//div[@class='bolt-textfield flex-row flex-center focus-treatment']");
    public static final Target TXT_PARENT_RELATED_HU_INPUT = Target.the("Enter the word Parent and related input  ").locatedBy("//div[@class='bolt-editable-dropdown bolt-editable-dropdown-with-selection bolt-dropdown-expandable bolt-dropdown-expandable-text-field bolt-expandable-textfield']//div//input[@class='bolt-dropdown-expandable-textfield-input text-ellipsis bolt-textfield-input flex-grow bolt-textfield-input-with-suffix']");
    public static final Target TXT_NUM_HU = Target.the("Enter the #num ").locatedBy("//input[@class='bolt-dropdown-expandable-textfield-input text-ellipsis bolt-textfield-input flex-grow bolt-textfield-input-with-suffix' and @placeholder='Search work items by ID or title']");
    public static final Target LINK_ADD_RELATED_HU = Target.the("Enter the HU related ").locatedBy("//span[@class='icon-right font-weight-normal flex-noshrink fabric-icon ms-Icon--ChevronDownMed small']");
    public static final Target BTN_EXISTING_ITEM = Target.the("Existing item ").locatedBy("//div[@id='__bolt-existing-item-text']");
    public static final Target BTN_ARROW_RELATED_HU = Target.the("Click on list ").locatedBy("div[class='bolt-editable-dropdown bolt-editable-dropdown-with-selection bolt-dropdown-expandable bolt-dropdown-expandable-text-field bolt-expandable-textfield'] span[class='bolt-expandable-textfield-icon icon-right suffix bolt-textfield-icon bolt-textfield-no-text cursor-pointer flex-noshrink fabric-icon ms-Icon--ChevronDownMed small']");
    public static final Target LIST_WORK = Target.the("Enter the word Related ").locatedBy("//tr[@id='__bolt-Work-header']/td[2]/div");
    public static final Target SCROLL_LINK_TYPE = Target.the("Scroll link type").locatedBy(".bolt-dropdown-list-box-container.bolt-table-container.flex-grow.v-scroll-auto");
    public static final Target OPTION_LIST_RELATED_HU = Target.the("Options in the list of the first field ").locatedBy("//span[contains(text()='{0}')]");
    public static final Target BTN_SAVE_ADD_RELATED_PARENT = Target.the("Button save of Parent related ").locatedBy("//button[@class='bolt-button enabled primary bolt-focus-treatment']");










}
