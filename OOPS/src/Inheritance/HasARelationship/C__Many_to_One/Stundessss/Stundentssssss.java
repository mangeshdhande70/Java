package Inheritance.HasARelationship.C__Many_to_One.Stundessss;

public class Stundentssssss {


    private String stdName;
    private Integer stdId;
    private String address;

     private Branch branch;

     // Setter Dependency Injection
    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public Integer getStdId() {
        return stdId;
    }

    public void setStdId(Integer stdId) {
        this.stdId = stdId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public void getStudentDetails(Stundentssssss[] stundentsssssses)
    {
        int i=1;

        for(Stundentssssss ele : stundentsssssses)
        {

            System.out.println("_____ Student details "+(i++)+"______");
            System.out.println("Student Name  :: "+ele.getStdName()+"" +
                    "\nStudent Id   :: "+ele.getStdId()+"\nBranch   :: "+ele.getBranch().branchName
                    +"\nBranch Id   :: "+ele.getBranch().branchId+","+ele.branch
                    +"\nStudent Address   :: "+ele.getAddress());
            System.out.println();
        }

    }


}
