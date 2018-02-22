package tk.ainiyue.danyuan.application.dbm.type.po;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * The persistent class for the sys_table_type_info database table.
 */
@Entity
@Table(name = "sys_table_type_info")
@NamedQuery(name = "SysTableTypeInfo.findAll", query = "SELECT s FROM SysTableTypeInfo s")
public class SysTableTypeInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "idGenerator", strategy = " uuid")
	@Column(unique = true, nullable = false, columnDefinition = " varchar(36) COMMENT '主键'")
	private String			  uuid;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "create_time", updatable = false, columnDefinition = " timestamp default CURRENT_TIMESTAMP COMMENT '录入时间'")
	private Date			  createTime;
	
	@Column(name = "create_user", updatable = false, columnDefinition = " varchar(50) default 'system' COMMENT '录入人员'")
	private String			  createUser;

	@Column(name = "delete_flag", columnDefinition = " int default 0 COMMENT '停用标记'")
	private Integer			  deleteFlag;

	@Column(columnDefinition = "varchar(200) COMMENT '资源功能描述'")
	private String			  discription;
	
	@Column(name = "type_name", columnDefinition = "varchar(36) COMMENT '类型名'")
	private String			  typeName;
	
	@Column(name = "type_icon", columnDefinition = "varchar(50) COMMENT '图标'")
	private String			  typeIcon;

	@Column(name = "type_order", columnDefinition = "int COMMENT '类型排序'")
	private Integer			  typeOrder;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "update_time", insertable = false, columnDefinition = " timestamp default CURRENT_TIMESTAMP   COMMENT '更新人员'")
	private Date			  updateTime;

	@Column(name = "update_user", insertable = false, columnDefinition = " varchar(50) default 'system'  COMMENT '更新时间'")
	private String			  updateUser;

	public SysTableTypeInfo() {
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Integer getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = Integer.valueOf(deleteFlag);
	}

	public String getDiscription() {
		return this.discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}
	
	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Integer getTypeOrder() {
		return this.typeOrder;
	}

	public void setTypeOrder(Integer typeOrder) {
		this.typeOrder = typeOrder;
	}
	
	/**
	 * @return the typeIcon
	 */
	public String getTypeIcon() {
		return typeIcon;
	}

	/**
	 * @param typeIcon
	 *            the typeIcon to set
	 */
	public void setTypeIcon(String typeIcon) {
		this.typeIcon = typeIcon;
	}

	/**
	 * 方法名 ： getUpdateTime
	 * 功 能 ： 返回变量 updateTime 的值
	 *
	 * @return: Date
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * 方法名 ： setUpdateTime
	 * 功 能 ： 设置变量 updateTime 的值
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 方法名 ： getUpdateUser
	 * 功 能 ： 返回变量 updateUser 的值
	 *
	 * @return: String
	 */
	public String getUpdateUser() {
		return updateUser;
	}

	/**
	 * 方法名 ： setUpdateUser
	 * 功 能 ： 设置变量 updateUser 的值
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	
}