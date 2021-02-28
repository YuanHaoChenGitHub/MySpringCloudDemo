package com.demo.springcloud.controller;

import ResultMapUtil.R;
import com.demo.springcloud.entity.Payment;
import com.demo.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * test
 * payment表(Payment)表控制层
 *
 * @author makejava
 * @since 2021-02-28 18:33:02
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    /**
     * 服务对象
     */
    @Resource
    private PaymentService paymentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne/{id}")
    public R selectOne(@PathVariable("id")  Long id) {

        return R.ok(paymentService.queryById(id));
    }

}
