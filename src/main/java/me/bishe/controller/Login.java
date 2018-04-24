package me.bishe.controller;

import lombok.Data;
import me.bishe.base.BaseRes;
import me.bishe.model.UserModel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiYan
 * @date 2018/4/23 22:52
 */
@Service
@RestController()
public interface Login {

    @PostMapping("/login")
    LoginRes login(LoginReq loginReq);
    @RequestMapping("/loginOut")
    BaseRes loginOut(LoginOutReq loginOutReq);

    @Data
    class LoginReq {
        private Long stuNo;
        private String password;
    }
    @Data
    class LoginRes {
        private UserModel user;
    }
    @Data
    class LoginOutReq {
        private int id;
    }
}
