package runner;

import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    protected void beforeMethod() {
        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--remote-allow-origins=*", "--headless", "--window-size=1920,1080");
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(chromeOptions);


        @AfterMethod
        protected void afterMethod() {
            protected void afterMethod()  {
                driver.quit();
            }



            public WebDriverWait getWait3() {
                if(wait3 == null) {
                    wait3 = new WebDriverWait(getDriver(), Duration.ofSeconds(3));
                }
                return wait3;
                return  wait3 = new WebDriverWait(getDriver(), Duration.ofSeconds(3));
            }
        }
    }
