package Locators;


import org.openqa.selenium.By;

public class LocatorsRecruitmentOrange {
    public static final By LOCATOR_RECRUITMENT =By.xpath("//span[(text())='Recruitment']");
    public static final By BUTTON_ADD = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
    public static final By INPUT_FIRSTNAME =By.xpath("//input[@name='firstName']");
    public static final By INPUT_MIDDLENAME = By.xpath("//input[@name='middleName']");
    public static final By INPUT_LASTNAME = By.xpath("//input[@name='lastName']");
    public static final By SELECT_VACANCY_DIV = By.xpath("//div[@class='oxd-select-text-input']");
    public static final By SELECT_VACANCY = By.xpath("//span[(text())='test']");
    public static final By FILE_BROWSER = By.xpath("//input[@type='file']");
    public static final By INPUT_EMAIL = By.xpath("//div[label[text()='Email']]/following-sibling::div/input");
    public static final By INPUT_CONTACT =By.xpath("//div[label[text()='Contact Number']]/following-sibling::div/input");
    public static final By INPUT_KEYWORDS = By.xpath("//div[label[text()='Keywords']]/following-sibling::div/input");
    public static final By TEXTAREA_NOTES = By.xpath("//div[label[text()='Notes']]/following-sibling::div/textarea");
    public static final By SPAN_CHECKBOX = By.xpath("//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']");
    public static final By BUTTON_SAVE = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");

}
