package pl.fis.lbd.springlbd.entity.employee;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Employee {

    private Long id;
    private String firstName;
    private String lastName;
    private Long pesel;
    private String idNumber;
    private String phoneNumber;

    public Employee(Long id, String firstName, String lastName, Long pesel, String idNumber, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getId() {
        return id;
    }

    public long getPesel() {
        return pesel;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return new EqualsBuilder().append(id, employee.id).append(firstName, employee.firstName).append(lastName, employee.lastName).append(pesel, employee.pesel).append(idNumber, employee.idNumber).append(phoneNumber, employee.phoneNumber).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(firstName).append(lastName).append(pesel).append(idNumber).append(phoneNumber).toHashCode();
    }
}
