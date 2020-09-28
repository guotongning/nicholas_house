package com.ning.nicholas_house.controller;

import com.ning.nicholas_house.entity.Result;
import com.ning.nicholas_house.entity.User;
import com.ning.nicholas_house.servuce.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 不在能知，乃在能行 ——nicholas
 * @description
 * @date 2020/9/27 17:55
 */
@RestController
@RequestMapping("texas")
@Slf4j
public class TexasUserController {

    private final UserService userService;

    @Autowired
    public TexasUserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("register")
    public Result<User> register(@RequestBody User user) {
        log.info("用户注册 User - {}", user);
        boolean registerSuccess = false;
        boolean loginSuccess = false;
        if (check(user)) {
            try {
                registerSuccess = userService.register(user);
                if (registerSuccess) {
                    loginSuccess = userService.login(user);
                }
            } catch (Exception e) {
                log.error("用户注册异常 - {}", e.getMessage(), e);
            }
        }
        if (registerSuccess && loginSuccess) {
            return new Result<>(user);
        }
        return new Result<User>().failure();
    }

    private boolean check(User user) {
        return StringUtils.isNotEmpty(user.getAccount())
                &&
                StringUtils.isNotEmpty(user.getNickName())
                &&
                StringUtils.isNotEmpty(user.getPassword());
    }
}
