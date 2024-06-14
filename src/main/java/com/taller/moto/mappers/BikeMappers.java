package com.taller.moto.mappers;

import org.mapstruct.Mapper;

import com.taller.moto.dto.BikeDto;
import com.taller.moto.models.Bike;

@Mapper(componentModel = "spring")
public interface BikeMappers {

    Bike toBike(BikeDto bikeDto);

    BikeDto toBikeDto(Bike bike);

}
