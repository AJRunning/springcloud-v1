package com.runningsss.cloud.controller;

import com.runningsss.cloud.entities.Dept;
import com.runningsss.cloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author liqings
 * @date 2019-02-20
 */
@RestController
public class DeptController {

    @Autowired
    public DeptClientService service = null;

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return this.service.add(dept);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.service.get(id);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return this.service.list();
    }
}
