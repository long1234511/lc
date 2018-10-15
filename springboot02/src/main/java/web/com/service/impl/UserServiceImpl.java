package web.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import web.com.dao.UserDao;
import web.com.entity.User;
import web.com.service.UserService;

/**
 * @author:longcong
 * @email:longcong@aliyun.com
 * @date:2018/5/17 16:15
 * @description:用户接口实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public String addUser(User user) {
        userDao.addUser(user);
        return "保存成功";
    }
}
