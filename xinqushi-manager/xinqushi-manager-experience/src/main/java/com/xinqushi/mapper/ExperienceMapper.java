package com.xinqushi.mapper;

import com.xinqushi.pojo.Experience;

public interface ExperienceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Experience record);

    int insertSelective(Experience record);

    Experience selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Experience record);

    int updateByPrimaryKey(Experience record);
    
    Experience getExist(String queryString);
}