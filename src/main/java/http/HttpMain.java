package http;

import java.net.DatagramPacket;
import java.net.URI;
import java.net.URLConnection;

public class HttpMain {

    public static void main(String[] args) {
        // RestTemplate
        // WebClient
        URLConnection urlConnection = URI.create("https://github.com/golang/go").toURL().openConnection();
        urlConnection.connect();

        // TCP, UDP - протокол для взаимодействия по сети
        // TLS\SSL (Transport Layer Security \ Secure Socket Layer)
        // HTTP, Protobuf, ... - протоколы-форматы для сообщений
        // HTTPS = HTTP + Secure
    }

}
