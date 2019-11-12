package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Nutriente {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private String tipoalimento;
	private String umidade;
	private String kcal;
	private String kj;
	private String proteina;
	private String lipideos;
	private String colesterol;
	private String carboidrato;
	private String fibraalimentar;
	private String cinzas;
	private String calcio;
	private String manganes;
	private String fosforo;
	private String ferro;
	private String sodio;
	private String potassio;
	private String cobre;
	private String zinco;
	private String retinol;
	private String re;
	private String rae;
	private String tiamina;
	private String riboflavina;
	private String piridoxina;
	private String niacina;
	private String vitaminac;
	
	public String getTipoalimento() {
		return tipoalimento;
	}
	public void setTipoalimento(String tipoalimento) {
		this.tipoalimento = tipoalimento;
	}
	public String getUmidade() {
		return umidade;
	}
	public void setUmidade(String umidade) {
		this.umidade = umidade;
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
		return proteina;
	}
	public void setProteina(String proteina) {
		this.proteina = proteina;
	}
	public String getLipideos() {
		return lipideos;
	}
	public void setLipideos(String lipideos) {
		this.lipideos = lipideos;
	}
	public String getColesterol() {
		return colesterol;
	}
	public void setColesterol(String colesterol) {
		this.colesterol = colesterol;
	}
	public String getCarboidrato() {
		return carboidrato;
	}
	public void setCarboidrato(String carboidrato) {
		this.carboidrato = carboidrato;
	}
	public String getFibraalimentar() {
		return fibraalimentar;
	}
	public void setFibraalimentar(String fibraalimentar) {
		this.fibraalimentar = fibraalimentar;
	}
	public String getCinzas() {
		return cinzas;
	}
	public void setCinzas(String cinzas) {
		this.cinzas = cinzas;
	}
	public String getCalcio() {
		return calcio;
	}
	public void setCalcio(String calcio) {
		this.calcio = calcio;
	}
	public String getManganes() {
		return manganes;
	}
	public void setManganes(String manganes) {
		this.manganes = manganes;
	}
	public String getFosforo() {
		return fosforo;
	}
	public void setFosforo(String fosforo) {
		this.fosforo = fosforo;
	}
	public String getFerro() {
		return ferro;
	}
	public void setFerro(String ferro) {
		this.ferro = ferro;
	}
	public String getSodio() {
		return sodio;
	}
	public void setSodio(String sodio) {
		this.sodio = sodio;
	}
	public String getPotassio() {
		return potassio;
	}
	public void setPotassio(String potassio) {
		this.potassio = potassio;
	}
	public String getCobre() {
		return cobre;
	}
	public void setCobre(String cobre) {
		this.cobre = cobre;
	}
	public String getZinco() {
		return zinco;
	}
	public void setZinco(String zinco) {
		this.zinco = zinco;
	}
	public String getRetinol() {
		return retinol;
	}
	public void setRetinol(String retinol) {
		this.retinol = retinol;
	}
	public String getRe() {
		return re;
	}
	public void setRe(String re) {
		this.re = re;
	}
	public String getRae() {
		return rae;
	}
	public void setRae(String rae) {
		this.rae = rae;
	}
	public String getTiamina() {
		return tiamina;
	}
	public void setTiamina(String tiamina) {
		this.tiamina = tiamina;
	}
	public String getRiboflavina() {
		return riboflavina;
	}
	public void setRiboflavina(String riboflavina) {
		this.riboflavina = riboflavina;
	}
	public String getPiridoxina() {
		return piridoxina;
	}
	public void setPiridoxina(String piridoxina) {
		this.piridoxina = piridoxina;
	}
	public String getNiacina() {
		return niacina;
	}
	public void setNiacina(String niacina) {
		this.niacina = niacina;
	}
	public String getVitaminac() {
		return vitaminac;
	}
	public void setVitaminac(String vitaminac) {
		this.vitaminac = vitaminac;
	}
	
	
	
}
