package ru.werest.jspr.web;

import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.net.URIBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.List;

public class Request {
    private final String method;
    private final String path;
    private List<NameValuePair> query;

    public Request(String method, String path) {
        this.method = method;
        this.path = path;
    }

    public String getMethod() {
        return method;
    }

    public String getPath() {
        return path;
    }

    public static List<NameValuePair> getQueryParam(String url) throws UnknownHostException, URISyntaxException {
        URIBuilder uriBuilder = new URIBuilder(new URI(url));
        return uriBuilder.getQueryParams().isEmpty() ? null : uriBuilder.getQueryParams();
    }

    public static String getQueryParams(String url) {
        int i = url.indexOf("?");
        if (i == -1) {
            return url;
        }
        return url.substring(0, i);
    }


}
