package com.comtrade.transferKlasa;

import java.io.Serializable;

public class TransferKlasa implements Serializable {
	private int operacija;
	private Object Klijent_object_request;
	private Object Server_object_response;
	private String poruka_response;

	public int getOperacija() {
		return operacija;
	}

	public void setOperacija(int operacija) {
		this.operacija = operacija;
	}

	public Object getKlijent_object_request() {
		return Klijent_object_request;
	}

	public void setKlijent_object_request(Object klijent_object_request) {
		Klijent_object_request = klijent_object_request;
	}

	public Object getServer_object_response() {
		return Server_object_response;
	}

	public void setServer_object_response(Object server_object_response) {
		Server_object_response = server_object_response;
	}

	public String getPoruka_response() {
		return poruka_response;
	}

	public void setPoruka_response(String poruka_response) {
		this.poruka_response = poruka_response;
	}

}
