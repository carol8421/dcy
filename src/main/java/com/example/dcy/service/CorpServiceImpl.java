package com.example.dcy.service;

import com.example.dcy.domain.entity.*;
import com.example.dcy.domain.repository.CorpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorpServiceImpl implements CorpService{

    @Autowired
    private CorpMapper mapper;

    @Override
    public List<TCorpCopy> getCompany(String corpName) {
        return mapper.findByCorpName(corpName);
    }

    @Override
    public TCorpCopy getCorp(String corpName) {
        return mapper.findCorpByCorpName(corpName);
    }

    @Override
    public List<TCorpStock> getStock(String corpName) {
        return mapper.findStockByCorpName(corpName);
    }

    @Override
    public List<TCorpDist> getDist(String corpName) {
        return mapper.findDistByCorpName(corpName);
    }

    @Override
    public List<TCorpPertains> getPertains(String corpName) {
        return mapper.findPertainsByCorpName(corpName);
    }
}
