package cn.thinkinjava;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 *
 * @author 莫那·鲁道
 * @date 2019-01-26-17:15
 * @see HttpServletRequestWrapper
 * @see HttpServletResponseWrapper
 */
public class MyServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // 先发送 header
        MyHttpServletResponse.sendHeader(resp.getOutputStream());
        // 发送内容. 即 URL 后面的内容.
        resp.getOutputStream().println(req.getQueryString());
    }

}
