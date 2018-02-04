package com.xinqushi.pojo;

import java.io.Serializable;
import java.util.Date;

public class Clue implements Serializable {
    private Integer id;

    private Integer aid;

    private String num;

    private String sex;

    private String qq;

    private String realName;

    private String school;

    private String diploma;

    private Date btime;

    private Date etime;

    private Boolean type;

    private String phone;

    private Date graduateDate;

    private Byte flag;

    private String exnum;

    private Boolean summaryflag;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma == null ? null : diploma.trim();
    }

    public Date getBtime() {
        return btime;
    }

    public void setBtime(Date btime) {
        this.btime = btime;
    }

    public Date getEtime() {
        return etime;
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getGraduateDate() {
        return graduateDate;
    }

    public void setGraduateDate(Date graduateDate) {
        this.graduateDate = graduateDate;
    }

    public Byte getFlag() {
        return flag;
    }

    public void setFlag(Byte flag) {
        this.flag = flag;
    }

    public String getExnum() {
        return exnum;
    }

    public void setExnum(String exnum) {
        this.exnum = exnum == null ? null : exnum.trim();
    }

    public Boolean getSummaryflag() {
        return summaryflag;
    }

    public void setSummaryflag(Boolean summaryflag) {
        this.summaryflag = summaryflag;
    }

	@Override
	public String toString() {
		return "Clue [id=" + id + ", aid=" + aid + ", num=" + num + ", sex=" + sex + ", qq=" + qq + ", realName="
				+ realName + ", school=" + school + ", diploma=" + diploma + ", btime=" + btime + ", etime=" + etime
				+ ", type=" + type + ", phone=" + phone + ", graduateDate=" + graduateDate + ", flag=" + flag
				+ ", exnum=" + exnum + ", summaryflag=" + summaryflag + "]";
	}
    
    
}