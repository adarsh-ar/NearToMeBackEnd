package com.neartome.location.service;

import com.neartome.location.dao.StateDao;
import com.neartome.location.model.entity.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    @Autowired
    StateDao stateDao;
    public List<State> getAllStates() {
        return stateDao.findAll();
    }
}
