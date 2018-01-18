package support;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.Collections;

/**
 * Created by metttalist on 1/18/18.
 */
public class RestHeader<T> {

    public HttpEntity<T> getEntityWithHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        return new HttpEntity<T>(headers);
    }

    public HttpEntity<T> getEntityWithHeader(String token) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization" , token);
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        return new HttpEntity<T>(headers);
    }

    public HttpEntity<T> getEntityWithHeader(T request, String token) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization" , token);
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        return new HttpEntity<T>(request, headers);
    }
}
