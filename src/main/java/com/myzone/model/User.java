package com.myzone.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.myzone.util.JsonDateSerializer;

@Entity
@Table(name="customer")
public class User implements Serializable{
    

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1252148870446365282L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//不创建hibernate_sequence表 // 自动生成,当你插入时会自动更新idOK??? 恩
	@Column(length = 20)
	private Long id;
	
	@Column(length = 20,nullable=false)
    private String username;
	
	@Column(length = 20,nullable=false)
    private String password;
	
	@Column(length = 4)
    private int type;
	
	@Column
    private Date createDate;
	
	@Column
    private Date updateDate;
	
	@Column
    private String idCard;
	
	@Column
    private String phone;
	
	@Column
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getCreateDate() {
        return createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
    
    @Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", type=" + type
				+ ", createDate=" + createDate + ", updateDate=" + updateDate + ", idCard=" + idCard + ", phone="
				+ phone + ", email=" + email + "]";
	}
}