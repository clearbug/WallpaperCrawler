import java.io.*;
import java.net.Socket;

/**
 * Created by clearbug on 2017/3/16.
 */
public class Starter {

    public static void main(String[] args) throws Exception {
        System.out.println("hello, world");
        Socket socket = new Socket("www.baidu.com", 80);
        socket.getOutputStream().write("GET / HTTP/1.1\n\n".getBytes());
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];

        while (inputStream.available() != 0) {
            inputStream.read(bytes);
        }

        System.out.println(new String(bytes));

        for (int i = 0; i < bytes.length; i++) {
            System.out.println((i + 1) + ": " + bytes[i]);
        }
    }
}
