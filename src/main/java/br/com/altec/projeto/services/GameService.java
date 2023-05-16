package br.com.altec.projeto.services;

import br.com.altec.projeto.dto.GameDTO;
import br.com.altec.projeto.dto.GameMinDTO;
import br.com.altec.projeto.entities.Game;
import br.com.altec.projeto.projections.GameMinProjection;
import br.com.altec.projeto.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    //anotação de boas praticas
    @Transactional(readOnly = true)//não vou fazer operação de escrita
    public GameDTO findById(Long id){ //sugestão, fazer tratamento de excessões
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);

    }

    @Transactional(readOnly = true)//não vou fazer operação de escrita
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }


    @Transactional(readOnly = true)//não vou fazer operação de escrita
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(GameMinDTO::new).toList();
    }


}
