package com.taller.moto.service.serviceImp;

import org.springframework.stereotype.Service;

import com.taller.moto.models.Bike;
import com.taller.moto.repository.BikeRepository;
import com.taller.moto.service.BikeService;

@Service
public class BikeServiceImp implements BikeService {

    private final BikeRepository bikeRepository;

    public BikeServiceImp(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    @Override
    public void addBike(Bike bike) {

        bikeRepository.save(bike);
    }

}
