package br.com.altec.projeto.services;

import br.com.altec.projeto.dto.GameListDTO;
import br.com.altec.projeto.dto.GameMinDTO;
import br.com.altec.projeto.entities.Game;
import br.com.altec.projeto.entities.GameList;
import br.com.altec.projeto.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    //anotação de boas praticas
    @Transactional(readOnly = true)//não vou fazer operação de escrita
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }



}
