package com.msi.dslist.controllers;

import com.msi.dslist.dto.GameDTO;
import com.msi.dslist.dto.GameListDTO;
import com.msi.dslist.dto.GameMinDTO;
import com.msi.dslist.dto.ReplacementDTO;
import com.msi.dslist.services.GameListService;
import com.msi.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByGameList(@PathVariable Long listId){
        return gameService.findByGameList(listId);
    }

    @PostMapping(value = "/{listId}/replacement")
    public void moveGameInList(@PathVariable Long listId, @RequestBody ReplacementDTO body){
        gameListService.moveGameList(listId, body.getSourceIndex(), body.getDestinationIndex());

    }
}
