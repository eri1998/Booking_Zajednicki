package com.comtrade.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Hotel implements OpstiDomen, Serializable {
	private int id_hotel;
	private String naziv;
	private int brojZvezdica;
	private int id_adresa;
	private int id_user;
	private String kljucnaRec;
	private List<String> urlSlika;
	private int beach;
	private String nazivGrada, nazivDrzave, ulica, broj;

	public Hotel() {
		urlSlika = new ArrayList<String>();
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

	public String getNazivDrzave() {
		return nazivDrzave;
	}

	public void setNazivDrzave(String nazivDrzave) {
		this.nazivDrzave = nazivDrzave;
	}

	public String getNazivGrada() {
		return nazivGrada;
	}

	public void setNazivGrada(String nazivGrada) {
		this.nazivGrada = nazivGrada;
	}

	public int getBeach() {
		return beach;
	}

	public void setBeach(int beach) {
		this.beach = beach;
	}

	public List<String> getUrlSlika() {
		return urlSlika;
	}

	public void setUrlSlika(List<String> urlSlike) {
		this.urlSlika = urlSlike;
	}

	public String getKljucnaRec() {
		return kljucnaRec;
	}

	public void setKljucnaRec(String kljucnaRec) {
		this.kljucnaRec = kljucnaRec;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public int getId_adresa() {
		return id_adresa;
	}

	public void setId_adresa(int id_adresa) {
		this.id_adresa = id_adresa;
	}

	public int getId_hotel() {
		return id_hotel;
	}

	public void setId_hotel(int id_hotel) {
		this.id_hotel = id_hotel;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getBrojZvezdica() {
		return brojZvezdica;
	}

	public void setBrojZvezdica(int brojZvezdica) {
		this.brojZvezdica = brojZvezdica;
	}

	@Override
	public String nazivTabele() {
		// TODO Auto-generated method stub
		return " hotel ";
	}

	@Override
	public String nazivKolona() {

		return " (naziv,brojZvezdica,id_adresa,id_user)";
	}

	@Override
	public String vrednostKolona() {
		// TODO Auto-generated method stub
		return " values (?,?,?,?)";
	}

	@Override
	public PreparedStatement vrati(PreparedStatement preparedStatement) {
		try {
			preparedStatement.setString(1, naziv);
			preparedStatement.setInt(2, brojZvezdica);
			preparedStatement.setInt(3, id_adresa);
			preparedStatement.setInt(4, id_user);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return preparedStatement;
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return " id_hotel";
	}

	@Override
	public List<OpstiDomen> vratiSelect(ResultSet resultSet) {
		List<OpstiDomen> list = new ArrayList<>();
		try {
			while (resultSet.next()) {
				Hotel hotel = new Hotel();
				id_hotel = resultSet.getInt("id_hotel");
				hotel.setId_hotel(id_hotel);
				naziv = resultSet.getString("naziv");
				hotel.setNaziv(naziv);
				brojZvezdica = resultSet.getInt("brojZvezdica");
				id_adresa = resultSet.getInt("id_adresa");
				hotel.setId_adresa(id_adresa);
				hotel.setBrojZvezdica(brojZvezdica);

				list.add(hotel);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
