package model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "voo")
public class Voo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_voo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_aeronave")
	private Aeronave id_aeronave;

	public Integer getId_voo() {
		return id_voo;
	}
	public void setId_voo(Integer id_voo) {
		this.id_voo = id_voo;
	}
	public Aeronave getId_aeronave() {
		return id_aeronave;
	}
	public void setId_aeronave(Aeronave id_aeronave) {
		this.id_aeronave = id_aeronave;
	}
	public String getRota() {
		return rota;
	}
	public void setRota(String rota) {
		this.rota = rota;
	}
	public Date getData_voo() {
		return data_voo;
	}
	public void setData_voo(Date data_voo) {
		this.data_voo = data_voo;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	private String rota;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data_voo;
	
	private String destino;
	
	@Override
	public String toString(){
		return "voo [id_voo=" + id_voo + ", data_voo=" + data_voo +"]";
	}
}
