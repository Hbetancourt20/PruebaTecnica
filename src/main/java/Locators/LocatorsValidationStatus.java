package Locators;
import org.openqa.selenium.By;
public class LocatorsValidationStatus {
    public static final By LOCATOR_VACANCIES =By.xpath("//a[text()='Vacancies']");
    public static final By BUTTON_SHORLIST = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--success']");
    public static final By BUTTON_SAVE = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    public static final By BUTTON_ENTREVISTA = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--success']");
    public static final By INPUT_TITULO_ENTREVISTA = By.xpath("//div[label[text()='Interview Title']]/following-sibling::div/input");
    public static final By INPUT_INTERVIEW = By.xpath("//div[label[text()='Interviewer']]/following-sibling::div/div//input");
    public static final By DIV_INTERVIEW = By.xpath("//div[@role='listbox']");
    public static final By TEXT_INTERVIEWER = By.xpath("//div[label[text()='Hiring Manager']]/following-sibling::div//input");
    public static final By INPUT_FECHA = By.xpath("//div[label[text()='Date']]/following-sibling::div/div//input");
    public static final By INPUT_TIEMPO = By.xpath("//div[label[text()='Time']]/following-sibling::div/div//input");
    public static final By BUTTON_SAVE_SCHEDULE = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    public static final By BUTTON_PASSED = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--success']");
    public static final By BUTTON_SAVE_INTERVIEW = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    public static final By BUTTON_OFFER_JOB = By.xpath("//button[normalize-space()='Offer Job']");
    public static final By BUTTON_SAVE_JOB = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    public static final By BUTTON_HIRE = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--success']");
    public static final By BUTTON_SAVE_HIRE = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    public static final By TXT_STATUS = By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--subtitle-2']");



}
