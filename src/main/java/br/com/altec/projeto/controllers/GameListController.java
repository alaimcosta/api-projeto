package br.com.altec.projeto.controllers;

import br.com.altec.projeto.dto.GameDTO;
import br.com.altec.projeto.dto.GameListDTO;
import br.com.altec.projeto.dto.GameMinDTO;
import br.com.altec.projeto.services.GameListService;
import br.com.altec.projeto.services.GameService;
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
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

}