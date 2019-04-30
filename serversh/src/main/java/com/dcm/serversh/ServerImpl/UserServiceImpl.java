package com.dcm.serversh.ServerImpl;

import com.dcm.serversh.Dao.UserMapper;
import com.dcm.serversh.Model.User;
import com.dcm.serversh.Server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int addUser(User user) {

        userMapper.insert(user);
        return 0;
    }
}
