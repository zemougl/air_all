package com.allair.allairapi.domaine;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_engine")
public class Engine extends TrackEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="type")
	private String type;
	@Column(name="entrepot")
	private String entrepot;
	@Column(name="flg_lck")
	private boolean flgLck;
	@Column(name="probleme")
	private String probleme;
	
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
	public boolean getFlgLck() {
		return flgLck;
	}
	public void setFlgLck(boolean flgLck) {
		this.flgLck = flgLck;
	}
	public String getProbleme() {
		return probleme;
	}
	public void setProbleme(String probleme) {
		this.probleme = probleme;
	}
}
