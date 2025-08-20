package com.msi.dslist.controllers;

import com.msi.dslist.dto.GameDTO;
import com.msi.dslist.dto.GameListDTO;
import com.msi.dslist.dto.GameMinDTO;
import com.msi.dslist.services.GameListService;
import com.msi.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }
}
