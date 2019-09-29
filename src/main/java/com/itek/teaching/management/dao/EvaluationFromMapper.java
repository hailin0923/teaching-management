package com.itek.teaching.management.dao;

import com.itek.teaching.management.domain.EvaluationForm;
import org.springframework.stereotype.Repository;

import java.util.List;
//import java.util.Map;

@Repository
public interface EvaluationFromMapper {

    /**
     * 查询所有的有效问卷题目的结果
     */
    List<EvaluationForm> findAllPro();

    /**
     * 查询的总条数
     */
    Integer countNo();
}
