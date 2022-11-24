package OPPS.src.Inheritance.Interface;

interface Bank{

    float rateOfIntrest();   // == public abstract float rateOfIntrest();

    int variable = 5;  // == public static final int variable = 5;    compiler adds that automatically

}
class SBI implements Bank{
    @Override
    public float rateOfIntrest() {
        return 9.6f;
    }
}

class HDFC implements Bank{

    @Override
    public float rateOfIntrest() {
        return 7.5f;
    }
}
class ICICI implements Bank{
    @Override
    public float rateOfIntrest() {
        return 6.0f;
    }
}

public class TestInterface implements Bank {

    public static void main(String[] args) {
        Bank ROI = new SBI();
        Bank r = new TestInterface();
        System.out.println(r.rateOfIntrest());

       System.out.println(ROI.rateOfIntrest());
    }

    @Override
    public float rateOfIntrest() {
        return 9.0f;
    }
}
