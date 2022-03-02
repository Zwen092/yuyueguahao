package com.atguigu.hospital.mapper;

import com.atguigu.hospital.model.Schedule;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ScheduleMapper extends BaseMapper<Schedule> {

    Schedule summitOrderForUpdate(@Param("scheduleId")String scheduleId);

}
