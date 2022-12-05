package Inheritance.HasARelationship.C__Many_to_One.Stundessss;

// Dependant class
public class Branch {

    String branchName;
    Integer branchId;

    // Constructor Dependency Injection
    public Branch(String branchName, Integer branchId) {
        this.branchName = branchName;
        this.branchId = branchId;
    }
}
