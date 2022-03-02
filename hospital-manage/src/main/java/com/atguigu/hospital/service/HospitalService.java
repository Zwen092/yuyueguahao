package com.atguigu.hospital.service;

import com.atguigu.hospital.model.Schedule;

import java.io.IOException;
import java.util.Map;

public interface HospitalService {

    /**
     * 预约下单
     * @param paramMap
     * @return
     */
    Map<String, Object> submitOrder(Map<String, Object> paramMap);

    int submitOrder(String scheduleId);

    Schedule summitOrderForUpdate(String scheduleId);

    /**
     * 更新支付状态
     * @param paramMap
     */
    void updatePayStatus(Map<String, Object> paramMap);

    /**
     * 更新取消预约状态
     * @param paramMap
     */
    void updateCancelStatus(Map<String, Object> paramMap);


}