package com.comtrade.domen.pretraga;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.comtrade.domen.OpstiDomen;

public class Pretraga implements OpstiDomen, Serializable {
	private String kljucnaRec;

	public String getKljucnaRec() {
		return kljucnaRec;
	}

	public void setKljucnaRec(String kljucnaRec) {
		this.kljucnaRec = kljucnaRec;
	}

	@Override
	public String nazivTabele() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String nazivKolona() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String vrednostKolona() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OpstiDomen> vratiSelect(ResultSet resultSet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement vrati(PreparedStatement preparedStatement) {
		// TODO Auto-generated method stub
		return null;
	}

}
