package com.runningsss.cloud.service;

import com.runningsss.cloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author liqings
 * @date 2019-02-28
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                Dept dept = new Dept();
                dept.setDeptno(id);
                dept.setDname("盖ID："+id+"没有对应信息");
                return dept;
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
