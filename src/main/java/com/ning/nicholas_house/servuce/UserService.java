package com.ning.nicholas_house.servuce;

import com.ning.nicholas_house.dao.UserMapper;
import com.ning.nicholas_house.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 不在能知，乃在能行 ——nicholas
 * @description
 * @date 2020/9/28 14:51
 */
@Service
public class UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public boolean register(User user) {

        return false;
    }

    public boolean login(User user) {

        return false;
    }
}
