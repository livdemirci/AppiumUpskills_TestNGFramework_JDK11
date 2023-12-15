package generalstore.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;

public class ExtentReport {
    public static ExtentReports extent;
    public static ExtentTest test;

    public static void raporOlustur() {
        String path = System.getProperty("user.dir") + File.separator + "raporlar" + File.separator + "rapor.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("General Store Uygulamasi Raporu");
        reporter.config().setDocumentTitle("GeneralStore Raporu");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "livdemirci");

    }

    public static void testOlustur(String testAdi) {
         test =extent.createTest(testAdi);

    }

    public static void bilgiNotu(String bilgiNotu){
        if (test!=null){
            test.info(bilgiNotu);
        }
        test.info(bilgiNotu);
    }

    public static void raporuKaydet(){
        extent.flush();
    }

}
