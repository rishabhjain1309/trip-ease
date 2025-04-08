package com.myProject.tripease.dto.request;


import com.myProject.tripease.Enum.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerRequest {

    private String name;
    private int age;
    private String emailId;

    private Gender gender;

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmailId() { return emailId; }
    public Gender getGender() { return gender; }

}
