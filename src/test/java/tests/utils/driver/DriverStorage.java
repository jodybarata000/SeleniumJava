package tests.utils.driver;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.ConcurrentLinkedQueue;

public class DriverStorage {
    public static final ConcurrentLinkedQueue<DriverStorage> DRIVER_STORAGE = new ConcurrentLinkedQueue<>();
    private final WebDriver driver;
    private final Thread thread;

    DriverStorage(Thread thread, WebDriver driver) {
        this.thread = thread;
        this.driver = driver;
    }

    public static void addToStorage(Thread thread, WebDriver driver) {
        DRIVER_STORAGE.add(new DriverStorage(thread, driver));
    }

    public static void reinitializeDriverInStorage(Thread currentThread, WebDriver driver) {
        if (DRIVER_STORAGE.removeIf(ds -> ds.thread.equals(currentThread))) {
            addToStorage(currentThread, driver);
        }
    }
}
