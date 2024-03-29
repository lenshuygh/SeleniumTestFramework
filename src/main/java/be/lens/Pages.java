package be.lens;

import org.openqa.selenium.support.PageFactory;

public class Pages {
    public static HomePage homePage() {
        return new HomePage();
    }

    public static PathPages pathPages() {
        return new PathPages();
    }

    public static PathPage javaPathPage() {
        PathPage javaPathPage = new JavaPathPage();
        PageFactory.initElements(Browser.driver, javaPathPage);
        return javaPathPage;
    }
}
