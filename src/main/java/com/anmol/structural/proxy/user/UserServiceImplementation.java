package com.anmol.structural.proxy.user;

public class UserServiceImplementation implements UserService {

    @Override
    public void getUser(User caller, User target) {
        System.out.println(caller.getName() + " fetched user details for: " + target.getName());
    }

    @Override
    public void deleteUser(User caller, User target) {
        System.out.println(caller.getName() + " deleted user: " + target.getName());
    }
}
