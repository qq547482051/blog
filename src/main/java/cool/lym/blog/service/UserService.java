package cool.lym.blog.service;

import cool.lym.blog.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
