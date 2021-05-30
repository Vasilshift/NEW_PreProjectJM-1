package jm.task.core.jdbc;
import java.sql.Statement;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
//import jm.task.core.jdbc.util.Util;
import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    //private static Util connect;
    //private static Statement statement;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        UserService userService = new UserServiceImpl();

        userService.dropUsersTable();

        userService.createUsersTable();

        userService.saveUser("Tik", "Ernom", (byte) 45);
        userService.saveUser("Rik", "Kilon", (byte) 89);
        userService.saveUser("Sam", "Nikon", (byte) 12);
        userService.saveUser("Rom", "Polen", (byte) 34);

        userService.getAllUsers();
        userService.cleanUsersTable();
        //userService.dropUsersTable();





    }

}

