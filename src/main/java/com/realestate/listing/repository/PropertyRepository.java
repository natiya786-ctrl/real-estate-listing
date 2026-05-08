package com.realestate.listing.repository;

import com.realestate.listing.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PropertyRepository extends JpaRepository<Property, Long> {

    List<Property> findByLocation(String location);
    List<Property> findByBhk(int bhk);
    List<Property> findByPriceBetween(int min, int max);
}