package com.itek.teaching.management.controller;

import com.itek.teaching.management.dao.EvaluationFromMapper;
import com.itek.teaching.management.domain.EvaluationForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName EvaluationFromController
 * @description TODO
 * @author 侯少友
 * @date 2019年09月23日 17:18
 * @modifier 侯少友
 * @date 2019年09月23日 17:18
 * @Version V1.0
 */
@RestController
@RequestMapping("evaluationFrom")
@Transactional(rollbackFor = Exception.class)
public class EvaluationFromController {
    /**
     * 日志
     */
    private final Logger logger = LoggerFactory.getLogger(EvaluationFromController.class);

    @Autowired
    private EvaluationFromMapper evaluationFromMapper;

    /**
     * @Title findAllPro
     * @description 初始化加载评价页面的评价题目
     * @author 侯少友
     * @date 2019年09月24日 11:12
     * @return void
     * @throws
     */
    @RequestMapping(value = "initEvaluation")
    @ResponseBody
    public Map<String, Object> findAllPro() {
        logger.info("op=start_findAllPro, 获取评分题");
        // 获取题目
        List<EvaluationForm> evaluations = evaluationFromMapper.findAllPro();
        // 获取总数
        int totalProNo = evaluationFromMapper.countNo();
        Map<String, Object> proMap = new HashMap<>();
        proMap.put("evaluations", evaluations);
        proMap.put("totalProNo", totalProNo);
        return proMap;
    }

    /**
     * @Title saveEvalMsg
     * @description 保存学生提交的评价信息
     * @author 侯少友
     * @date 2019年09月25日 14:47
     * @return java.util.Map<java.lang.String , java.lang.Object>
     * @throws
     */
    @RequestMapping(value = "saveEvalMsg", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> saveEvalMsg(String formData, HttpRequest request) {
        logger.info("op=start_saveEvalMsg, ", "初始化保存用户评价内容");
        Map<String, Object> evalMsgMap = new HashMap<>();
//        request.getParamer("formData");
        evalMsgMap.put("eval", 222);
        System.out.println("信息：" + formData);
        return evalMsgMap;
    }
}
