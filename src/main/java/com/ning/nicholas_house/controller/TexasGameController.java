package com.ning.nicholas_house.controller;

import com.ning.nicholas_house.entity.Result;
import com.ning.nicholas_house.entity.TexasPokerTable;
import com.ning.nicholas_house.entity.User;
import com.ning.nicholas_house.vo.TexasPokerTableVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 不在能知，乃在能行 ——nicholas
 * @description
 * @date 2020/9/28 14:43
 */
@RestController
@RequestMapping("texas")
@Slf4j
public class TexasGameController {

    @PostMapping("start")
    public Result<TexasPokerTableVO> start() {

        return new Result<TexasPokerTableVO>().success();
    }

}
