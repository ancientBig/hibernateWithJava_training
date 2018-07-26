package com.company;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        HibernateFunctions myFunctions_Hibernate= new HibernateFunctions();


        boolean isExit = false;

        int userinput=0;
        Scanner inscanner = new Scanner(System.in);

        while(!isExit)
        {

            System.out.println(" ------------------------------------- \\n\" +\n" +
                    "                \"\\tWelcome to administrator Mangement\" +\n" +
                    "                \"\\n\\t(moorena's version)\\n\" +\n" +
                    "                \" ------------------------------------- \\n\"");
            System.out.println("--------------------------MENU------------------------");
            System.out.println("\t 1:list all administrators");
            System.out.println("\t 2.add administrator");
            System.out.println("\t 3.delete administrators ");
            System.out.println("\t 4.update email of administrators");
            System.out.println("\t 5. exit");
            System.out.println();
            System.out.println("enter :");


            boolean good=false;

            do {


                try {
                        userinput = inscanner.nextInt();

                    good=true;
                    } catch (Exception ex) {
                        System.out.println("please enter a digit.");


                    System.out.println("--------------------------MENU------------------------");
                    System.out.println("--------------------------MENU------------------------");
                    System.out.println("\t 1:list all administrators");
                    System.out.println("\t 2.add administrators");
                    System.out.println("\t 3.delete administrators ");
                    System.out.println("\t 4.update email of administrators");
                    System.out.println("\t 5. exit");
                    System.out.println();
                    System.out.println("enter :");

                        inscanner.next();
                    }
            }while(!good);


                switch (userinput) {
                    case 1:
                        myFunctions_Hibernate.listAllAmin();
                        System.out.println("process complete..................");


                        break;

                    case 2:
                        String name, lname, email, password;

                        System.out.println("please enter name:");
                        name = inscanner.next();

                        System.out.println("please enter last name :");
                        lname = inscanner.next();

                        System.out.println("please enter email:");
                        email = inscanner.next();

                        System.out.println("please enter password:");
                        password = inscanner.next();

                        myFunctions_Hibernate.addAdmin(name, lname, email, password);

                        System.out.println("process complete..................");

                        break;



                    case 3:

                        System.out.println("please enter admin id :");

                        boolean go =false;
                        do {


                            try {


                                int id = inscanner.nextInt();
                                myFunctions_Hibernate.deleteAdmin(id);
                                System.out.println("process complete................");


                                go=true;
                            } catch (Exception ex) {

                                System.out.println("there was an id error!");
                                System.out.println("please enter admin id :");
                                inscanner.next();
                            }
                        }while(!go);

                        break;



                        ////////////////////
                    case 4:
                        System.out.println("please enter admin id :");
                        int id;


                        boolean go4 =false;
                        do {
                            try {
                                id = inscanner.nextInt();

                                System.out.println("please enter admin email :");

                                String e_mail = inscanner.next();
                                myFunctions_Hibernate.updateAdmin(id, e_mail);

                                System.out.println("process complete...............");


                                go4=true;
                            } catch (Exception ex) {
                                System.out.println("there was an id error!");
                                System.out.println("please enter admin id :");
                                inscanner.next();
                            }
                        }while(!go4);






                        break;

                    case 5:
                        System.out.println("goodbye");
                        isExit = true;
                        System.exit(9);
                        break;

                    default:
                        System.out.println("please choose correct menu");
                        break;

                }


        }

    }
}
