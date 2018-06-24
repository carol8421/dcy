package com.example.dcy.service;

import com.example.dcy.domain.entity.Temp;

public interface TempService {
    public Temp getTemp(Integer id);
    public Boolean insertTemp(Temp entity);
    public Boolean updateTemp(Temp entity);
}