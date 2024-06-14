package com.taller.moto.service.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.taller.moto.models.Bike;
import com.taller.moto.models.Users;
import com.taller.moto.repository.BikeRepository;
import com.taller.moto.repository.UserRepository;
import com.taller.moto.service.UserService;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    private final BikeRepository bikeRepository;

    public UserServiceImp(UserRepository userRepository, BikeRepository bikeRepository) {
        this.userRepository = userRepository;
        this.bikeRepository = bikeRepository;
    }

    @Override
    public void saveUsers(Users users) {
        userRepository.save(users);
    }

    @Override
    public Users finByIdUsers(String document) {

        return userRepository.findByDocument(document);

    }

    @Override
    public void saveBike(Bike bike, Users users) {

        List<Bike> bikes = new ArrayList<>();

        bikes.add(bike);

        users.setBike(bikes);

        bike.setUser(users);

        bikeRepository.save(bike);

    }

}
