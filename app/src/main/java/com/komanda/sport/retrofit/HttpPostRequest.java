package com.komanda.sport.retrofit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpPostRequest {
    final URL url;

    {
        try {
            url = new URL("http://jsonplaceholder.typicode.com/posts?_limit=10");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    final HttpURLConnection con;

    {
        try {
            con = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
