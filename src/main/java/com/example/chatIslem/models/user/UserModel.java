package com.example.chatIslem.models.user;

import com.example.chatIslem.models.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserModel extends BaseEntity {


    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;

}
