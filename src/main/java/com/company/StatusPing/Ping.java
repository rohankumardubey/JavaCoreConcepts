package com.company.StatusPing;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Ping {
    public static void main(String[] args) {
        System.out.println(pingHost("127.0.0.1",1808,3 * 60 * 1000));
    }

    public static boolean pingHost(String host, int port, int timeout) {
        Boolean connect=true;
        while(connect) {
            try (Socket socket = new Socket()) {
                socket.connect(new InetSocketAddress(host, port), timeout);
                return false;
            } catch (IOException e) {
                return true; // Either timeout or unreachable or failed DNS lookup.
            }
        }
        return false;
    }
}
