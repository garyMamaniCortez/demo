package org.scesi.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.scesi.demo.clases.C_map;
import org.scesi.demo.repository.C_mapRepository;
import org.scesi.demo.daos.C_mapDAO;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class C_mapService{
    @Autowired
    private C_mapRepository mapRepository;

    public Schedule addMap(C_mapDAO mapDAO) {
        C_map map=new C_map();
        map.setUbication(mapDAO.getUbication);
        map.setDestiny(mapDAO.getDestiny);
        map.setCod_map(mapDAO.getCod_map);
        C_map newmap=mapRepository.save(map);

        return newmap;
    }
}