package org.registry.service.impl;
import com.newfeelings.common.service.ProductService;
import org.apache.dubbo.config.annotation.Service;

@Service
@org.springframework.stereotype.Service
public class ProductServiceImpl implements ProductService {


    public String selectById() {
        return "registry:test";
    }

}
