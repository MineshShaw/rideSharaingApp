package com.minesh.rideSharingApp.repository;

import com.minesh.rideSharingApp.model.Ride;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RideRepository extends MongoRepository<Ride, String> {
}
