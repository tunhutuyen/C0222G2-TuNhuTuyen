package com.myself.model;

import com.myself.validate_annotation.NameNotDuplicate;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.GroupSequence;
import javax.validation.constraints.*;
//Group validate theo nhom
@GroupSequence(value = {UserDto.class,BasicInfo.class,AdvanceInfo.class})
public class UserDto implements Validator {
    private Integer id;
    @NotBlank(groups = AdvanceInfo.class)
    @NameNotDuplicate(groups = BasicInfo.class)
    @Pattern(regexp = "^[A-Za-z]+$",message = "Invalid format",groups = AdvanceInfo.class)
    @Size(min = 5,max = 45,groups = AdvanceInfo.class)
    private String firstName;

    @NotNull
    @NotEmpty
    @NotBlank
    @Pattern(regexp = "^[A-Za-z]+$",message = "Invalid format")
    @Size(min = 5,max = 45)
    private String lastName;

    @NotNull
    @NotBlank
    @Email
    private String email;

    @NotNull
    @NotEmpty
    @NotBlank
    @Pattern(regexp = "^(0)[0-9]{9}$",message = "Phone number must have 10 number and start is 0")
    private String phoneNumber;

//    @NotNull
//    @NotEmpty
//    @NotBlank
    @PositiveOrZero(message = "Please input number >=18")
    @Min(18)
    private Integer age;

    public UserDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
    }
}
