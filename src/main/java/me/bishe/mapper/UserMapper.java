package me.bishe.mapper;

import me.bishe.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author LiYan
 * @date 2018/4/24 0:48
 */
@Mapper
public interface UserMapper {
    int insert(UserModel userModel);
    UserModel queryByStuNo(@Param("stuNo") Long sutNo);

}
