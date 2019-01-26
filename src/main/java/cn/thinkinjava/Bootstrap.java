package cn.thinkinjava;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;

import cn.thinkinjava.socket.HttpHandler;
import cn.thinkinjava.socket.Server;


/**
 *
 * @author 莫那·鲁道
 * @date 2019-01-26-17:18
 */
public class Bootstrap {

    public static void main(String[] args)  {

        Server server = Server.create(new InetSocketAddress(8001), 0);
        assert server != null;
        server.createContext("/hi", new Handler());
        server.start();


    }

    /**
     * servlet 单例,线程安全.
     */
    static MyServlet servlet = new MyServlet();

    static class Handler implements HttpHandler {

        public void handle(Socket client) throws IOException {
            System.out.println("hello");

            // 构造 Request
            HttpServletRequestWrapper req = new HttpServletRequestWrapper(new MyHttpServletRequest(client.getInputStream()));
            // 构造 Response.
            HttpServletResponseWrapper res = new HttpServletResponseWrapper(new MyHttpServletResponse(client.getOutputStream()));
            // 执行 service 方法.
            servlet.service(req, res);

            System.out.println("hello over");
        }
    }


}
