package com.allair.allairapi.domaine;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_engine")
public class Engine extends TrackEntity {
	
	@Id
	private int id;
	@Column(name="nom")
	private String type;
	@Column(name="entrepot")
	private String entrepot;
	@Column(name="flg_lck")
	private String flgLck;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEntrepot() {
		return entrepot;
	}
	public void setEntrepot(String entrepot) {
		this.entrepot = entrepot;
	}
	public String getFlgLck() {
		return flgLck;
	}
	public void setFlgLck(String flgLck) {
		this.flgLck = flgLck;
	}
}
