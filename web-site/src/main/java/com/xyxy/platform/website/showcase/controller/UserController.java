package com.xyxy.platform.website.showcase.controller;

import com.google.common.collect.ImmutableList;
import com.xyxy.platform.common.web.bind.annotation.FormModel;
import com.xyxy.platform.website.showcase.entity.Dept;
import com.xyxy.platform.website.showcase.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

/**
 * Created by Caizhengda on 2015-11-03 16:24.
 */
@Controller
@RequestMapping(value = "showcase/user")
public class UserController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String indexView() {
        return "showcase/index";
    }

    @ResponseBody
    @RequestMapping(value = "/params", method = RequestMethod.GET)
    public Object paramBind(@FormModel("user") User user, @FormModel("dept")Dept dept) {
        return ImmutableList.of(user, dept);
    }

}
