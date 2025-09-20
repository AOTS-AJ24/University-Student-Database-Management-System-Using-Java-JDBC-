package Student_Managment_App;

import com.studnt.manage.Student_info_1;
import com.studnt.manage.studentDao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Student Managment App ");
        BufferedReader Br =new BufferedReader(new InputStreamReader(System.in));


        while (true){
            System.out.println("Press 1 to Add Student ");
            System.out.println("Press 2 to Delete Student ");
            System.out.println("Press 3 to Display Student ");
            System.out.println("Press 4 to update Student details");
            System.out.println("Press 5 to Exit  Student Managment App ");

            int c1 =Integer.parseInt(Br.readLine());//to read input

            if (c1 == 1){
                //add student details
                System.out.println("Enter your Name : ");
                String name = Br.readLine();

                System.out.println("Enter your Phone : ");
                String phone = Br.readLine();

                System.out.println("Enter your City : ");
                String city = Br.readLine();

                //create student object to store student data
                Student_info_1 stu = new Student_info_1(name,phone,city);

                //to insert into db
                boolean ans = studentDao.insertStudentToDB(stu);

                if(ans){
                    System.out.println("Student ids added succesfully....");
                }else {
                    System.out.println("something went wrong try again");
                }

                System.out.println("STudent details: "+ stu);

            }
            else if (c1==2) {
                //delete stu
                System.out.println("Enter student id to delete : ");
                int user_id = Integer.parseInt(Br.readLine());
                boolean del =studentDao.deleteStudent(user_id);
                if (del){
                    System.out.println("Student Data Deleted...");
                }else{
                    System.out.println("something went wrong ");
                }



            }
            else if (c1==3) {

                //display stu
                studentDao.DisplayAllStudents();

            }
//            else if (c1==4) {
//                //update written by me
//                System.out.println("Enter student Id to Update");
//                int id = Integer.parseInt(Br.readLine());
//
//                System.out.println("Enter your Name to be updated : ");
//                String name = Br.readLine();
//
//                System.out.println("Enter your Phone to be updated : ");
//                String phone = Br.readLine();
//
//                System.out.println("Enter your City to be updated : ");
//                String city = Br.readLine();
//
//
//                //to update in DB
//                boolean upd=studentDao.UpdateintoDB(id,name,phone,city);
//                if (upd){
//                    System.out.println("Student Data Updated...");
//
//                }else{
//                    System.out.println("something went wrong...");
//                }
//
//
//            }
            else if (c1==4) {
                Boolean exit = false;
                //update written by me
                while(!exit){
                Scanner sc = new Scanner(System.in);

                //just dooing some keede
                System.out.println(" What do u want to change ?");
                System.out.println("Press 1  to change Name  only ");
                System.out.println("Press 2  to change Phone  only ");
                System.out.println("Press 3  to change city  only ");
                System.out.println("Press 4  to change All: name,phone,city ");
                System.out.println("Press 5  to break of sub loop ");

                int choice = sc.nextInt();
                if(choice==1){

                    System.out.println("Enter student Id to Update");
                    int id = sc.nextInt();
                    System.out.println("Enter your Name to be updated : ");
                    String name = sc.next();

                    boolean name_update =studentDao.UpdateintoDBname(name,id);
                    if (name_update){
                        System.out.println(" name details changed succesfully ");
                    }else {
                        System.out.println("something went wrong while changing name details");
                    }

                }
                else if (choice==2){
                    System.out.println("Enter student Id to Update");
                    int id = sc.nextInt();

                    System.out.println("Enter your Phone to be updated : ");
                    String phone = sc.next();

                    boolean phone_update =studentDao.UpdateintoDBphone(phone,id);
                    if (phone_update){
                        System.out.println(" phone details changed succesfully ");
                    }else {
                        System.out.println("something went wrong while changing phone details");
                    }
                }
                else if(choice ==3){
                    System.out.println("Enter student Id to Update");
                    int id = sc.nextInt();

                    System.out.println("Enter your City to be updated : ");
                    String city = sc.next();

                    boolean city_update =studentDao.UpdateintoDBcity(city,id);
                    if (city_update){
                        System.out.println(" city details changed succesfully ");
                    }else  {
                        System.out.println("something went wrong while changing city details");
                    }
                }
                else if(choice==4){

                    System.out.println("Enter student Id to Update");
                int id = Integer.parseInt(Br.readLine());

                System.out.println("Enter your Name to be updated : ");
                String name = Br.readLine();

                System.out.println("Enter your Phone to be updated : ");
                String phone = Br.readLine();

                System.out.println("Enter your City to be updated : ");
                String city = Br.readLine();


                //to update in DB
                boolean upd=studentDao.UpdateintoDB(id,name,phone,city);
                if (upd){
                    System.out.println("Student Data Updated...");

                }else{
                    System.out.println("something went wrong...");
                }

                }else if (choice==5) {
                  exit = true;
                // to get out of this sub loop
                }
                else {

                }
                System.out.println("Invalid choice please select again !");

            }
            }
            else if (c1==5){
                //exit

                break;

            }
            else {

            }

        }
        //outside while loop
        System.out.println("Thank you for using my application ");



    }
}
