package br.com.altec.projeto.controllers;

import br.com.altec.projeto.dto.GameMinDTO;
import br.com.altec.projeto.entities.Game;
import br.com.altec.projeto.repositories.GameRepository;
import br.com.altec.projeto.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }

}
