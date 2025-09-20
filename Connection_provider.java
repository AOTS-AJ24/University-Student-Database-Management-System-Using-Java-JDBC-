package com.studnt.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Collection;

public class Connection_provider {

    static Connection con;

    public static Connection createC() {

        try {
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            /*
            com.mysql.cj.jdbc.Driver is the class name of MySQL JDBC driver.
            JDBC driver = a special Java class that lets your program talk to MySQL database.
            Without it, Java doesn’t know how to send SQL queries to MySQL.
             */

            //create connection
            String url = "jdbc:mysql://localhost:3306/student_management";
            String user = "root"; //open homepage to got this info
            String pswd ="Abhi@1231"; //mysql pswd
            con = DriverManager.getConnection(url,user,pswd);




        } catch (Exception e) {
            e.printStackTrace();

        }

        return con; //change the return type to our connection




    }
}