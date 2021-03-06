package br.edu.utfpr.dv.sireata.view;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;

import br.edu.utfpr.dv.sireata.bo.CampusBO;
import br.edu.utfpr.dv.sireata.model.Campus;
import br.edu.utfpr.dv.sireata.window.EditarCampusWindow;
import br.edu.utfpr.dv.sireata.view.strategy;
public class CampusView extends ListView implements CrudView <CampusView>{
	
	public static final String NAME = "campus";
	CrudView crud = new CrudView();
	public CampusView(){
		this.setFiltrosVisiveis(false);
		this.setBotaoExcluirVisivel(false);
	}

	@Override
	protected void carregarGrid() {
		this.getGrid().addColumn("Nome", String.class);
		this.getGrid().addColumn("Ativo", String.class);
		
		this.getGrid().getColumns().get(1).setWidth(100);
		
		try{
			CampusBO bo = new CampusBO();
			List<Campus> list = bo.listarTodos(false);
			
			for(Campus c : list){
				Object itemId = this.getGrid().addRow(c.getNome(), (c.isAtivo() ? "Sim" : "Não"));
				crud.adicionarGridId(itemId, c.getIdCampus());
			}
		}catch(Exception e){
			Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);
			
			Notification.show("Listar Câmpus", e.getMessage(), Notification.Type.ERROR_MESSAGE);
		}
	}

	@Override
	public int adicionar(int id) throws Exception{
		UI.getCurrent().addWindow(new EditarCampusWindow(id, this));
		
	}

	@Override
	public void editar(Object id) {
		try{
			CampusBO bo = new CampusBO();
			Campus campus = bo.buscarPorId((int)id);
			
			UI.getCurrent().addWindow(new EditarCampusWindow(campus, this));
		}catch(Exception e){
			Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);
			
			Notification.show("Editar Câmpus", e.getMessage(), Notification.Type.ERROR_MESSAGE);
		}
	}

	@Override
	public void excluir(Object id)throws Exception{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void filtrar() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
