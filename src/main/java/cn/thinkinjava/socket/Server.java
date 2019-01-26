package cn.thinkinjava.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author 莫那·鲁道
 * @date 2019-01-26-17:56
 */
public class Server {

    private ServerSocket serverSocket;
    private HttpHandler httpHandler;

    public Server() throws IOException {
        this.serverSocket = new ServerSocket(8001);
    }

    public static Server create(InetSocketAddress inetSocketAddress, int i) {
        try {
            return new Server();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public void start() {
        for (; ; ) {
            try {
                Socket client = serverSocket.accept();
                httpHandler.handle(client);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public void createContext(String s, HttpHandler handler) {
        this.httpHandler = handler;
    }
}
