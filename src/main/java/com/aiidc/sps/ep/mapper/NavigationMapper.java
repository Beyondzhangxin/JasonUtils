package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.Navigation;
import com.aiidc.sps.ep.util.JasonMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface NavigationMapper extends JasonMapper<Navigation> {
}