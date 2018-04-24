package me.bishe.service;

import me.bishe.Enum.UserType;
import me.bishe.mapper.UserMapper;
import me.bishe.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LiYan
 * @date 2018/4/24 1:50
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 获取用户信息
     * @param stuNo 学号
     * @return 获取的用户信息
     */
    public UserModel getUserInfo(Long stuNo) {
        UserModel userModel = userMapper.queryByStuNo(stuNo);
        if (userModel == null) {
            userModel = registerUser(stuNo);
        }
        return userModel;
    }

    private UserModel registerUser(Long stuNo) {
        UserModel userModel = new UserModel();
        userModel.setStuNo(stuNo).setUserType(UserType.STUDENT.getValue());
        userMapper.insert(userModel);
        // TODO: 2018/4/24 自动把主键转入userModel
        return userModel;
    }


}
