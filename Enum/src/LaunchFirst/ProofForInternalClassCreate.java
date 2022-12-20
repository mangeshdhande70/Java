package LaunchFirst;


enum WeekDays{

    MON,TUE,WED,THUR,FRI,SAT,SUN;


    WeekDays()  // not public bcz it for internal purpose
    {
        System.out.println("Constructor called");
    }

}


public class ProofForInternalClassCreate {


    public static void main(String[] args) {

        WeekDays object = WeekDays.FRI;

    }


}
