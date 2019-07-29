package com.accp.SpringBootWork_2.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * record
 * @author 
 */
public class Record implements Serializable {
    private Integer id;

    private String name;

    /**
     * 学号
     */
    private String stuCode;
    
    /**
     * 当前系统时间
     */
    private Date createDate;
   
    /**
     * 当前登录人
     */
    private String createBy;

    private String des;

    private static final long serialVersionUID = 1L;

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
        this.name = name;
    }

    public String getStuCode() {
        return stuCode;
    }

    public void setStuCode(String stuCode) {
        this.stuCode = stuCode;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

	public Record(Integer id, String name, String stuCode, Date createDate, String createBy, String des) {
		super();
		this.id = id;
		this.name = name;
		this.stuCode = stuCode;
		this.createDate = createDate;
		this.createBy = createBy;
		this.des = des;
	}

	public Record(String name, String stuCode, Date createDate, String createBy, String des) {
		super();
		this.name = name;
		this.stuCode = stuCode;
		this.createDate = createDate;
		this.createBy = createBy;
		this.des = des;
	}

	public Record() {
		super();
	}

	@Override
	public String toString() {
		return "Record [id=" + id + ", name=" + name + ", stuCode=" + stuCode + ", createDate=" + createDate
				+ ", createBy=" + createBy + ", des=" + des + "]";
	}
    
    
}