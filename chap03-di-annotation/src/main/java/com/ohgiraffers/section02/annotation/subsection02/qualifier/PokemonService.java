package com.ohgiraffers.section02.annotation.subsection02.qualifier;

import com.ohgiraffers.section02.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("pokemonServiceQualifier")
public class PokemonService {

    /* 필드 주입 방식 */
    //@Autowired
   // @Qualifier("pikachu")
    private Pokemon pokemon;

    /* 생성자 주입 방식 */
    //생성자 주입의 경우 @Qualifier 어노테이션은 메소드의 파라미터 앞에 기재한다.
    @Autowired
    public PokemonService(@Qualifier("squirtle") Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void PokemonAttack() {
        pokemon.attack();
    }

}
