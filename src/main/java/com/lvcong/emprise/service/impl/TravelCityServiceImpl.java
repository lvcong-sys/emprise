package com.lvcong.emprise.service.impl;

import com.lvcong.emprise.bean.TravelCity;
import com.lvcong.emprise.mapper.TravelCityMapper;
import com.lvcong.emprise.service.TravelCityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (TravelCity)表服务实现类
 *
 * @author makejava
 * @since 2023-03-02 13:30:19
 */
@Service("travelCityService")
public class TravelCityServiceImpl implements TravelCityService {
  @Resource private final TravelCityMapper travelCityMapper;

  public TravelCityServiceImpl(TravelCityMapper travelCityMapper) {
    this.travelCityMapper = travelCityMapper;
  }

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  @Override
  public TravelCity queryById(Integer id) {
    return this.travelCityMapper.selectByPrimaryKey(id);
  }
}
