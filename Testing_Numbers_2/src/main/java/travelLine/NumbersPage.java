package travelLine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NumbersPage {
    public WebDriver driver;
    public NumbersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    //Press button Add Rooms
    @FindBy(xpath = "//tl-button[@tl-click='addRoom()']")
    private WebElement button_add_number;

    //Button "select building"
    @FindBy(xpath = "//select[@ng-model='editedRoom.buildingId']")
    private WebElement select_building;

    //Select building
    @FindBy(xpath = "//option[@label='Главный корпус']")
    private WebElement corpus_select_building;

    //Button "select floor"
    @FindBy(xpath = "//select[@ng-model='editedRoom.floorId']")
    private WebElement select_floor;

    //Select floor
    @FindBy(xpath = "//option[@value='string:28050']")
    private WebElement corpus_select_floor;

    //Button "select category"
    @FindBy(xpath = "//select[@ng-model='editedRoom.roomTypeId']")
    private WebElement select_category;

    //Select category
    @FindBy(xpath = "//option[@label='Стандарт']")
    private WebElement  corpus_select_category;

    //Add Number of Room
    @FindBy(name = "roomText")
    private WebElement text_room_1;

    //Button "Add Room"
    @FindBy(xpath = "//tl-button[@tl-click='addRoomRange()']")
    private WebElement button_add_room;

    //Add Another Number
    @FindBy(id = "roomText_1")
    private WebElement text_room_2;

    //Select checkbox
    @FindBy(xpath = "//label[@class='tl-control ng-scope checkbox']//div[@class='icon']//*[name()='svg']")
    private WebElement select_checkbox;

    //Add Comment
    @FindBy(name = "comment")
    private WebElement text_comment;

    //Button "save changes"
    @FindBy(xpath = "//tl-button[@tl-click='saveChanges()']")
    private WebElement save_changes;


    public void  click_button_add_number() {
        button_add_number.click();}

    public void click_select_building() {
        select_building.click();}

    public void click_corpus_select_building(){
        corpus_select_building.click();}

    public void click_select_floor() {
        select_floor.click();}

    public void click_corpus_select_floor(){
        corpus_select_floor.click();}

    public void click_select_category(){
        select_category.click();}

    public void click_corpus_select_category(){
        corpus_select_category.click();}

    public void input_text_room_1(String room_1){
        text_room_1.sendKeys(room_1);}

    public void click_button_add_room(){
        button_add_room.click();}

    public void input_text_room_2(String room_2){
        text_room_2.sendKeys(room_2);}

    public void click_select_checkbox(){
        select_checkbox.click();}

    public void input_text_comment(String insert_comment){
        text_comment.sendKeys(insert_comment);}

    public void click_save_changes(){
        save_changes.click();}
}