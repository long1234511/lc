package web.com.dao;

import org.springframework.stereotype.Repository;
import web.com.entity.User;

/**
 * @version V1.0.1
 * @classname userDao
 * @description:
 * @author: longcong
 * @email: longcong@aliyun.com
 * @date: 2018-09-21  16:27
 **/
@Repository
public interface UserDao {

     int addUser(User user);
}
