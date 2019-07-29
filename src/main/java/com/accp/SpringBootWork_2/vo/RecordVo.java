package com.accp.SpringBootWork_2.vo;

import java.util.Date;

public class RecordVo {
	    private Integer id;

	    private String name;

	    /**
	     * 学号
	     */
	    private String stuCode;
	    
	    private String sname;
	    
	    /**
	     * 当前系统时间
	     */
	    private Date createDate;
	   
	    /**
	     * 当前登录人
	     */
	    private String createBy;

	    private String des;

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

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
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

		public RecordVo(Integer id, String name, String stuCode, String sname, Date createDate, String createBy,
				String des) {
			super();
			this.id = id;
			this.name = name;
			this.stuCode = stuCode;
			this.sname = sname;
			this.createDate = createDate;
			this.createBy = createBy;
			this.des = des;
		}

		public RecordVo() {
			super();
		}

		
		public RecordVo(String name, String sname) {
			super();
			this.name = name;
			this.sname = sname;
		}

		@Override
		public String toString() {
			return "RecordVo [id=" + id + ", name=" + name + ", stuCode=" + stuCode + ", sname=" + sname
					+ ", createDate=" + createDate + ", createBy=" + createBy + ", des=" + des + "]";
		}

}
