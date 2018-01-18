package support;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.DefaultResponseErrorHandler;

/**
 * Created by metttalist on 1/18/18.
 */
public class RestTemplate {

    /**
     * Creates new Rest Template for the content.
     *
     * @return new template.
     */
    public org.springframework.web.client.RestTemplate createRestTemplate() {
        org.springframework.web.client.RestTemplate template = new org.springframework.web.client.RestTemplate();

        template.setErrorHandler(new DefaultResponseErrorHandler() {
            protected  boolean hasError(HttpStatus httpStatus) {
                return false;
            }});

        return template;
    }
}
