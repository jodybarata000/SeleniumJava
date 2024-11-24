package tests.utils;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

import static tests.steps.Hooks.getScenario;
import static tests.utils.driver.DriverUtils.*;

public class UrlUtils {
    private static final SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss 'GTM(Timezone)'");

    /**
     * Output of all possible information if things go wrong
     */
    public static void printFailInfo() {
        time.setTimeZone(TimeZone.getTimeZone("GTM"));

        long failTime = System.currentTimeMillis();

        getScenario().log("Step failed at: " + time.format(failTime));
        try {
            if (isBrowserAlive()) {
                getScenario().log("URL opened: " + getPageUrl());
            }
        } catch (Exception e) {
            getScenario().log(">>> The currently opened URL could not be determined.<<<");
        }
    }

    public static String getPageUrl() {
        return driver().getCurrentUrl();
    }
}
