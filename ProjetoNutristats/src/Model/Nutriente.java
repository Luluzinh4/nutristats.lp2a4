package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Nutriente {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String tipoAlimento;
	private	String Descricao;
	private String Umidade;
	private String kcal;
	private String kj;
	private String Proteina;
	private String Lipideos;
	private String Colesterol;
	private String carboidrato;
	private String Fibraalimentar;
	private String Cinzas;
	private String Calcio;
	private String Manganes;
	private String Fosforo;
	private String Ferro;
	private String Sodio;
	private String Potassio;
	private String Cobre;
	private String Zinco;
	private String Retinol;
	private String RE;
	private String RAE;
	private String Tiamina;
	private String Riboflavina;
	private String Piridoxina;
	private String Niacina;
	private String Vitaminac;
	public String getTipoAlimento() {
		return tipoAlimento;
	}
	public void setTipoAlimento(String tipoAlimento) {
		this.tipoAlimento = tipoAlimento;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public String getUmidade() {
		return Umidade;
	}
	public void setUmidade(String umidade) {
		Umidade = umidade;
	}
	public String getKcal() {
		return kcal;
	}
	public void setKcal(String kcal) {
		this.kcal = kcal;
	}
	public String getKj() {
		return kj;
	}
	public void setKj(String kj) {
		this.kj = kj;
	}
	public String getProteina() {
		return Proteina;
	}
	public void setProteina(String proteina) {
		Proteina = proteina;
	}
	public String getLipideos() {
		return Lipideos;
	}
	public void setLipideos(String lipideos) {
		Lipideos = lipideos;
	}
	public String getColesterol() {
		return Colesterol;
	}
	public void setColesterol(String colesterol) {
		Colesterol = colesterol;
	}
	public String getCarboidrato() {
		return carboidrato;
	}
	public void setCarboidrato(String carboidrato) {
		this.carboidrato = carboidrato;
	}
	public String getFibraalimentar() {
		return Fibraalimentar;
	}
	public void setFibraalimentar(String fibraalimentar) {
		Fibraalimentar = fibraalimentar;
	}
	public String getCinzas() {
		return Cinzas;
	}
	public void setCinzas(String cinzas) {
		Cinzas = cinzas;
	}
	public String getCalcio() {
		return Calcio;
	}
	public void setCalcio(String calcio) {
		Calcio = calcio;
	}
	public String getManganes() {
		return Manganes;
	}
	public void setManganes(String manganes) {
		Manganes = manganes;
	}
	public String getFosforo() {
		return Fosforo;
	}
	public void setFosforo(String fosforo) {
		Fosforo = fosforo;
	}
	public String getFerro() {
		return Ferro;
	}
	public void setFerro(String ferro) {
		Ferro = ferro;
	}
	public String getSodio() {
		return Sodio;
	}
	public void setSodio(String sodio) {
		Sodio = sodio;
	}
	public String getPotassio() {
		return Potassio;
	}
	public void setPotassio(String potassio) {
		Potassio = potassio;
	}
	public String getCobre() {
		return Cobre;
	}
	public void setCobre(String cobre) {
		Cobre = cobre;
	}
	public String getZinco() {
		return Zinco;
	}
	public void setZinco(String zinco) {
		Zinco = zinco;
	}
	public String getRetinol() {
		return Retinol;
	}
	public void setRetinol(String retinol) {
		Retinol = retinol;
	}
	public String getRE() {
		return RE;
	}
	public void setRE(String rE) {
		RE = rE;
	}
	public String getRAE() {
		return RAE;
	}
	public void setRAE(String rAE) {
		RAE = rAE;
	}
	public String getTiamina() {
		return Tiamina;
	}
	public void setTiamina(String tiamina) {
		Tiamina = tiamina;
	}
	public String getRiboflavina() {
		return Riboflavina;
	}
	public void setRiboflavina(String riboflavina) {
		Riboflavina = riboflavina;
	}
	public String getPiridoxina() {
		return Piridoxina;
	}
	public void setPiridoxina(String piridoxina) {
		Piridoxina = piridoxina;
	}
	public String getNiacina() {
		return Niacina;
	}
	public void setNiacina(String niacina) {
		Niacina = niacina;
	}
	public String getVitaminac() {
		return Vitaminac;
	}
	public void setVitaminac(String vitaminac) {
		Vitaminac = vitaminac;
	}
	
	
	
	
	
}
