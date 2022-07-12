package travelLine;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NumbersTest {
    public static LoginPage loginPage;
    public static NumbersPage numbersPage;
    public static WebDriver driver;

    /**
     * осуществление первоначальной настройки
     */
    @BeforeClass
    public static void setup() {
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
        driver.get(ConfProperties.getProperty("site")); }

    @Test
    public void numbersTest(){
        loginPage.inputLogin(ConfProperties.getProperty("login"));
        loginPage.inputPass(ConfProperties.getProperty("passwd"));
        loginPage.clickLoginBtn();

        numbersPage.click_button_add_number();
        numbersPage.click_select_building();
        numbersPage.click_corpus_select_building();
        numbersPage.click_select_building();
        numbersPage.click_select_floor();
        numbersPage.click_corpus_select_floor();
        numbersPage.click_select_floor();
        numbersPage.click_select_category();
        numbersPage.click_corpus_select_category();
        numbersPage.click_select_category();
        numbersPage.input_text_room_1(ConfProperties.getProperty("room_1"));
        numbersPage.click_button_add_room();
        numbersPage.input_text_room_2(ConfProperties.getProperty("room_2"));
        numbersPage.click_select_checkbox();
        numbersPage.input_text_comment(ConfProperties.getProperty("insert_comment"));
        numbersPage.click_save_changes();
    }

}