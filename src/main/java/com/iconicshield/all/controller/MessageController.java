package com.iconicshield.all.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/messages")
public class MessageController {

    @RequestMapping("/send")
    public ResponseEntity<String> message(){

        return new ResponseEntity<>("Message sent", HttpStatus.OK);
    }
}
