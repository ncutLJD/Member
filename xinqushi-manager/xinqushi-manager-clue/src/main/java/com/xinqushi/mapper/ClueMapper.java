package com.xinqushi.mapper;

import com.xinqushi.pojo.Clue;

public interface ClueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Clue record);

    int insertSelective(Clue record);

    Clue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Clue record);

    int updateByPrimaryKey(Clue record);
    
    Clue getExist(String queryString);
}