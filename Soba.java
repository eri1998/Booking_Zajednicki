package com.comtrade.domen;

import java.io.Serializable;
import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Soba implements OpstiDomen, Serializable {
	private int id_soba;
	private String nazivSobe;
	private int brojSoba;
	private String povrsina;
	private double cena;
	private int id_tipSobe;
	private int sprat;
	private int brSobe;
	private List<String> urlSlika;

	private int idHotela;

	public Soba() {
		urlSlika = new ArrayList<String>();

	}

	public int getIdHotela() {
		return idHotela;
	}

	public void setIdHotela(int idHotela) {
		this.idHotela = idHotela;
	}

	public List<String> getUrlSlika() {
		return urlSlika;
	}

	public void setUrlSlika(List<String> urlSlika) {
		this.urlSlika = urlSlika;
	}

	public int getSprat() {
		return sprat;
	}

	public void setSprat(int sprat) {
		this.sprat = sprat;
	}

	public int getBrSobe() {
		return brSobe;
	}

	public void setBrSobe(int i) {
		this.brSobe = i;
	}

	public int getId_soba() {
		return id_soba;
	}

	public void setId_soba(int id_soba) {
		this.id_soba = id_soba;
	}

	public String getNazivSobe() {
		return nazivSobe;
	}

	public void setNazivSobe(String nazivSobe) {
		this.nazivSobe = nazivSobe;
	}

	public int getBrojSoba() {
		return brojSoba;
	}

	public void setBrojSoba(int brojSoba) {
		this.brojSoba = brojSoba;
	}

	public String getPovrsina() {
		return povrsina;
	}

	public void setPovrsina(String povrsina) {
		this.povrsina = povrsina;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public int getId_tipSobe() {
		return id_tipSobe;
	}

	public void setId_tipSobe(int id_tipSobe) {
		this.id_tipSobe = id_tipSobe;
	}

	@Override
	public String nazivTabele() {
		// TODO Auto-generated method stub
		return "soba";
	}

	@Override
	public String nazivKolona() {
		// TODO Auto-generated method stub
		return "(nazivSobe,brojSoba,povrsinaSobe,cenaNoci,brSobe,sprat,idTipSobe)";
	}

	@Override
	public String vrednostKolona() {
		// TODO Auto-generated method stub
		return "values (?,?,?,?,?,?,?)";
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return "idSoba";
	}

	@Override
	public PreparedStatement vrati(PreparedStatement preparedStatement) {
		try {
			preparedStatement.setString(1, nazivSobe);
			preparedStatement.setInt(2, brojSoba);
			preparedStatement.setString(3, povrsina);
			preparedStatement.setDouble(4, cena);
			preparedStatement.setInt(5, brSobe);
			preparedStatement.setInt(6, sprat);
			preparedStatement.setInt(7, id_tipSobe);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return preparedStatement;
	}

	@Override
	public List<OpstiDomen> vratiSelect(ResultSet resultSet) {
		List<OpstiDomen> list = new ArrayList<>();
		try {
			while (resultSet.next()) {
				Soba soba = new Soba();
				id_soba = resultSet.getInt("idSoba");
				nazivSobe = resultSet.getString("nazivSobe");
				soba.setNazivSobe(nazivSobe);
				povrsina = resultSet.getString("PovrsinaSobe");
				cena = resultSet.getDouble("cenaNoci");
				sprat = resultSet.getInt("sprat");
				soba.setSprat(sprat);
				brSobe = resultSet.getInt("brSobe");
				soba.setBrSobe(brSobe);
				soba.setPovrsina(povrsina);
				soba.setCena(cena);
				soba.setId_soba(id_soba);
				list.add(soba);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}

}
