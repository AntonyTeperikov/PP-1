package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import javax.transaction.SystemException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SystemException, SQLException {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("ba","saw", (byte) 23);
        userService.saveUser("sqd","fwqfas", (byte) 24);
        userService.saveUser("ws","wqdwd", (byte) 24);
        userService.saveUser("qqe","dqw", (byte) 24);
        System.out.println(userService.getAllUsers().toString());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
