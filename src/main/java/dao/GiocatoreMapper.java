package main.java.dao;

import java.util.List;
import main.java.model.Giocatore;
import main.java.model.GiocatoreExample;
import org.apache.ibatis.annotations.Param;

public interface GiocatoreMapper {
    long countByExample(GiocatoreExample example);

    int deleteByExample(GiocatoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Giocatore record);

    int insertSelective(Giocatore record);

    List<Giocatore> selectByExample(GiocatoreExample example);

    Giocatore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Giocatore record, @Param("example") GiocatoreExample example);

    int updateByExample(@Param("record") Giocatore record, @Param("example") GiocatoreExample example);

    int updateByPrimaryKeySelective(Giocatore record);

    int updateByPrimaryKey(Giocatore record);
}