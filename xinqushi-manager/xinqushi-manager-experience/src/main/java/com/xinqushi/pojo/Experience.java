package com.xinqushi.pojo;

import java.io.Serializable;
import java.util.Date;

public class Experience implements Serializable {
    private Integer id;

    private String num;

    private String password;

    private String salt;

    private Date noticeTime;

    private String name;

    private String sex;

    private String phone;

    private Boolean student;

    private String school;

    private String company;

    private Date graduateDate;

    private String province;

    private Date beginTime;

    private Date endTime;

    private Integer aid;

    private Integer flag;

    private String memo;

    private Boolean summaryflag;

    private Integer seat_provid;

    private String qq;

    private Integer schProId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Date getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Boolean getStudent() {
        return student;
    }

    public void setStudent(Boolean student) {
        this.student = student;
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

    public Date getGraduateDate() {
        return graduateDate;
    }

    public void setGraduateDate(Date graduateDate) {
        this.graduateDate = graduateDate;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Integer getSchProId() {
        return schProId;
    }

    public void setSchProId(Integer schProId) {
        this.schProId = schProId;
    }

	@Override
	public String toString() {
		return "Experience [id=" + id + ", num=" + num + ", password=" + password + ", salt=" + salt + ", noticeTime="
				+ noticeTime + ", name=" + name + ", sex=" + sex + ", phone=" + phone + ", student=" + student
				+ ", school=" + school + ", company=" + company + ", graduateDate=" + graduateDate + ", province="
				+ province + ", beginTime=" + beginTime + ", endTime=" + endTime + ", aid=" + aid + ", flag=" + flag
				+ ", memo=" + memo + ", summaryflag=" + summaryflag + ", seat_provid=" + seat_provid + ", qq=" + qq
				+ ", schProId=" + schProId + "]";
	}
    
    
}