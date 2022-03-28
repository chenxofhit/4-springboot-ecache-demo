package com.hnust.controller.web;

import com.hnust.controller.vo.R;
import com.hnust.controller.vo.Res;
import com.hnust.entity.User;
import com.hnust.service.UserService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public R getById(@RequestParam("id") String id) {
        return R.OK(service.getById(id));
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public R getAll() {
        // Wrapper<User> wr = Condition.create();
        Wrapper<User> wr = new EntityWrapper<>();
        return R.OK(service.selectList(wr));
    }

    @RequestMapping(value = "/delById", method = RequestMethod.DELETE)
    public R delById(@RequestParam("id") String id) {
        return R.OK(service.delById(id));
    }

    @RequestMapping(value = "/insertOne", method = RequestMethod.POST)
    public R insertOne(@RequestBody User user) {
        return R.OK(service.insert(user));
    }

    @RequestMapping(value = "/updateOne", method = RequestMethod.PUT)
    public R updateOne(@RequestBody User user) {
        if (service.selectById(user.getId()) == null) {
            return R.ERROR(Res.USER_NOT_EXISTS);
        }
        service.updateOne(user);
        return R.OK("更新成功！");
    }

}
