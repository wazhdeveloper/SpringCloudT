package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wzhstart
 * @creat 2022-09-15-9:14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {

    private Integer code; // 状态码
    private String  message; // 相关信息
    private T       data; // 数据

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
