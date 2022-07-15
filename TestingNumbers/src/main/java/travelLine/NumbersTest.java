package travelLine;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NumbersTest {
    public static LoginPage loginPage;
    public static NumbersPage numbersPage;
    public static WebDriver driver;

    /**
     * осуществление первоначальной настройки
     */
    @Before
    public void setup() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        //создание экземпляра драйвера
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        numbersPage = new NumbersPage(driver);
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        driver.get(ConfProperties.getProperty("site"));
        loginPage.inputLogin(ConfProperties.getProperty("login"));
        loginPage.inputPass(ConfProperties.getProperty("password"));
        loginPage.clickLoginBtn();}

    @After
    public void tearDown() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        numbersPage.deleteSavesOneNumber();
        driver.quit();
    }

    @Test
    public void numbersTestGuestStandartCheckboxFirst(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickGuestSelectBuilding();
        numbersPage.clickGuestSelectFloorFirst();
        numbersPage.clickCorpusSelectCategoryStandart();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomFourth"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomFirst"));
        numbersPage.clickSelectCheckbox();
        numbersPage.clickSaveChanges();
        numbersPage.checkNumberFirst();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestGuestStandartCheckboxSecond(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickGuestSelectBuilding();
        numbersPage.clickGuestSelectFloorThird();
        numbersPage.clickCorpusSelectCategoryStandart();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomFirst"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomSixth"));
        numbersPage.clickSelectCheckbox();
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestMainLuxBedTwinMaxCommentFirst(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickMainSelectBuilding();
        numbersPage.clickMainSelectFloorThird();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedTwin();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomFourth"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomFifth"));
        numbersPage.inputTextComment(ConfProperties.getProperty("maxComment"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestMainLuxBedTwinMaxCommentSecond(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickMainSelectBuilding();
        numbersPage.clickMainSelectFloorFirst();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedTwin();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomFirst"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomFourth"));
        numbersPage.inputTextComment(ConfProperties.getProperty("maxComment"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestMainLuxBedDoubleCheckboxFirst(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickMainSelectBuilding();
        numbersPage.clickMainSelectFloorSecond();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedDouble();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomFirst"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomThird"));
        numbersPage.clickSelectCheckbox();
        numbersPage.inputTextComment(ConfProperties.getProperty("specComment"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestMainLuxBedDoubleCheckboxSecond(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickMainSelectBuilding();
        numbersPage.clickMainSelectFloorSecond();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedDouble();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomThird"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomFirst"));
        numbersPage.clickSelectCheckbox();
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestMainLuxBedDoubleCheckboxThird(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickMainSelectBuilding();
        numbersPage.clickMainSelectFloorSecond();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedDouble();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomSecond"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomFifth"));
        numbersPage.clickSelectCheckbox();
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestGuestLuxBedDoubleFirst(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickGuestSelectBuilding();
        numbersPage.clickGuestSelectFloorFirst();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedDouble();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomSixth"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomFourth"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestGuestLuxBedDoubleSecond(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickGuestSelectBuilding();
        numbersPage.clickGuestSelectFloorSecond();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedDouble();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomFifth"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomSecond"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestMainStandartCheckboxMaxComment(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickMainSelectBuilding();
        numbersPage.clickMainSelectFloorSecond();
        numbersPage.clickCorpusSelectCategoryStandart();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomFifth"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomFourth"));
        numbersPage.clickSelectCheckbox();
        numbersPage.inputTextComment(ConfProperties.getProperty("maxComment"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestGuestStandartSpecComment(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickGuestSelectBuilding();
        numbersPage.clickGuestSelectFloorThird();
        numbersPage.clickCorpusSelectCategoryStandart();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomSecond"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomSixth"));
        numbersPage.inputTextComment(ConfProperties.getProperty("specComment"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestGuestLuxBedTwinCheckboxMaxCommentFirst(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickGuestSelectBuilding();
        numbersPage.clickGuestSelectFloorSecond();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedTwin();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomSixth"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomFirst"));
        numbersPage.clickSelectCheckbox();
        numbersPage.inputTextComment(ConfProperties.getProperty("maxComment"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestGuestLuxBedTwinCheckboxMaxCommentSecond(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickGuestSelectBuilding();
        numbersPage.clickGuestSelectFloorSecond();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedTwin();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomSixth"));
        numbersPage.clickSelectCheckbox();
        numbersPage.inputTextComment(ConfProperties.getProperty("maxComment"));
        numbersPage.clickSaveChanges();
    }
    @Test
    public void numbersTestMainLuxCheckboxSpecComment(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickMainSelectBuilding();
        numbersPage.clickMainSelectFloorThird();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomSixth"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomSecond"));
        numbersPage.clickSelectCheckbox();
        numbersPage.inputTextComment(ConfProperties.getProperty("specComment"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestMainLuxBedTwinSpecCommentFirst(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickMainSelectBuilding();
        numbersPage.clickMainSelectFloorFirst();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedTwin();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomFifth"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomFirst"));
        numbersPage.inputTextComment(ConfProperties.getProperty("specComment"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestMainLuxBedTwinSpecCommentSecond(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickMainSelectBuilding();
        numbersPage.clickMainSelectFloorFirst();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedTwin();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomThird"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomSecond"));
        numbersPage.inputTextComment(ConfProperties.getProperty("specComment"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestMainLuxBedTwin(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickMainSelectBuilding();
        numbersPage.clickMainSelectFloorThird();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedTwin();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomFifth"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomThird"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestGuestLuxBedDoubleCheckboxSpecComment(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickGuestSelectBuilding();
        numbersPage.clickGuestSelectFloorThird();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedDouble();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomSixth"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomFifth"));
        numbersPage.clickSelectCheckbox();
        numbersPage.inputTextComment(ConfProperties.getProperty("specComment"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestMainLuxBedDoubleCheckboxMaxCommentFirst(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickMainSelectBuilding();
        numbersPage.clickMainSelectFloorSecond();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedDouble();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomFourth"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomSecond"));
        numbersPage.clickSelectCheckbox();
        numbersPage.inputTextComment(ConfProperties.getProperty("maxComment"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestMainLuxBedDoubleCheckboxMaxCommentSecond(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickMainSelectBuilding();
        numbersPage.clickMainSelectFloorFirst();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedDouble();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomFifth"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomSixth"));
        numbersPage.clickSelectCheckbox();
        numbersPage.inputTextComment(ConfProperties.getProperty("maxComment"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestMainLuxBedDoubleCheckboxSpecCommentFirst(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickMainSelectBuilding();
        numbersPage.clickMainSelectFloorSecond();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedDouble();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomFourth"));
        numbersPage.clickSelectCheckbox();
        numbersPage.inputTextComment(ConfProperties.getProperty("specComment"));
        numbersPage.clickSaveChanges();
    }
    @Test
    public void numbersTestMainLuxBedDoubleCheckboxSpecCommentSecond(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickMainSelectBuilding();
        numbersPage.clickMainSelectFloorSecond();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedDouble();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomFifth"));
        numbersPage.clickSelectCheckbox();
        numbersPage.inputTextComment(ConfProperties.getProperty("specComment"));
        numbersPage.clickSaveChanges();
    }
    @Test
    public void numbersTestMainLuxBedDoubleCheckboxSpecCommentThird(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickMainSelectBuilding();
        numbersPage.clickMainSelectFloorFirst();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedDouble();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomSixth"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomThird"));
        numbersPage.clickSelectCheckbox();
        numbersPage.inputTextComment(ConfProperties.getProperty("specComment"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestGuestLuxBedTwinFirst(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickGuestSelectBuilding();
        numbersPage.clickGuestSelectFloorSecond();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedTwin();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomFourth"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomSixth"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestGuestLuxBedTwinSecond(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickGuestSelectBuilding();
        numbersPage.clickGuestSelectFloorThird();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedTwin();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomSecond"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomFirst"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestGuestStandartMaxComment(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickGuestSelectBuilding();
        numbersPage.clickGuestSelectFloorThird();
        numbersPage.clickCorpusSelectCategoryStandart();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomThird"));
        numbersPage.inputTextComment(ConfProperties.getProperty("maxComment"));
        numbersPage.clickSaveChanges();
    }
    @Test
    public void numbersTestMainLuxBedTwinCheckbox(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickMainSelectBuilding();
        numbersPage.clickMainSelectFloorSecond();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedTwin();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomSecond"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomFourth"));
        numbersPage.clickSelectCheckbox();
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestGuestLuxBedTwinCheckbox(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickGuestSelectBuilding();
        numbersPage.clickGuestSelectFloorFirst();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedTwin();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomFirst"));
        numbersPage.clickSelectCheckbox();
        numbersPage.clickSaveChanges();
    }
    @Test
    public void numbersTestMainLuxBedTwinCheckboxMaxCommentFirst(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickMainSelectBuilding();
        numbersPage.clickMainSelectFloorFirst();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedTwin();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomFirst"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomSecond"));
        numbersPage.clickSelectCheckbox();
        numbersPage.inputTextComment(ConfProperties.getProperty("maxComment"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestMainLuxBedTwinCheckboxMaxCommentSecond(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickMainSelectBuilding();
        numbersPage.clickMainSelectFloorThird();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedTwin();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomFifth"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomFirst"));
        numbersPage.clickSelectCheckbox();
        numbersPage.inputTextComment(ConfProperties.getProperty("maxComment"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestGuestStandartCheckboxMaxComment(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickGuestSelectBuilding();
        numbersPage.clickGuestSelectFloorFirst();
        numbersPage.clickCorpusSelectCategoryStandart();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomSecond"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomThird"));
        numbersPage.clickSelectCheckbox();
        numbersPage.inputTextComment(ConfProperties.getProperty("maxComment"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestGuestLuxBedDoubleCheckboxMaxCommentFirst(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickGuestSelectBuilding();
        numbersPage.clickGuestSelectFloorThird();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedDouble();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomThird"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomFifth"));
        numbersPage.clickSelectCheckbox();
        numbersPage.inputTextComment(ConfProperties.getProperty("maxComment"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestGuestLuxBedDoubleCheckboxMaxCommentSecond(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickGuestSelectBuilding();
        numbersPage.clickGuestSelectFloorFirst();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedDouble();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomFourth"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomThird"));
        numbersPage.clickSelectCheckbox();
        numbersPage.inputTextComment(ConfProperties.getProperty("maxComment"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestGuestLuxBedTwinSpecComment(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickGuestSelectBuilding();
        numbersPage.clickGuestSelectFloorThird();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedTwin();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomThird"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomFourth"));
        numbersPage.inputTextComment(ConfProperties.getProperty("specComment"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }

    @Test
    public void numbersTestMainLuxCheckboxMaxComment(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickMainSelectBuilding();
        numbersPage.clickMainSelectFloorSecond();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomThird"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomSixth"));
        numbersPage.clickSelectCheckbox();
        numbersPage.inputTextComment(ConfProperties.getProperty("maxComment"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }
    @Test
    public void numbersTestMainStandartCheckbox(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickMainSelectBuilding();
        numbersPage.clickMainSelectFloorFirst();
        numbersPage.clickCorpusSelectCategoryStandart();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomThird"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomFifth"));
        numbersPage.clickSelectCheckbox();
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }

    @Test
    public void numbersTestMainLuxBedDoubleCheckbox(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickMainSelectBuilding();
        numbersPage.clickMainSelectFloorFirst();
        numbersPage.clickCorpusSelectCategoryLux();
        numbersPage.clickSelectBedDouble();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomSecond"));
        numbersPage.clickSelectCheckbox();
        numbersPage.clickSaveChanges();
    }
    @Test
    public void numbersTestMainStandartSpecComment(){

        numbersPage.clickButtonAddNumber();
        numbersPage.clickMainSelectBuilding();
        numbersPage.clickMainSelectFloorThird();
        numbersPage.clickCorpusSelectCategoryStandart();
        numbersPage.inputTextRoomFirst(ConfProperties.getProperty("roomSixth"));
        numbersPage.clickButtonAddRoom();
        numbersPage.inputTextRoomSecond(ConfProperties.getProperty("roomSecond"));
        numbersPage.inputTextComment(ConfProperties.getProperty("specComment"));
        numbersPage.clickSaveChanges();
        numbersPage.deleteSavesOneNumber();
    }


}