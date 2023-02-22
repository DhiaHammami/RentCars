package com.RentCars.RentCars.persistances.repositories;

import com.RentCars.RentCars.entities.Car;
import com.RentCars.RentCars.entities.Request;
import com.RentCars.RentCars.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {

    List<Request> findByUser(User user);

    List<Request> findByCar(Car car);

    List<Request> findByStatus(String status);

}