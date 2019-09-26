package com.comtrade.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Adresa implements OpstiDomen, Serializable {
	private int id_adresa;
	private String ulica;
	private String broj;
	private int id_grad;
	private String kljucnaRec;

	public String getKljucnaRec() {
		return kljucnaRec;
	}

	public void setKljucnaRec(String kljucnaRec) {
		this.kljucnaRec = kljucnaRec;
	}

	public int getId_grad() {
		return id_grad;
	}

	public void setId_grad(int id_grad) {
		this.id_grad = id_grad;
	}

	public int getId_adresa() {
		return id_adresa;
	}

	public void setId_adresa(int id_adresa) {
		this.id_adresa = id_adresa;
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

	@Override
	public String nazivTabele() {
		// TODO Auto-generated method stub
		return " adresa ";
	}

	@Override
	public String nazivKolona() {
		// TODO Auto-generated method stub
		return " ( ulica , broj , id_grad ) ";
	}

	@Override
	public String vrednostKolona() {
		// TODO Auto-generated method stub
		return " values (?,?,?)";
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return "id_adresa";
	}

	@Override
	public PreparedStatement vrati(PreparedStatement preparedStatement) {
		try {
			preparedStatement.setString(1, ulica);
			preparedStatement.setString(2, broj);
			preparedStatement.setInt(3, id_grad);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return preparedStatement;
	}

	@Override
	public List<OpstiDomen> vratiSelect(ResultSet resultSet) {
		List<OpstiDomen> listAdresa = new ArrayList<>();
		try {
			if (resultSet.next()) {
				Adresa adresa = new Adresa();
				id_adresa = resultSet.getInt("id_adresa");
				ulica = resultSet.getString("ulica");
				broj = resultSet.getString("broj");
				id_grad = resultSet.getInt("id_grad");
				adresa.setId_adresa(id_adresa);
				adresa.setBroj(broj);
				adresa.setUlica(ulica);
				adresa.setId_grad(id_grad);

				listAdresa.add(adresa);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listAdresa;
	}

}
