package com.bitacademy.datadust.web;


import com.bitacademy.datadust.ssg.entity.SeachItemEntity;
import com.bitacademy.datadust.ssg.entity.SearchItemRepository;
import lombok.Data;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Data
@RestController
public class SearchItemController {

    @Autowired
    private SearchItemRepository searchItemRepository;


    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String isRunning() {
        return "I'm Alive!";
    }

    //Read
    @GetMapping(value = "/home")
    public Iterable<SeachItemEntity> list(){
        return searchItemRepository.findAll();
    }

    //json read
    @GetMapping(value = "/getJsonList" , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<SeachItemEntity>> Get_Json(){
        return new ResponseEntity<>(searchItemRepository.findAll(), HttpStatus.OK);
    }



}
