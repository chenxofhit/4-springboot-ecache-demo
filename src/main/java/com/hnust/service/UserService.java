package com.hnust.service;

import com.hnust.entity.User;
import com.baomidou.mybatisplus.service.IService;

public interface UserService extends IService<User> {

    public User getById(String id);

    public boolean delById(String id);

    public User updateOne(User user);
}
