package com.example.chatIslem.models.user;

import com.example.chatIslem.models.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "role")
public class Role extends BaseEntity {


    private ERole name;

}
