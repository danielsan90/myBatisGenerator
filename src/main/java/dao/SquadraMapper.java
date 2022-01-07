package main.java.dao;

import java.util.List;
import main.java.model.Squadra;
import main.java.model.SquadraExample;
import org.apache.ibatis.annotations.Param;

public interface SquadraMapper {
    long countByExample(SquadraExample example);

    int deleteByExample(SquadraExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Squadra record);

    int insertSelective(Squadra record);

    List<Squadra> selectByExample(SquadraExample example);

    Squadra selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Squadra record, @Param("example") SquadraExample example);

    int updateByExample(@Param("record") Squadra record, @Param("example") SquadraExample example);

    int updateByPrimaryKeySelective(Squadra record);

    int updateByPrimaryKey(Squadra record);
}