package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Dieta {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private String cafeManha;
	private String almoco;
	private String cafeTarde;
	private String janta;
	@ManyToOne
	private Usuario usuario;
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCafeManha() {
		return cafeManha;
	}
	public void setCafeManha(String cafeManha) {
		this.cafeManha = cafeManha;
	}
	public String getAlmoco() {
		return almoco;
	}
	public void setAlmoco(String almoco) {
		this.almoco = almoco;
	}
	public String getCafeTarde() {
		return cafeTarde;
	}
	public void setCafeTarde(String cafeTarde) {
		this.cafeTarde = cafeTarde;
	}
	public String getJanta() {
		return janta;
	}
	public void setJanta(String janta) {
		this.janta = janta;
	}
	
	


}
