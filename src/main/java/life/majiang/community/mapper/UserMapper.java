package life.majiang.community.mapper;

import life.majiang.community.model.User;
import org.apache.ibatis.annotations.*;

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

    @Select("select * from user where id = #{id}")
    User findById(@Param("id") Integer id);

    @Select("select * from user where account_id = #{accountId}")
    User findByAccountId(@Param("accountId") String accountId);

    @Update("update user set name = #{name},token = #{token},gmt_modified = #{gmtModified},avatar_url = #{avatarUrl} where id = #{id}")
    void update(User user);
}
