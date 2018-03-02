package tk.ainiyue.danyuan.application.dic.po;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the kj_dic_dwxz database table.
 * 
 */
@Entity
@Table(name = "kj_dic_dwxz")
@NamedQuery(name = "KjDicDwxz.findAll", query = "SELECT k FROM KjDicDwxz k")
public class KjDicDwxz implements Serializable {
	private static final long	serialVersionUID	= 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer				id;
	
	private String				dwxz;
	
	public KjDicDwxz() {
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDwxz() {
		return this.dwxz;
	}
	
	public void setDwxz(String dwxz) {
		this.dwxz = dwxz;
	}
	
}