/**
 * @Author mlsong
 * @Date 2019/9/12 0012
 * @Description
 */
package com.itek.teaching.management.controller;

import com.itek.teaching.management.commons.WebApiResult;
import com.itek.teaching.management.dao.ScheduleMapper;
import com.itek.teaching.management.domain.Schedule;
import com.itek.teaching.management.domain.ScheduleExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: teaching-management
 * @description: 日程安排控制器
 * @author: mlsong
 * @create: 2019-09-12 14:46
 *
 **/
@RestController
@RequestMapping("schedule")
@Transactional(rollbackFor = Exception.class)
public class ScheduleController {
    private Logger logger = LoggerFactory.getLogger(getClass());


    @Autowired
    private ScheduleMapper scheduleMapper;

    @RequestMapping("add")
    public WebApiResult addSchedule(Schedule schedule) {
        logger.debug(schedule.toString());
        scheduleMapper.insert(schedule);

//        if (schedule != null) {
//            throw new RuntimeException("我异常了...");
//        }
        scheduleMapper.insert(schedule);

        WebApiResult result = new WebApiResult();
        result.setData(schedule.getId());
        return result;
    }

    @RequestMapping("get")
    public WebApiResult getSchedules(Schedule schedule) {
        logger.debug(schedule.toString());
        ScheduleExample example = new ScheduleExample();
        example.createCriteria()
                .andStartGreaterThanOrEqualTo(schedule.getStart())
                .andEndLessThanOrEqualTo(schedule.getEnd());
        List<Schedule> scheduleList = scheduleMapper.selectByExample(example);

        WebApiResult result = new WebApiResult();
        result.setData(scheduleList);
        return result;
    }

    @RequestMapping("modify")
    public WebApiResult modifyScheduel(Schedule schedule) {
        logger.debug(schedule.toString());
        scheduleMapper.updateByPrimaryKeySelective(schedule);

        return new WebApiResult();
    }

    @RequestMapping("delete/{id}")
    public WebApiResult modifyScheduel(@PathVariable int id) {
        logger.debug(id + "");
        scheduleMapper.deleteByPrimaryKey(id);
        return new WebApiResult();
    }
}
