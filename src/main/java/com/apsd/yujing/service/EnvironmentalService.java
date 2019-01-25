package com.apsd.yujing.service;

import com.apsd.yujing.entiy.Environmental;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author 大稽
 * @date2019/1/2111:37
 */
public interface EnvironmentalService {
    List<Environmental> addEnvironmental(List<Environmental> environmentalList);
    Page<Environmental> getEnvironmentalList(Integer page,Integer size);
    void deleteEnvironmentalById(Integer id);
}
