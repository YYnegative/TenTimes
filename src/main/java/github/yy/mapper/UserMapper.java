package github.yy.mapper;

import github.yy.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: day75-spring-mybatis
 * @author: yy
 * @create: 2019-07-26 20:52
 * Description: No Description
 */
@Mapper
public interface UserMapper {
    public List<User> queryUser();

}