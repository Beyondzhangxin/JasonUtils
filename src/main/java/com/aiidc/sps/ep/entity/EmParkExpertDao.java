package com.aiidc.sps.ep.entity;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.aiidc.sps.ep.entity.EmParkExpert;

@Mapper
public interface EmParkExpertDao {
    int insert(@Param("pojo") EmParkExpert pojo);

    int insertSelective(@Param("pojo") EmParkExpert pojo);

    int insertList(@Param("pojos") List<EmParkExpert> pojo);

    int update(@Param("pojo") EmParkExpert pojo);
    int deleteByExpertId(@Param("expertId")String expertId);

     

}
