package com.pingan.service;

import com.pingan.entity.Suggestion;

import java.util.List;
import java.util.Map;

/**
 * 客户建议或反馈Service接口
 */
public interface SuggestionService {

    /**
     * 根据条件分页查询
     *
     * @param map
     * @return
     */
    List<Suggestion> list(Map<String, Object> map);

    /**
     * 获取记录数
     *
     * @param map
     * @return
     */
    Long getCount(Map<String, Object> map);

    /**
     * 添加客户建议或反馈
     *
     * @param suggestion
     * @return
     */
    Integer add(Suggestion suggestion);

    /**
     * 修改客户建议或反馈
     *
     * @param suggestion
     * @return
     */
    Integer update(Suggestion suggestion);

    /**
     * 删除客户建议或反馈
     *
     * @param id
     * @return
     */
    Integer delete(Integer id);

    /**
     * 根据id查找客户建议或反馈
     *
     * @param id
     * @return
     */
    Suggestion findById(Integer id);

    /**
     * 根据客户id查找今日建议或反馈的记录数
     *
     * @param customerId
     * @return
     */
    Long getCountTodaySuggestion(Integer customerId);
}