package com.hnust.service.impl;

import com.hnust.entity.User;
import com.hnust.mapper.UserMapper;
import com.hnust.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
// @CacheConfig(cacheNames = "user")  // 该注解在类上使用，用来描述该类中所有方法使用的缓存名称，当然也可以不使用该注解，直接在具体的缓存注解上配置名称，指定了该值，则无需指定该类下的缓存注解中的value值
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    @Cacheable(value = "user", key = "#id")
    public User getById(String id) {
        return userMapper.selectById(id);
    }

    @Override
    @CacheEvict(value = "user", key = "#id")
    public boolean delById(String id) {
        Integer delBool = userMapper.deleteById(id);
        if (delBool > 0) return true;
        return false;
    }

    /**
     * 这个返回值必须是User，如果为void，将会把缓存清空，导致缓存时间内查不到数据
     */
    @Override
    @CachePut(value = "user", key = "#user.id")
    public User updateOne(User user) {
        userMapper.updateById(user);
        return userMapper.selectById(user);
    }
}
