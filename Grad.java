package com.comtrade.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Grad implements OpstiDomen, Serializable {
	private String naziv;
	private int id_grad;
	private int id_drzava;
	private String ulica, broj;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getId_grad() {
		return id_grad;
	}

	public void setId_grad(int id_grad) {
		this.id_grad = id_grad;
	}

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public String getBroj() {
		return broj;
	}

	public void setBroj(String broj) {
		this.broj = broj;
	}

	public int getId_drzava() {
		return id_drzava;
	}

	public void setId_drzava(int id_drzava) {
		this.id_drzava = id_drzava;
	}

	@Override
	public String nazivTabele() {
		// TODO Auto-generated method stub
		return "grad";
	}

	@Override
	public String nazivKolona() {
		// TODO Auto-generated method stub
		return "(nazivGrada,id_drzava)";
	}

	@Override
	public String vrednostKolona() {
		// TODO Auto-generated method stub
		return " values (?,?)";
	}

	@Override
	public PreparedStatement vrati(PreparedStatement preparedStatement) {
		try {
			preparedStatement.setString(1, naziv);
			preparedStatement.setInt(2, id_drzava);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return preparedStatement;
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return "id_grad";
	}

	@Override
	public List<OpstiDomen> vratiSelect(ResultSet resultSet) {
		List<OpstiDomen> list = new ArrayList<>();
		try {
			if (resultSet.next()) {
				Grad grad = new Grad();
				naziv = resultSet.getString("nazivGrada");
				id_grad = resultSet.getInt("id_grad");
				id_drzava = resultSet.getInt("id_drzava");
				grad.setId_drzava(id_drzava);
				grad.setId_grad(id_grad);
				grad.setNaziv(naziv);
				list.add(grad);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
