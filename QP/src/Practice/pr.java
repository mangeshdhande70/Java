package Practice;

public class pr {
    public static void main(String[] args) {

        Student arr[] = new Student[5];
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();


        s1.setMarks(90.4f);
        s1.setName("Mangesh");
        s1.setRollNo(13);

        s2.setMarks(99.4f);
        s2.setName("Rakesh");
        s2.setRollNo(15);

        s3.setMarks(95.4f);
        s3.setName("Golya");
        s3.setRollNo(18);

        s4.setMarks(98.4f);
        s4.setName("Vivek");
        s4.setRollNo(25);

        s5.setMarks(99.9f);
        s5.setName("Dhiraj");
        s5.setRollNo(1);


        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        arr[3] = s4;
        arr[4] = s5;


        System.out.println("Student Name" + "   |  Student Roll No   " + "|   Marks");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print("   " + arr[i].getName() + "     |      " + arr[i].getRollNo() + "            |    "
                    + arr[i].getMarks());
            System.out.println();
        }
    }
}

    class Student {
        private String Name;
        private int rollNo;
        private float marks;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public int getRollNo() {
            return rollNo;
        }

        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        public float getMarks() {
            return marks;
        }

        public void setMarks(float marks) {
            this.marks = marks;
        }
    }

