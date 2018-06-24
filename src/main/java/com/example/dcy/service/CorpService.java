package com.example.dcy.service;

import com.example.dcy.domain.entity.*;

import java.util.List;

public interface CorpService {
    /**
     * 使用模糊匹配查寻公司所有信息corp
     * @param corpName
     * @return
     */
    public List<TCorpCopy> getCompany(String corpName);

    /**
     * 查询公司基本信息corp
     * @param corpName
     * @return
     */
    public TCorpCopy getCorp(String corpName);

    /**
     * 查询公司股东stock
     * @param corpName
     * @return
     */
    public List<TCorpStock> getStock(String corpName);

    /**
     * 查询公司子公司dist
     * @param corpName
     * @return
     */
    public List<TCorpDist> getDist(String corpName);

    /**
     * 查寻公司主要人员
     * @param corpName
     * @return
     */
    public List<TCorpPertains> getPertains(String corpName);
}
