package com.anmol.structural.proxy.user;

public interface UserService {
    public void getUser(User caller, User target);

    public void deleteUser(User caller, User target);
}
