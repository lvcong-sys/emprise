package com.lvcong.emprise.controller;


import com.lvcong.emprise.bean.TravelScenic;
import com.lvcong.emprise.bean.TravelScenicExample;
import com.lvcong.emprise.bean.TravelScenicKey;
import com.lvcong.emprise.service.TravelScenicService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TravelScenic)表控制层
 *
 * @author makejava
 * @since 2023-03-02 13:30:19
 */
@RestController
@RequestMapping("travelScenic")
public class TravelScenicController {
    /**
     * 服务对象
     */
    @Resource
    private TravelScenicService travelScenicService;

    /**
     * 分页查询
     *
     * @param travelScenic 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TravelScenic>> queryByPage(TravelScenicExample travelScenic, PageRequest pageRequest) {
        return ResponseEntity.ok(this.travelScenicService.queryByPage(travelScenic, pageRequest));
    }

  /**
   * 通过主键查询单条数据
   *
   * @param id 主键
   * @return 单条数据
   */
  @GetMapping("{id}")
  public ResponseEntity<TravelScenic> queryById(@PathVariable("id")TravelScenicKey id) {
    return ResponseEntity.ok(this.travelScenicService.queryById(id));
    }
}

