package life.majiang.community.mapper;

import life.majiang.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * ClassName:UserMapper
 * Package:life.majiang.community.mapper
 * Description:
 *
 * @Date:2019/12/1 下午 12:05
 * @Author:gaochenyu2012@126.com
 */
@Mapper
public interface UserMapper {

    @Insert("insert into user (name,account_id,token,gmt_create,gmt_modified,avatar_url) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
    void insert(User user);

    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);

}
