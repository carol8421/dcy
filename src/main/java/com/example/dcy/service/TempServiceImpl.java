package com.example.dcy.service;

import com.example.dcy.domain.entity.Temp;
import com.example.dcy.domain.repository.TempMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TempServiceImpl implements TempService{

    @Autowired
    private TempMapper mapper;

    @Override
    public Temp getTemp(Integer id) {
        return mapper.findById(id);
    }

    @Override
    public Boolean insertTemp(Temp entity) {
        return mapper.insert(entity)>0;
    }

    @Override
    public Boolean updateTemp(Temp entity) {
        return mapper.update(entity.getContent(), entity.getId())>0;
    }
}
