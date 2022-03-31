package com.company.MultiThreadingApi;


import java.io.IOException;
import java.net.*;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Crunchify.com
 * How to Run Multiple Threads Concurrently in Java? ExecutorService Approach.
 */

public class ParallelHttpExecutor {

    private final static int NUMBER_OF_THREADS = 30;

    public void runner(int threads) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(threads);

        String[] crunchifyList = {
                "https://crunchify.com",
                "https://yahoo.com",
                "https://www.ebay.com",
                "https://google.com",
                "https://www.example.co",
                "https://paypal.com",
                "http://bing.com/",
                "https://techcrunch.com/",
                "http://mashable.com/",
                "https://pro.crunchify.com/",
                "https://wordpress.com/",
                "https://wordpress.org/",
                "https://example.com/",
                "https://sjsu.edu/",
                "https://ask.crunchify.com/",
                "https://test.com.au/",
                "https://www.wikipedia.org/",
                "https://en.wikipedia.org"
        };

        for (int i = 0; i < crunchifyList.length; i++) {
            RestResponseFetcher worker = new RestResponseFetcher(crunchifyList[i]);
            executor.execute(worker);
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
            //waits till all executors are completed
            //empty body
        }
        System.out.println("execution completed!!");

    }

    public class RestResponseFetcher implements Runnable {
        String url;
        StringBuilder str = new StringBuilder();

        RestResponseFetcher(String url) {
            this.url = url;
        }


        @Override
        public void run() {

            try {
                URL urlLink = new URL(url);
                HttpURLConnection connection = (HttpURLConnection) urlLink.openConnection();

                connection.setRequestMethod("GET");
                connection.setConnectTimeout(3000);
                connection.connect();


                if (connection.getResponseCode() == 200) {
                    str.append("connection established: ").append(connection.getResponseCode()).append(" -- ").append(url);
                } else {
                    str.append("connection having issue: ").append(connection.getResponseCode()).append(" -- ").append(url);
                }

            } catch (UnknownHostException | MalformedURLException | ProtocolException f) {
                str.append("connection error: ").append("error code : Unknown").append(" -- ").append(url).append("\t").append("|").append("\t").append("error list: ").append(Arrays.toString(f.getStackTrace()));
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(str);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ParallelHttpExecutor runner = new ParallelHttpExecutor();
        runner.runner(NUMBER_OF_THREADS);
    }
}