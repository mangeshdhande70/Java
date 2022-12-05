package Inheritance.HasARelationship.C__Many_to_One.Running;

import Inheritance.HasARelationship.C__Many_to_One.Stundessss.Branch;
import Inheritance.HasARelationship.C__Many_to_One.Stundessss.Stundentssssss;

import java.util.Scanner;

public class TestApp {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Branch branch = new Branch("CSE",3);

        Stundentssssss[] stundentsssssses = new Stundentssssss[2];

        Stundentssssss stundentssssss1 = new Stundentssssss();
        stundentssssss1.setStdName("Akash Dhande");
        stundentssssss1.setStdId(5);
        // Many Students injecting the One Value(Same VAlue)
        stundentssssss1.setBranch(branch);
        stundentssssss1.setAddress("Chandrapur");



        Stundentssssss stundentssssss2 = new Stundentssssss();
        stundentssssss2.setStdName("Pravin Naitam");
        stundentssssss2.setStdId(6);
        stundentssssss2.setBranch(branch);
        stundentssssss2.setAddress("Rajura");

        stundentsssssses[0] = stundentssssss1;
        stundentsssssses[1] = stundentssssss2;

//        System.out.println("_____ Enter Student details ______");
//        int i= 0;
//        for(Stundentssssss ele : stundentsssssses)
//        {
//            System.out.println("Student Name  :: "+ele.getStdName()+
//                    "\nStudent Id   :: "+ele.getStdId()+"\nBranch   :: "+ele.getBranch()
//            +"\nStudent Address   :: "+ele.getAddress());
//        }


         stundentssssss1.getStudentDetails(stundentsssssses);



    }

}
