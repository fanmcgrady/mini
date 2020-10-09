package servlet;

import bean.Department;
import bean.User;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        response.setContentType("application/json");

        String id = request.getParameter("id");

        if ("1".equals(id)) {
            User father = new User();
            father.setName("爸爸");
            father.setNumber("111");

            List<User> list = new ArrayList<>();

            Department department = new Department();
            department.setName("网安学院");
            department.setId("111");

            for (int i = 0; i < 10; i++) {
                User user = new User();
                user.setName("zhangsan" + i);
                user.setNumber(String.valueOf(i));
                user.setCollege(department);

                list.add(user);
            }

            father.setChilds(list);

            JSONObject jsonObject = JSONObject.fromObject(father);
            response.getWriter().println(jsonObject);
        } else {
            response.getWriter().println("请传入id");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}