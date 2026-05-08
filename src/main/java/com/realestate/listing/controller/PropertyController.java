package com.realestate.listing.controller;

import com.realestate.listing.model.Property;
import com.realestate.listing.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/properties")
public class PropertyController {

    @Autowired
    private PropertyService service;

    @PostMapping
    public Property add(@RequestBody Property property) {
        return service.add(property);
    }

    @GetMapping
    public List<Property> getAll() {
        return service.getAll();
    }

    @GetMapping("/location/{loc}")
    public List<Property> byLocation(@PathVariable String loc) {
        return service.byLocation(loc);
    }

    @GetMapping("/bhk/{bhk}")
    public List<Property> byBhk(@PathVariable int bhk) {
        return service.byBhk(bhk);
    }

    @GetMapping("/price")
    public List<Property> byPrice(@RequestParam int min,
                                  @RequestParam int max) {
        return service.byPrice(min, max);
    }
}