package com.bitacademy.datadust.controller;


import com.bitacademy.datadust.repositroy.ResultItemRepository;
import com.bitacademy.datadust.ssg.model.ResultItemEntity;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RequestMapping("/re")
@RestController
@AllArgsConstructor
public class ResultItemController {

    private ResultItemRepository resultItemRepository;

    @RequestMapping("/find")
    @ResponseBody
    public Optional<ResultItemEntity> getList() {
        Optional<ResultItemEntity> result = resultItemRepository.findById(5L);

        return result;
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<Optional<ResultItemEntity>> GetFindlist() {
        List<Optional<ResultItemEntity>> findList = new ArrayList<>();
        for (int i = 1; i < 11; i++) {

            Optional<ResultItemEntity> item = resultItemRepository.findById((long) i);
            findList.add(item);
        }
        return findList;
    }


}
