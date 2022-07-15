package travelLine;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class NumbersPage {
    public WebDriver driver;
    public NumbersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//tl-button[@tl-click='addRoom()']")
    public WebElement buttonAddNumber;


    @FindBy(xpath = "//select[@ng-model='editedRoom.buildingId']")
    public WebElement selectBuilding;


    @FindBy(xpath = "//option[@label='Главный корпус']")
    public WebElement mainSelectBuilding;

    @FindBy(xpath = "//option[@label='Гостевой корпус']")
    public WebElement guestSelectBuilding;


    @FindBy(xpath = "//select[@ng-model='editedRoom.floorId']")
    public WebElement selectFloor;

    @FindBy(xpath = "//option[@value='string:28050']")
    public WebElement mainSelectFloorFirst;

    @FindBy(xpath = "//option[@value='string:28051']")
    public WebElement mainSelectFloorSecond;

    @FindBy(xpath = "//option[@value='string:28055']")
    public WebElement mainSelectFloorThird;

    @FindBy(xpath = "//option[@value='string:28057']")
    public WebElement guestSelectFloorFirst;

    @FindBy(xpath = "//option[@value='string:28058']")
    public WebElement guestSelectFloorSecond;

    @FindBy(xpath = "//option[@value='string:28059']")
    public WebElement guestSelectFloorThird;


    @FindBy(xpath = "//select[@ng-model='editedRoom.roomTypeId']")
    public WebElement selectCategory;


    @FindBy(xpath = "//option[@label='Стандарт']")
    public WebElement  selectCategoryStandart;

    @FindBy(xpath = "//option[@label='Люкс']")
    public WebElement  selectCategoryLux;

    @FindBy(xpath = "//div[@class='row tl-row']//div[2]//label[1]//span[1]//tl-icon[1]")
    public WebElement  selectBedDouble;

    @FindBy(xpath = "//div[@id='content']//div[3]//label[1]//span[1]//tl-icon[1]")
    public WebElement  selectBedTwin;
    @FindBy(name = "roomText")
    public WebElement textRoomFirst;
    @FindBy(xpath = "//tl-button[@tl-click='addRoomRange()']")
    public WebElement buttonAddRoom;
    @FindBy(id = "roomText_1")
    public WebElement textRoomSecond;
    @FindBy(xpath = "//label[@class='tl-control ng-scope checkbox']//div[@class='icon']//*[name()='svg']")
    public WebElement selectCheckbox;
    @FindBy(name = "comment")
    public WebElement textComment;
    @FindBy(xpath = "//tl-button[@tl-click='saveChanges()']")
    public WebElement saveChanges;
    @FindBy(xpath = "//body[1]/div[3]/tl-extranet-host[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/tl-table[1]/table[1]/tbody[1]/tr[1]/td[8]/span[1]/tl-control-dropdown-button[1]/div[1]/tl-button[1]/button[1]")
    public WebElement menuDeleteSave;
    @FindBy(xpath = "//body/div[@class='ng-scope']/tl-extranet-host[@class='ng-isolate-scope']/div[@class='theme-sea no-business-card']/div[@id='content']/tl-popup[@class='dropdown-button-popup ng-isolate-scope']/div[@class='popup-content-wrapper']/div[@class='popup-content-wrapper-inner']/div[@class='popup-content']/tl-window[@type='menu']/div[@class='menu']/tl-window-content[@class='ng-scope ng-isolate-scope']/div[@ng-show='!isLoading']/div[@class='ng-scope']/div[@tl-scope-element='transclusionTarget']/tl-dropdown-button-item[2]/span[1]/tl-button[1]/button[1]")
    public WebElement deleteSave;
    @FindBy(xpath = "//tl-button[@tl-click='ok()']//button[@type='button']")
    public WebElement confirmDeleteSave;
    @FindBy(name = "roomText")
    public WebElement textRoom;
    public void  clickButtonAddNumber() {
        buttonAddNumber.click();}
    public void clickMainSelectBuilding(){
        selectBuilding.click();
        mainSelectBuilding.click();
        selectBuilding.click();}
    public void clickGuestSelectBuilding(){
        selectBuilding.click();
        guestSelectBuilding.click();
        selectBuilding.click();}
    public void clickMainSelectFloorFirst(){
        selectFloor.click();
        mainSelectFloorFirst.click();
        selectFloor.click();}
    public void clickMainSelectFloorSecond(){
        selectFloor.click();
        mainSelectFloorSecond.click();
        selectFloor.click();}
    public void clickMainSelectFloorThird(){
        selectFloor.click();
        mainSelectFloorThird.click();
        selectFloor.click();}
    public void clickGuestSelectFloorFirst(){
        selectFloor.click();
        guestSelectFloorFirst.click();
        selectFloor.click();}
    public void clickGuestSelectFloorSecond(){
        selectFloor.click();
        guestSelectFloorSecond.click();
        selectFloor.click();}
    public void clickGuestSelectFloorThird(){
        selectFloor.click();
        guestSelectFloorThird.click();
        selectFloor.click();}
    public void clickCorpusSelectCategoryStandart(){
        selectCategory.click();
        selectCategoryStandart.click();
        selectCategory.click();}
    public void clickCorpusSelectCategoryLux(){
        selectCategory.click();
        selectCategoryLux.click();
        selectCategory.click();}
    public void clickSelectBedDouble(){
        selectBedDouble.click();}
    public void clickSelectBedTwin(){
        selectBedTwin.click();}
    public void inputTextRoomFirst(String room_1){
        textRoomFirst.sendKeys(room_1);}
    public void clickButtonAddRoom(){
        buttonAddRoom.click();}
    public void inputTextRoomSecond(String room_2){
        textRoomSecond.sendKeys(room_2);}
    public void clickSelectCheckbox(){
        selectCheckbox.click();}
    public void inputTextComment(String insert_comment){
        textComment.sendKeys(insert_comment);}
    public void clickSaveChanges(){
        saveChanges.click();}
    public void deleteSavesOneNumber(){
        menuDeleteSave.click();
        deleteSave.click();
        confirmDeleteSave.click();}

    public void checkNumberFirst(){
        Select selectedCorpusFirst = new Select(driver.findElement(By.xpath("//select[@name='building']")));
        WebElement optionCorpusFirst = selectedCorpusFirst.getFirstSelectedOption();
        String NowCorpusFirst = optionCorpusFirst.getText();
        Assert.assertEquals("Выбранный корпус не соответствует ожиданиям", "Гостевой корпус", NowCorpusFirst);
        Select selectedFloorFirst = new Select(driver.findElement(By.xpath("//select[@name='floor']")));
        WebElement optionFloorFirst = selectedFloorFirst.getFirstSelectedOption();
        String NowFloorFirst = optionFloorFirst.getText();
        Assert.assertEquals("Выбранный этаж не соответствует ожиданиям", "1", NowFloorFirst);
        Select selectedCategoryFirst = new Select(driver.findElement(By.xpath("//select[@name='roomType']")));
        WebElement optionCategoryFirst = selectedCategoryFirst.getFirstSelectedOption();
        String NowCategoryFirst = optionCategoryFirst.getText();
        Assert.assertEquals("Выбранная категория не соответствует ожиданиям", "Стандарт", NowCategoryFirst);
        String textRoomFirst = textRoom.getAttribute("value");
        Assert.assertEquals("Первый номер не соответствует ожиданиям", "4", textRoomFirst);
        WebElement checkedCheckBoxFirst = driver.findElement(By.xpath("//label[@class='tl-control ng-scope checkbox']"));
        Assert.assertFalse("Нажат чекбокс!", checkedCheckBoxFirst.isSelected());
    }

}