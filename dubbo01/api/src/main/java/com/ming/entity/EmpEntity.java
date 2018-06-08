package com.ming.entity;

import com.ming.until.SixEnum;

import java.io.Serializable;

public class EmpEntity implements Serializable {
    private Integer id;

    private String name;

    private String gender;

    private String email;

    private Integer dId;
    
    private String dName;
    
    private Enum<SixEnum> sixenum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

	public Enum<SixEnum> getSixenum() {
		return sixenum;
	}

	public void setSixenum(Enum<SixEnum> sixenum) {
		this.sixenum = sixenum;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}
}