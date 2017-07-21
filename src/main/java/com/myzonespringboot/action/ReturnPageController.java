package com.myzonespringboot.action;

import com.myzonespringboot.model.Customer;
import com.myzonespringboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by 陈 on 2017/7/21.
 */
@Controller
public class ReturnPageController {
    @Autowired
    private IUserService userServiceImp;

    @Value("${userName}")
    private String userName;

    @Value("${bookTitle}")
    private String bookTitle;

    @GetMapping("/hi")
    public ModelAndView hi(ModelAndView modelAndView) {
        modelAndView.addObject("name", userName);
        modelAndView.addObject("bookTitle", bookTitle);
        modelAndView.setViewName("default");
        /*model.put("name", userName);
        model.put("bookTitle", bookTitle);*/
        // 加入一个属性，用来在模板中读取
        // return模板文件的名称，对应src/main/resources/templates/welcome.html
        return modelAndView;
    }

    @RequestMapping("/")
    public ModelAndView login(ModelAndView modelAndView) {
        modelAndView.addObject("result","xx");
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String test(Map<String, Object> model,HttpServletRequest request) {
        List<Customer> customerList=userServiceImp.findall();
        if (customerList!=null){
            model.put("basePath", request.getContextPath());
            model.put("customerList",customerList);
        }
        System.out.println(Integer.parseInt("1"));
        return "test";
    }
}
