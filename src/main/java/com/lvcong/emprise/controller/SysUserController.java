package com.lvcong.emprise.controller;

import com.lvcong.emprise.bean.SysUser;
import com.lvcong.emprise.bean.SysUserExample;
import com.lvcong.emprise.service.SysUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 系统用户(SysUser)表控制层
 *
 * @author makejava
 * @since 2023-03-02 13:32:53
 */
@RestController
@RequestMapping("sysUser")
public class SysUserController {
    /**
     * 服务对象
     */
    @Resource
    private final SysUserService sysUserService;

    public SysUserController(SysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<SysUser> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.sysUserService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param sysUser 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<SysUser> add(SysUser sysUser) {
        return ResponseEntity.ok(this.sysUserService.insert(sysUser));
    }

    /**
     * 编辑数据
     *
     * @param sysUser 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<SysUser> edit(SysUser sysUser, SysUserExample sysUserExample) {
        return ResponseEntity.ok(this.sysUserService.update(sysUser,sysUserExample));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.sysUserService.deleteById(id));
    }

}

