package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.AuthzFunction;
import com.aiidc.sps.ep.utils.JasonMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface AuthzFunctionMapper extends JasonMapper<AuthzFunction> {
}