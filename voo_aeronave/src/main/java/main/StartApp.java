package main;

import java.util.Date;

import dao.AeronaveDAO;
import dao.VooDAO;
import model.Aeronave;
import model.Voo;

public class StartApp {

	public static void main(String[] args) {
		executeVoo();
	}

	public static void executeVoo() {
		//insert
		Voo voo = new Voo();
		VooDAO vooDao = new VooDAO();
		Aeronave aeronave = new Aeronave();
//		aeronave.setId_aeronave(2);
//		voo.setData_voo(new Date());
//		voo.setDestino("pouso alegre");
//		voo.setRota("sla oq");
//		voo.setId_aeronave(aeronave);
//		vooDao.insertNewVoo(voo);
		
		//select
//		vooDao.getAllVoos();
		
		//delete
//		vooDao.deleteVoo(2);
		
		//update
//		Aeronave aeronave = new Aeronave();
//		aeronave.setId_aeronave(2);
//		voo.setId_voo(1);
//		voo.setData_voo(new Date());
//		voo.setDestino("sao paulo");
//		voo.setRota("blablabla");
//		voo.setId_aeronave(aeronave);
//		vooDao.updateVoo(voo);
		
		
		
		
	}
	
	
	public static void executeAeronave() {
		// selecct
//		AeronaveDAO aDao = new AeronaveDAO();
//		aDao.getAllAeronaves();

		// insert
//				Aeronave a = new Aeronave();
//				a.setCompanhia("TAM");
//				a.setNome_aeronave("AIR BUS 2");
//				a.setTipo_aeronave("sua tia");
//				aDao.insertNewAeronave(a);

//				update
//				Aeronave a = new Aeronave();
//				a.setCompanhia("TAM");
//				a.setNome_aeronave("AIR BUS");
//				a.setTipo_aeronave("sua vo");
//				a.setId_aeronave(1);
//				aDao.updateAeronave(a);

		// delete
//				aDao.deleteAeronave(1);
	}

}
