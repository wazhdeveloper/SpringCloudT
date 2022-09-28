package com.atguigu.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

import java.util.UUID;

/**
 * @author wzhstart
 * @creat 2022-09-27-18:59
 */
public class HandleException {
    public CommonResult handleException(BlockException blockException) {
        return new CommonResult(4444, "处理BlockException，" + UUID.randomUUID());
    }
}
