package com.example.dcy.controller;

import com.example.dcy.domain.entity.*;
import com.example.dcy.service.CorpService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CorpController {

    @Autowired
    private CorpService service;

//    @RequestMapping(value = "/corp",method = RequestMethod.GET)
    @GetMapping(value = "/corpCmp")
    public CmpCompany getCmpByName(@RequestParam("corp_name") String corpName){

            TCorpCopy corp = service.getCorp(corpName);
            List<TCorpStock> stock = service.getStock(corpName);
            List<TCorpDist> dist = service.getDist(corpName);
            List<TCorpPertains> pertains = service.getPertains(corpName);
            return new CmpCompany(corp, dist, pertains, stock);
    }

    @GetMapping(value = "/corp")
    public List<TCorpCopy> getCompanyByName(@RequestParam("corp_name") String corpName){
        return service.getCompany(corpName);
    }
}
