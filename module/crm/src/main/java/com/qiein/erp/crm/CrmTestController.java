package com.qiein.erp.crm;

import com.qiein.erp.common.StrUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CrmTestController {

    @RequestMapping("/")
    public String hello(){
        return StrUtil.test1();
    }
}
