package com.easylinkin.linkshow.sys.service;

import com.easylinkin.linkshow.sys.dao.UserDao;
import com.easylinkin.linkshow.sys.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * UserService
 * <p>
 * 功能:
 *
 * <pre>
 * ver     修订日              作者           修订内容
 * 1.0     2019/1/10           沈磊           新规做成
 * </pre>
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getUserList(User user){
       return userDao.getUserList(user);
    }
}
