package com.myProject.tripease.dto.response;

import com.myProject.tripease.Enum.Gender;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CustomerResponse {

    private String name;
    private int age;
    private String emailId;
}
