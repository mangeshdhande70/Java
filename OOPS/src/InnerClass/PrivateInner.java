package InnerClass;


public class PrivateInner {

    int b=23;

    public void display()
    {
        System.out.println("In Outer Display");
        System.out.println(b);
    }


    class AInner{

        private void display1()
        {
            System.out.println("Inside Inner Display1()");
            System.out.println(b);
        }

        int b= 25;

    }


    public static void main(String[] args) {

      PrivateInner obj = new PrivateInner();
      obj.display();

      AInner aInner = obj.new AInner();
      aInner.display1();  // ---- access bcz it is same class

    }


}
