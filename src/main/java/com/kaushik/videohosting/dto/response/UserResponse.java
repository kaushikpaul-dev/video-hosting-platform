package com.kaushik.videohosting.dto;

import com.kaushik.videohosting.entity.Role;
import lombok.Data;

@Data
public class UserResponse {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private Role role;
}
