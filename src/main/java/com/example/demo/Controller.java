package com.example.demo;


import com.example.demo.core.models.Accounts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;



/*
*
* users
 -- >accoount  -- [balance, (deposit, withdrawl)]
accoount -> transactions [debit, credit, amount, timestap, tags/descriptions]

search[from, toDate] --

*
*
* */

///https://www.springboottutorial.com/creating-web-application-with-spring-boot

/// https://github.com/YogenRaii/spring-examples/tree/master/spring-boot-jsp
@org.springframework.stereotype.Controller
public class Controller {


    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AppService appService;

    // /kk/welcome


    @RequestMapping("/")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @RequestMapping("/next")

    public String next(Map<String, Object> model) {

        ///dasdas.classd (dasd,dasdas) []
        model.put("message", "You are in new page !!");

        return "next";
    }


    @RequestMapping("/{userId}/my-accounts")  //1/my-accounts/

    public String myAccounts(Map<String, Object> model, @PathVariable("userId") Integer userId) {

        List<Accounts>  accoountList =  appService.getMyAccounts(userId);

        logger.info("acc {}, {}",accoountList.size(),accoountList);
        model.put("accounts",accoountList);

        return "myAccounts";
    }



    // todo: > service method --->> 1, update, 2,get, validations(baclnce) db connections (CRUD)



    ///

}
