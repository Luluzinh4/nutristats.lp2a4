package PersistJDBC;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.util.ArrayList;
import java.util.List;


import Model.Nutriente;
import bancoDados.AcessoBDMysql;

public class NutrienteJDBC {
	public Connection AcessoBD;
    PreparedStatement stmt;
    ResultSet rs;
    public NutrienteJDBC(){
        this.AcessoBD = new AcessoBDMysql().getConnection();
    }
    
    public List<Nutriente> listar() {
		ArrayList<Nutriente> Nutrientes = new ArrayList<>();
		String sql ="select * from Nutriente";
		try {
			stmt = AcessoBD.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Nutriente n = new Nutriente();
				n.setDescricao(rs.getString("Descricao"));
				n.setTipoAlimento(rs.getString("tipoAlimento"));
				n.setUmidade(rs.getString("Umidade"));
				n.setProteina(rs.getString("Proteina"));
				n.setLipideos(rs.getString("Lipideos"));
				n.setCalcio(rs.getString("Calcio"));
				Nutrientes.add(n);
				
			}
		} catch (Exception ex) {
			  throw new RuntimeException(ex);
		}
		return Nutrientes;
	}
    public List<Nutriente> listarPorTipoAlimento(String descricao) {
		ArrayList<Nutriente> Nutrientes = new ArrayList<>();
		String sql ="select * from nutriente where Descricao LIKE '%"+descricao+"%'";
		try {
			
			stmt = AcessoBD.prepareStatement(sql);
	
			rs = stmt.executeQuery();
			while (rs.next()) {
				Nutriente n = new Nutriente();
				n.setDescricao(rs.getString("Descricao"));
				n.setCarboidrato(rs.getString("Carboidrato"));
				n.setUmidade(rs.getString("Umidade"));
				n.setProteina(rs.getString("Proteina"));
				n.setLipideos(rs.getString("Lipideos"));
				n.setCalcio(rs.getString("Calcio"));
				Nutrientes.add(n);
				
			}
		} catch (Exception ex) {
			  throw new RuntimeException(ex);
		}
		System.out.println(Nutrientes.size());
		return Nutrientes;
	}
}
