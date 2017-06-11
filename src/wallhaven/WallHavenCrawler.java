package wallhaven;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * Created by clearbug on 2017/3/16.
 */
public class WallHavenCrawler {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("alpha.wallhaven.cc", 80);
            InputStream inputStream = socket.getInputStream();

        } catch (IOException e) {
            System.err.println("socket connect to https://alpha.wallhaven.cc failed.");
        }
    }
}
