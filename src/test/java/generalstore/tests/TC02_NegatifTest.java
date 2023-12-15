package generalstore.tests;

import generalstore.pages.FormSayfasi;
import org.testng.annotations.Test;


public class TC02_NegatifTest {

    @Test
    public void testNegativeTest() {
        FormSayfasi formSayfasi = new FormSayfasi();
        formSayfasi.letsShopButonunaTikla();
        formSayfasi.hataMesajininGorundugunuDogrula("Please enter your name");
    }

}