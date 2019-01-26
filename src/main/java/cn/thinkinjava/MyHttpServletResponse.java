package cn.thinkinjava;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletOutputStream;


/**
 *
 * @author 莫那·鲁道
 * @date 2019-01-26-18:55
 */
public class MyHttpServletResponse extends BaseHttpServletResponse {

    public MyHttpServletResponse(OutputStream outputStream) {
        super(outputStream);
    }

    /** just for test  */
    private static String base = "HTTP/1.1 200 OK\n"
        + "Content-Type: text/html;charset=utf-8\n";


    public static void sendHeader(ServletOutputStream o) {
        try {
            o.print(base);
            o.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
