package com.SpringBootWithUnderFlowContainer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller
{
@RequestMapping(value="/",method=RequestMethod.GET)

public String index(){
 return "Welcome index Page";   
}
}
