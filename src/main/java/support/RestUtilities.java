package support;

/**
 * This class implements utilities and helper methods to be used in REST calls.
 */
public class RestUtilities {

    /**
     *Returns corresponding Base Url for each environment.
     *
     * @return Base Url
     */
    public static String getBaseUrl() {
        String host = System.getProperty("host");
        String baseUrl;

        switch (host) {
            case "ci":
                baseUrl = "";
                break;
            case "demo":
                baseUrl = "";
                break;
            case "local":
                baseUrl = "http://localhost:8080/";
                break;
            default:
                throw new RuntimeException("No or unknown host value. Cannot Continue");
        }
        return baseUrl;
    }
}
