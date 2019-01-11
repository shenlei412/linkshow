package com.easylinkin.linkshow.sys.dao;

import com.easylinkin.linkshow.sys.entity.User;

import java.util.List;

/**
 * userDao
 * <p>
 * 功能:
 *
 * <pre>
 * ver     修订日              作者           修订内容
 * 1.0     2019/1/10           沈磊           新规做成
 * </pre>
 */
public interface UserDao {

    public List<User> getUserList(User user);
}
