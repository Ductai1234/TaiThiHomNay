//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class TestSelium {
//    ChromeDriver chromeDriver;
//    @BeforeEach
//    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//        chromeDriver = new ChromeDriver();
//    }
//    @Test
//    public void test() throws InterruptedException {
//        chromeDriver.get("https://www.savor.vn/");
//        Thread.sleep(2000);
//        chromeDriver.findElement(By.xpath("//button[contains(text(),'Hà Nội')]")).click();
//        chromeDriver.findElement(By.xpath("//div[@class='relative flex w-full justify-center lg:hidden lg:w-full']//div//button[@class='row-span-1 row-start-5 m-auto mb-4 mt-2 h-10 w-52 cursor-pointer rounded-100 border-0 font-lexend text-base font-bold uppercase xs:h-12 xs:w-64 xs:text-lg sm:mb-12 sm:h-14 sm:w-68 sm:text-xl md:mt-12 md:h-16 md:w-80 md:text-2xl lg:col-span-6 lg:col-start-1 lg:row-span-1 lg:mt-8 2xl:h-18 text-sc_pink-2800 bg-sc_yellow-800'][contains(text(),'Đặt ngay')]")).click();
//
//    }
//}
