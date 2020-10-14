package br.edu.utfpr.dv.sireata.view;

import java.lang.Exception;
public abstract class CrudView <Ajuda> {

    public int adicionar(int  id) throws Exception;
    public void enter(Ajuda ajuda) throws Exception;
    public void excluir(Ajuda ajuda) throws Exception;

}