package com.example.dcy.domain.repository;

import com.example.dcy.domain.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CorpMapper {

//    select * from t_corp where corp_name like concat('%',#{corp_name},'%')
    @Select("select * from t_corp where corp_name = #{corp_name}")  //使用concat函数解决添加'%'报错问题,或者先对参数添加%处理再将值传给mybatis
    TCorpCopy findCorpByCorpName(@Param("corp_name") String corpName);

    @Select("select * from t_corp_stock where s_id in (" +
            "select s_id from t_m_corp_corp_stock where e_id in (" +
            "select e_id from t_corp where corp_name = #{corp_name}))")
    List<TCorpStock> findStockByCorpName(@Param("corp_name") String corpName);

    @Select("select * from t_corp_dist where d_id in (" +
            "select d_id from t_m_corp_corp_dist where e_id in (" +
            "select e_id from t_corp where corp_name = #{corp_name}))")
    List<TCorpDist> findDistByCorpName(@Param("corp_name") String corpName);

    @Select("select * from t_corp_pertains where p_id in (" +
            "select p_id from t_m_corp_corp_pertains where e_id in (" +
            "select e_id from t_corp where corp_name = #{corp_name}))")
    List<TCorpPertains> findPertainsByCorpName(@Param("corp_name") String corpName);

    @Select("select * from t_corp where corp_name like concat('%',#{corp_name},'%')")
    List<TCorpCopy> findByCorpName(@Param("corp_name") String corpName);
}
