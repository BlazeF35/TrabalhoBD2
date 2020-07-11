package model;

import javax.persistence.*;

@Entity
@Table(name="aeronave")
public class Aeronave {
	public Aeronave() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_aeronave;

	private String nome_aeronave;
	private String tipo_aeronave;
	public Integer getId_aeronave() {
		return id_aeronave;
	}
	public void setId_aeronave(Integer id_aeronave) {
		this.id_aeronave = id_aeronave;
	}
	public String getNome_aeronave() {
		return nome_aeronave;
	}
	public void setNome_aeronave(String nome_aeronave) {
		this.nome_aeronave = nome_aeronave;
	}
	public String getTipo_aeronave() {
		return tipo_aeronave;
	}
	public void setTipo_aeronave(String tipo_aeronave) {
		this.tipo_aeronave = tipo_aeronave;
	}
	public String getCompanhia() {
		return companhia;
	}
	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}
	private String companhia;
	
	@Override
	public String toString(){
		return "aeronave [id_aeronave=" + id_aeronave + ", nome_aeronave=" + nome_aeronave +"]";
	}
	
	
}
