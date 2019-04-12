package userbanklist.web;


import userbanklist.dao.AccountDAO;
import userbanklist.dao.UserDAO;
import userbanklist.dao.UserDAOImpl;
import userbanklist.db.ConnectionManager;
import userbanklist.entities.User;
import userbanklist.service.AccountService;
import userbanklist.service.AccountServiceImpl;
import userbanklist.service.UserService;
import userbanklist.service.UserServiceImpl;
import userbanklist.util.UserAccountUtils;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class RootServlet extends HttpServlet {

    private UserService userService;
    private AccountService accountService;


    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        userService = new UserServiceImpl();
        accountService = new AccountServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String action = req.getParameter("get");
        if (action.equals("rich")) {


            req.setAttribute("user", userService.getbyId(UserAccountUtils.getRichestId(accountService.getAll())));
            req.getRequestDispatcher("/userAccounts.jsp").forward(req, resp);

        } else if (action.equals("sum")) {
            req.setAttribute("sum", accountService.getSum());
            req.getRequestDispatcher("/userAccounts.jsp").forward(req, resp);
        }

    }
}
