package cn.thinkinjava.socket;

import java.io.IOException;
import java.net.Socket;


/**
 *
 * @author 莫那·鲁道
 * @date 2019-01-26-17:59
 */
public interface HttpHandler {

    void handle(Socket client) throws IOException;
}
