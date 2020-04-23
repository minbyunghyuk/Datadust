package com.bitacademy.datadust.controller;


import com.bitacademy.datadust.ssg.model.SeachItemEntity;
import com.bitacademy.datadust.repositroy.SearchItemRepository;
import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

@Data
@RestController
@AllArgsConstructor
public class SearchItemController {

    //@Autowired
    private SearchItemRepository searchItemRepository;

    //초기화면테스트
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
//    @GetMapping(value = "/getJsonList" , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    public ResponseEntity<List<SeachItemEntity>> Get_Json(){
//        List<SeachItemEntity> seachItemEntities = searchItemRepository.findAll();
//        return new ResponseEntity<>(seachItemEntities, HttpStatus.OK);
//    }
    @GetMapping(value = "/getlist")
    public  List<SeachItemEntity> getSample(){
        return searchItemRepository.findAll();
    }


    //어노테이션은 함수명에넣지않고 위에 따로각자선언해주기
    //@ResponseBody jsp와 같은 뷰로전달하는게아닌 데이터자체를 전달함
    //@PathVariable URL경로에있는 값을 파라미터로 추출
    @RequestMapping(value = "/list", method = RequestMethod.GET ,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public List<SeachItemEntity> demoJpaList() {
        return searchItemRepository.findAll();
    }




    @RequestMapping(value = "/getid", method= RequestMethod.GET)
    public @ResponseBody
    Optional<SeachItemEntity> getitem(){
        return  searchItemRepository.findById(1L);
    }


}
