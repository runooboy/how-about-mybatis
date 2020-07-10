package infra.mapper;

import domain.entity.User;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description
 * @Author 2493468168@qq.com
 * @Date 2020/7/6 16:19
 * @Version 1.0
 **/
public interface UserMapper {
    List<User> selectAll();
}
