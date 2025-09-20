package com.studnt.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class studentDao {
    /*
    DAO stands for Data Access Object.
    It is a design pattern used in Java (and other languages)
    to separate database logic from the rest of your code.
     */

    public static boolean insertStudentToDB(Student_info_1 stu ) {


        boolean f=false;

        try{
            //jdbc code
            Connection con = Connection_provider.createC();
            String q1 = " insert into students_info(s_name,s_phone,s_city ) values (?,?,?) ";

            //prepared statement
            PreparedStatement pstmt = con.prepareStatement(q1);

            //set value of parameter
            pstmt.setString(1, stu.getStudent_name());
            pstmt.setString(2, stu.getStudent_Phone());
            pstmt.setString(3, stu.getStudent_City());

            //execute
            pstmt.executeUpdate();
            f =true;
        } catch (Exception e) {
           e.printStackTrace();
        }
        return f;


    }


    //we have created a method to get by or address by user id
    public static boolean deleteStudent(int user_id) {
        // void -> boolean
        //now we copy content from above class

        boolean f = false;

        try {
            //jdbc code
            Connection con = Connection_provider.createC();
            String q1 = " delete from students_info where s_id = ? ;";
            //we changed query and made some edits

            //prepared statement
            PreparedStatement pstmt = con.prepareStatement(q1);

            //set value of parameter
            pstmt.setInt(1, user_id); // setString to  setInt


            //execute
            pstmt.executeUpdate();
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;

    }


    public static void DisplayAllStudents() {
        //to display all students data

//        boolean f = false;

        try {
            //jdbc code
            Connection con = Connection_provider.createC();
            String q1 = " select*from students_info; ";
            //we changed query and made some edits

            //prepared statement
            Statement stmt=con.createStatement();

            ResultSet set_1 = stmt.executeQuery(q1);

            while(set_1.next()){
                int id = set_1.getInt(1);
                String name = set_1.getString(2);
                String phone = set_1.getString(3); //by column index
                String city = set_1.getString("s_city"); // by column name

                System.out.println("ID: "+ id);
                System.out.println("Name: "+ name);
                System.out.println("Phone: "+ phone);
                System.out.println("City: "+ city);
                System.out.println("----------------------------------------");



            }

        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    public static boolean UpdateintoDB(int id, String name, String phone, String city) {


        boolean f=false;

        try{
            //jdbc code
            Connection con = Connection_provider.createC();
            String q1 = " update students_info SET s_name=? ,s_phone =? ,s_city=?  where s_id =?  ";

            //prepared statement
            PreparedStatement pstmt = con.prepareStatement(q1);

            //set value of parameter
            pstmt.setString(1, name);
            pstmt.setString(2, phone);
            pstmt.setString(3,city);
            pstmt.setInt(4,id);


            //execute
            pstmt.executeUpdate();
            f =true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++// Extra keede i did


    public static boolean UpdateintoDBname(String name, int id) {
        boolean f =false;

        try{
            //jdbc code
            Connection con = Connection_provider.createC();
            String q1 = " update students_info SET s_name=?  where s_id =?  ";

            //prepared statement
            PreparedStatement pstmt = con.prepareStatement(q1);

            //set value of parameter
            pstmt.setString(1, name);
            pstmt.setInt(2, id);




            //execute
            pstmt.executeUpdate();
            f =true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;


    }

    public static boolean UpdateintoDBphone(String phone, int id) {
        boolean f =false;

        try{
            //jdbc code
            Connection con = Connection_provider.createC();
            String q1 = " update students_info SET s_phone=?  where s_id =?  ";

            //prepared statement
            PreparedStatement pstmt = con.prepareStatement(q1);

            //set value of parameter
            pstmt.setString(1, phone);
            pstmt.setInt(2, id);




            //execute
            pstmt.executeUpdate();
            f =true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;


    }

    public static boolean UpdateintoDBcity(String city, int id) {
        boolean f =false;

        try{
            //jdbc code
            Connection con = Connection_provider.createC();
            String q1 = " update students_info SET s_city=?  where s_id =?  ";

            //prepared statement
            PreparedStatement pstmt = con.prepareStatement(q1);

            //set value of parameter
            pstmt.setString(1, city);
            pstmt.setInt(2, id);




            //execute
            pstmt.executeUpdate();
            f =true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;


    }


}
