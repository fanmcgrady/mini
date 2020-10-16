import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import servlet.CalculateServlet;
import servlet.EchartsServlet;
import servlet.HelloServlet;

public class MiniprogramServer {

    public static void main(String[] args) {

        try {
            // 1、配置端口
            int port = 8888;
            Server server = new Server(port);

            // 2、配置服务器参数
            WebAppContext context = new WebAppContext();
            context.setContextPath("/");
            context.setResourceBase("web"); // 指定根目录
            server.setHandler(context);

            context.addServlet(HelloServlet.class, "/hello");
            context.addServlet(CalculateServlet.class, "/calc");
            context.addServlet(EchartsServlet.class, "/echarts");

            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
