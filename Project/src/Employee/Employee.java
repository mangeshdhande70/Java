package Employee;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {


    private String employeeName;
    private Long employeeId;
    private String unit;
    private String baseLocation;
    private LocalDate dateOfJoining;

    private Address address;

    private PersonalDetails personalDetails;

    public Employee(String employeeName, Long employeeId, String unit, String baseLocation, LocalDate dateOfJoining, Address address,PersonalDetails personalDetails) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.unit = unit;
        this.baseLocation = baseLocation;
        this.dateOfJoining = dateOfJoining;
        this.address = address;
        this.personalDetails = personalDetails;
    }


    public String getEmployeeName() {
        return employeeName;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public String getUnit() {
        return unit;
    }

    public String getBaseLocation() {
        return baseLocation;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public Address getAddress() {
        return address;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", unit='" + unit + '\'' +
                ", baseLocation='" + baseLocation + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                ", address=" + address +
                ", personalDetails=" + personalDetails +
                '}';
    }
}
