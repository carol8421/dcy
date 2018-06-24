package com.example.dcy.domain.entity;


import java.util.List;

/**
 * 公司所有信息:公司基本信息/分公司/股东/主要人员
 */
public class CmpCompany {
    private TCorpCopy tCorpCopy;
    private List<TCorpDist> tCorpDist;
    private List<TCorpPertains> tCorpPertains;
    private List<TCorpStock> tCorpStock;

    public CmpCompany() {
    }

    public CmpCompany(TCorpCopy tCorpCopy, List<TCorpDist> tCorpDist, List<TCorpPertains> tCorpPertains, List<TCorpStock> tCorpStock) {
        this.tCorpCopy = tCorpCopy;
        this.tCorpDist = tCorpDist;
        this.tCorpPertains = tCorpPertains;
        this.tCorpStock = tCorpStock;
    }

    public TCorpCopy gettCorpCopy() {

        return tCorpCopy;
    }

    public void settCorpCopy(TCorpCopy tCorpCopy) {
        this.tCorpCopy = tCorpCopy;
    }

    public List<TCorpDist> gettCorpDist() {
        return tCorpDist;
    }

    public void settCorpDist(List<TCorpDist> tCorpDist) {
        this.tCorpDist = tCorpDist;
    }

    public List<TCorpPertains> gettCorpPertains() {
        return tCorpPertains;
    }

    public void settCorpPertains(List<TCorpPertains> tCorpPertains) {
        this.tCorpPertains = tCorpPertains;
    }

    public List<TCorpStock> gettCorpStock() {
        return tCorpStock;
    }

    public void settCorpStock(List<TCorpStock> tCorpStock) {
        this.tCorpStock = tCorpStock;
    }
}
