
# Servlet-learning
## 一个超级简单的 Servlet 实现, 你可以认为这是一个 mini Tomcat.

实现了解析 http 请求.

实现了发送 http 结果.

实现了 HttpServlet#service(HttpServletRequest req, HttpServletResponse resp) 接口.

除了 Servlet 2.5 api, 没有使用任何其他 jar 包. 所有的实现都是基于 JDK8 API.

## Quick start


1. 启动 cn.thinkinjava.Bootstrap main 方法, 即打开 8001 端口.

2. 在浏览器输入 
`http://localhost:8001/hi?key=helloworld`, 返回 `/hi?key=helloworld`.

3. 根据此思路,你可以扩展该服务器.




