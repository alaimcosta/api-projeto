package br.com.altec.projeto.dto;

import br.com.altec.projeto.entities.GameList;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(){

    }

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }



}
