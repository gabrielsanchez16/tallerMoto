package com.taller.moto.service;

import com.taller.moto.models.Bike;
import com.taller.moto.models.Users;

public interface UserService {

    public void saveUsers(Users users);

    Users finByIdUsers(String document);

    public void saveBike(Bike bike, Users users);
}
