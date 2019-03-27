package com.hwua.controller;

import com.hwua.entity.Address;
import com.hwua.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService addressService;


    @RequestMapping("/query")
    public String query(){
        return "forward:/WEB-INF/view/address.jsp";
    }




    @RequestMapping(value ="/inset",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String inset(HttpSession session,String as_details,String as_phone){
        int user_id = (int)session.getAttribute("user_id");
        System.out.println(user_id);
        Address address = new Address(null,user_id,as_details,as_phone);
        return addressService.insert(address);
    }

}
