package com.realestate.listing.service;

import com.realestate.listing.model.Property;
import com.realestate.listing.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepository repo;

    public Property add(Property property) {
        return repo.save(property);
    }

    public List<Property> getAll() {
        return repo.findAll();
    }

    public List<Property> byLocation(String location) {
        return repo.findByLocation(location);
    }

    public List<Property> byBhk(int bhk) {
        return repo.findByBhk(bhk);
    }

    public List<Property> byPrice(int min, int max) {
        return repo.findByPriceBetween(min, max);
    }
}