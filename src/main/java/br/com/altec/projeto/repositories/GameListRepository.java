package br.com.altec.projeto.repositories;

import br.com.altec.projeto.entities.Game;
import br.com.altec.projeto.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
