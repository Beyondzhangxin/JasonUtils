package com.aiidc.sps.ep.entity;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.aiidc.sps.ep.entity.EmParkExpert;
import com.aiidc.sps.ep.entity.EmParkExpertDao;

@Service
public class EmParkExpertService{

    @Resource
    private EmParkExpertDao emParkExpertDao;

    public int insert(EmParkExpert pojo){
        return emParkExpertDao.insert(pojo);
    }

    public int insertSelective(EmParkExpert pojo){
        return emParkExpertDao.insertSelective(pojo);
    }

    public int insertList(List<EmParkExpert> pojos){
        return emParkExpertDao.insertList(pojos);
    }

    public int update(EmParkExpert pojo){
        return emParkExpertDao.update(pojo);
    }
}
