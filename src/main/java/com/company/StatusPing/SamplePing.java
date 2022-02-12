package com.company.StatusPing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class SamplePing {
    private static final Logger LOGGER = LoggerFactory.getLogger(SamplePing.class);
    public static void main(String[] args) throws ProtocolException {
        System.out.println(status(6000));
    }

    public static boolean status(int timeout) {
        long timeBound=timeout;
        String url = "http://" + "127.0.0.1" + ":" + "1808" + "/nifi-registry/";
        boolean status = false;
        long millis = System.currentTimeMillis();
        timeBound=timeBound+millis;
        while (!status && millis<=timeBound) {
            millis = System.currentTimeMillis();
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setConnectTimeout(timeout);
                connection.setReadTimeout(timeout);
                connection.setRequestMethod("HEAD");
                int responseCode = connection.getResponseCode();
                System.out.println(responseCode);
                status = (200 <= responseCode && responseCode <= 399);
            } catch (MalformedURLException exception) {
                LOGGER.error("Exception while checking status: ", exception);
            } catch (IOException ex) {
                LOGGER.error("Exception while checking status: ", ex);
            }
        }
        return status;
    }
}
