package com.example.chatIslem.services.user;


import com.example.chatIslem.models.user.UserModel;

import java.util.List;
import java.util.Optional;

public interface IUserService {
   UserModel saveUser(UserModel user);
   void deleteUser(String id);
   UserModel getUser(String id);
   List<UserModel> getAllUser();
   UserModel getUserByEmail(String email);
   UserModel getUserByUsername(String username);
   Boolean existsUserByEmail(String email);
   Boolean existsUserByUsername(String username);

}
