package com.it.ssm.controller;

import com.it.ssm.domain.product;
import com.it.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.security.RolesAllowed;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/product")

public class ProductController {
    @Autowired
    private IProductService productService;

//    @InitBinder
//    public void initBinder(WebDataBinder binder){
//        binder.registerCustomEditor(Date.class,new DateStringEditor());
//
//    }

    //产品添加
    @RequestMapping("/save.do")
    public String save(product product) throws Exception {
        productService.save(product);
        return "redirect:findAll.do";

    }

    //查询全部产品
    @RequestMapping("/findAll.do")
    @RolesAllowed("ADMIN")

    public ModelAndView findAll() throws Exception {

        ModelAndView mv=new ModelAndView();
        List<product> ps=productService.findAll();

        mv.addObject("productList",ps);
        mv.setViewName("product-list1");
        return mv;
    }


}
