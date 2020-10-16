package servlet;

import bean.EchartsResult;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EchartsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json");

//        x = ["星期" + str(i) for i in range(1, 8)]
//
//        y = [random() * 100 for _ in range(1, 8)]
//
//        result = {
//                "xData" : x,
//                "yData" : y
        List<String> xData = new ArrayList<>();
        List<Integer> yData = new ArrayList<>();

        for (int i = 1; i < 8; i++) {
            xData.add("星期" + i);
            yData.add(i);
        }

        EchartsResult echartsResult = new EchartsResult();
        echartsResult.setxData(xData);
        echartsResult.setyData(yData);

        JSONObject json = JSONObject.fromObject(echartsResult);
        resp.getWriter().println(json);
    }
}
