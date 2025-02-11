package guru.qa.core.config;

public enum Config {
    INSTANCE;

    public Browser browser = Browser.CHROME;
    public long actionTimeout = 6000L;
    public boolean headless = false;
    public boolean rerunFailedTests = false;
}
