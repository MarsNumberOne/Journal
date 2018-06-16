package com.mach.journal.dao.mapper;


import com.mach.journal.dao.bean.Users;

import java.util.List;

/**
 * DESCRIPTION:
 * Create on:2018/3/7.
 *
 * @author MACHUNHUI
 */
public interface UsersDao {
    Users getUsersByUsername(String username);

    List<Users> selectAllUsers();

    List<Users> getUsersByUsername2();
}
