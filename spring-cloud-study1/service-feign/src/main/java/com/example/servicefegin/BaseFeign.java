package com.example.servicefegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-ribbon")
public interface BaseFeign {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String hi(@RequestParam(value = "name") String name);

}
