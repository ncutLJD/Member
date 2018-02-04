package com.xinqushi.pojo;

import java.io.Serializable;
import java.util.Date;

public class Member implements Serializable {
    private Integer id;

    private Integer uid;

    private String name;

    private String sex;

    private String school;

    private String company;

    private String mobile;

    private Boolean student;

    private Date graduateDate;

    private Date time;

    private Boolean abnormal;

    private Integer provid;

    private Boolean flag;

    private Integer alog;

    private Float restAmount;

    private Float restInterest;

    private Boolean fee;

    private Integer aid;

    private Integer eid;

    private Boolean summaryflag;

    private Integer seat_provid;

    private Integer periodStatus;

    private Integer schProId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Boolean getStudent() {
        return student;
    }

    public void setStudent(Boolean student) {
        this.student = student;
    }

    public Date getGraduateDate() {
        return graduateDate;
    }

    public void setGraduateDate(Date graduateDate) {
        this.graduateDate = graduateDate;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Boolean getAbnormal() {
        return abnormal;
    }

    public void setAbnormal(Boolean abnormal) {
        this.abnormal = abnormal;
    }

    public Integer getProvid() {
        return provid;
    }

    public void setProvid(Integer provid) {
        this.provid = provid;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Integer getAlog() {
        return alog;
    }

    public void setAlog(Integer alog) {
        this.alog = alog;
    }

    public Float getRestAmount() {
        return restAmount;
    }

    public void setRestAmount(Float restAmount) {
        this.restAmount = restAmount;
    }

    public Float getRestInterest() {
        return restInterest;
    }

    public void setRestInterest(Float restInterest) {
        this.restInterest = restInterest;
    }

    public Boolean getFee() {
        return fee;
    }

    public void setFee(Boolean fee) {
        this.fee = fee;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Boolean getSummaryflag() {
        return summaryflag;
    }

    public void setSummaryflag(Boolean summaryflag) {
        this.summaryflag = summaryflag;
    }

    public Integer getSeat_provid() {
        return seat_provid;
    }

    public void setSeat_provid(Integer seat_provid) {
        this.seat_provid = seat_provid;
    }

    public Integer getPeriodStatus() {
        return periodStatus;
    }

    public void setPeriodStatus(Integer periodStatus) {
        this.periodStatus = periodStatus;
    }

    public Integer getSchProId() {
        return schProId;
    }

    public void setSchProId(Integer schProId) {
        this.schProId = schProId;
    }

	@Override
	public String toString() {
		return "Member [id=" + id + ", uid=" + uid + ", name=" + name + ", sex=" + sex + ", school=" + school
				+ ", company=" + company + ", mobile=" + mobile + ", student=" + student + ", graduateDate="
				+ graduateDate + ", time=" + time + ", abnormal=" + abnormal + ", provid=" + provid + ", flag=" + flag
				+ ", alog=" + alog + ", restAmount=" + restAmount + ", restInterest=" + restInterest + ", fee=" + fee
				+ ", aid=" + aid + ", eid=" + eid + ", summaryflag=" + summaryflag + ", seat_provid=" + seat_provid
				+ ", periodStatus=" + periodStatus + ", schProId=" + schProId + "]";
	}
    
    
}