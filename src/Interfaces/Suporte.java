package Interfaces;

import Classes.Personagem;

public interface Suporte {
    /*
    * Descrição: Define uma habilidade de suporte para cura.
    * Somente o personagem Clérigo deve implementar essa interface, pois apenas ele tem o poder de cura.
    * */

    public void curar(Personagem aliado);
}
