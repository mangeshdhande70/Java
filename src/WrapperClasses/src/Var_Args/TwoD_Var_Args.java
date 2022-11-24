package WrapperClasses.src.Var_Args;



class Student{


    public void totalStudent(int[] ...x)
    {

        System.out.println(x+"\n\n");

        for (int[] a:x) {
             System.out.println(a+"");
            for (int arr:a) {
                System.out.print(" "+arr);
            }
            System.out.println("\n\n");
        }

    }
}

public class TwoD_Var_Args {


    public static void main(String[] args) {


        Student student = new Student();
//        student.totalStudent({{23,43},{345,65}});
        student.totalStudent(new int[][]{{23, 54,98}, {32,24,25423,242,242, 99}, {78, 60}});

    }
}
