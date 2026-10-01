package com.anmol.structural.proxy.proxy;

import com.anmol.structural.proxy.user.User;
import com.anmol.structural.proxy.user.UserRole;
import com.anmol.structural.proxy.user.UserService;

public class UserServiceProxy implements UserService {
    UserService userservice;

    public UserServiceProxy(UserService userService) {
        this.userservice = userService;
    }

    @Override
    public void getUser(User caller, User target) {
        // Allow all roles to get employee info
        userservice.getUser(caller, target);
    }

    @Override
    public void deleteUser(User caller, User target) {
        if (caller.getRole() == UserRole.ADMIN || caller.getName().equals(target.getName())) {
            userservice.deleteUser(caller, target);
        } else {
            System.out.println(caller.getName() + " is not authorized to delete user: " + target.getName());
        }
    }
}
