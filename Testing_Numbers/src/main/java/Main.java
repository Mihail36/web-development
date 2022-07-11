import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Misha\\IdeaProjects\\untitled\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


 driver.get("https://www.travelline.ru/secure/webpms/extranet/#/WebPmsPlacement");
         //login
         WebElement login = driver.findElement(By.cssSelector("input[class='pull-right tl-control-full form-control tl-control']"));
         login.clear();
         login.sendKeys("mikhail.petrov");

         //password
         WebElement password = driver.findElement(By.cssSelector("input[class='tl-control-full form-control tl-control tl-control-password ng-isolate-scope show-password']"));
         password.clear();
         password.sendKeys("5qJbcFRm");

         //press button "Войти"
         WebElement button_auth = driver.findElement(By.xpath("//tl-button[@class='pull-right tl-control-full ng-scope ng-isolate-scope']"));
         button_auth.click();

         //Timeout for "Add Rooms"
         driver.manage().timeouts().implicitlyWait(5000,
         TimeUnit.MILLISECONDS);




         //Press button Add Rooms
        WebElement button_add_number = driver.findElement(By.xpath("//tl-button[@tl-click='addRoom()']"));
        button_add_number.click();

        //Select building
        WebElement select_building = driver.findElement(By.xpath("//select[@ng-model='editedRoom.buildingId']"));
        select_building.click();
        WebElement corpus_select_building = driver.findElement(By.xpath("//option[@label='Главный корпус']"));
        corpus_select_building.click();
        select_building.click();

        //Select floor
        WebElement select_floor= driver.findElement(By.xpath("//select[@ng-model='editedRoom.floorId']"));
        select_floor.click();
        WebElement corpus_select_floor = driver.findElement(By.xpath("//option[@value='string:28050']"));
        corpus_select_floor.click();
        select_floor.click();

        //Select category
        WebElement select_category = driver.findElement(By.xpath("//select[@ng-model='editedRoom.roomTypeId']"));
        select_category.click();
        WebElement corpus_select_category = driver.findElement(By.xpath("//option[@label='Стандарт']"));
        corpus_select_category.click();
        select_category.click();

        //Add Rooms
        WebElement text_room_1 = driver.findElement(By.name("roomText"));
        text_room_1.clear();
        text_room_1.sendKeys("1");
        WebElement button_add_room = driver.findElement(By.xpath("//tl-button[@tl-click='addRoomRange()']"));
        button_add_room.click();
        WebElement text_room_2= driver.findElement(By.id("roomText_1"));
        text_room_2.clear();
        text_room_2.sendKeys("2");

        //Select Checkbox
        WebElement select_checkbox = driver.findElement(By.xpath("//label[@class='tl-control ng-scope checkbox']//div[@class='icon']//*[name()='svg']"));
        select_checkbox.click();

        //Comments
        WebElement text_comment = driver.findElement(By.name("comment"));
        text_comment.clear();
        text_comment.sendKeys("ООООООЧЧЧЧЕЕЕНННЬЬЬЬ ДДДДЛЛЛИИИИИННННЫЫЫЙЙЙ ККККООООММММЕЕЕЕННННТТТААААРРРИИИИЙЙЙЙ");

        //Save changes
        WebElement save_changes = driver.findElement(By.xpath("//tl-button[@tl-click='saveChanges()']"));
        save_changes.click();
    }}
