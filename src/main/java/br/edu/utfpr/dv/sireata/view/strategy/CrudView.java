package br.edu.utfpr.dv.sireata.view;

import java.lang.Exception;
public abstract class CrudView <Ajuda> {

    public int adicionar(Ajuda ajuda) throws Exception;
    public int enter(Ajuda ajuda) throws Exception;
    public int excluir(Ajuda ajuda) throws Exception;
}