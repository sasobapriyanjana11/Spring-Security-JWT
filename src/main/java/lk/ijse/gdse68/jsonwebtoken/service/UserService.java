package lk.ijse.gdse68.jsonwebtoken.service;

import lk.ijse.gdse68.jsonwebtoken.dto.UserDTO;

public interface UserService {
    int saveUser(UserDTO userDTO);
    UserDTO searchUser(String userName);
}
