package com.myProject.tripease.dto.request;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DriverRequest {

    private String name;
    private int age;
    private String emailId;
}
