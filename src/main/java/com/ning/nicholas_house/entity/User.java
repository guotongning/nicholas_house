package com.ning.nicholas_house.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author 不在能知，乃在能行 ——nicholas
 * @description 用户对象
 * @date 2020/9/27 16:28
 */
@Data
@ToString
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    /**
     * 玩家昵称
     */
    private String nickName;
    /**
     * 玩家账号
     */
    private String account;
    /**
     * 账号密码
     */
    private String password;
    /**
     * 玩家头像
     */
    private String headPortrait;
    /**
     * 邮箱
     */
    private String email;
}
