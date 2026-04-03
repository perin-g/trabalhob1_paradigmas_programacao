package Interfaces;

import Classes.Personagem;

public interface Especial {

    /*
    * Descrição: Cada classe que implementar esta interface deverá definir sua habilidade especial ofensiva,
    * consumindo recursos e causando dano conforme regras específicas.
    * */
    public void usarHabilidadeEspecial(Personagem alvo);
}
