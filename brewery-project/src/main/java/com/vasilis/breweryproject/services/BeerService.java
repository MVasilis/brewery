package com.vasilis.breweryproject.services;

import com.vasilis.breweryproject.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
