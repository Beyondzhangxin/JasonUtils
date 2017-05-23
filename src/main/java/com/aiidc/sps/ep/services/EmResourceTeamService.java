package com.aiidc.sps.ep.services;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.aiidc.sps.ep.entity.EmResourceTeam;
import com.aiidc.sps.ep.mapper.EmResourceTeamMapper;

@Service
public class EmResourceTeamService{

    @Resource
    private EmResourceTeamMapper emResourceTeamMapper;

    public int insert(EmResourceTeam pojo){
        return emResourceTeamMapper.insert(pojo);
    }

    public int insertSelective(EmResourceTeam pojo){
        return emResourceTeamMapper.insertSelective(pojo);
    }

    public int insertList(List<EmResourceTeam> pojos){
        return emResourceTeamMapper.insertList(pojos);
    }

    public int update(EmResourceTeam pojo){
        return emResourceTeamMapper.update(pojo);
    }
}
