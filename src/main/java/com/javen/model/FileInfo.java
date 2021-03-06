package com.javen.model;

import java.util.Date;

public class FileInfo {
    private Integer id;

    private String fondsNum;

    private String fileYear;

    private String caseNum;

    private String fileNum;

    private String subjectName;

    private String securityRank;

    private String fileDescribeNum;

    private String orgType;

    private String responsibler;

    private String time;

    private String filePath;

    private String remarks;

    private String safekeepingTerm;

    private Integer pageNum;

    private Date uploadTime;
    
    private String caseYear;
    
    private String address;
    
    private String state;

    public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state == null ? null : state.trim();
	}

	public String getCaseYear() {
		return caseYear;
	}

	public void setCaseYear(String caseYear) {
		this.caseYear = caseYear;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getfondsNum() {
        return fondsNum;
    }

    public void setfondsNum(String fondsNum) {
        this.fondsNum = fondsNum == null ? null : fondsNum.trim();
    }

    public String getFileYear() {
        return fileYear;
    }

    public void setFileYear(String fileYear) {
        this.fileYear = fileYear == null ? null : fileYear.trim();
    }

    public String getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(String caseNum) {
        this.caseNum = caseNum == null ? null : caseNum.trim();
    }

    public String getFileNum() {
        return fileNum;
    }

    public void setFileNum(String fileNum) {
        this.fileNum = fileNum == null ? null : fileNum.trim();
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    public String getSecurityRank() {
        return securityRank;
    }

    public void setSecurityRank(String securityRank) {
        this.securityRank = securityRank == null ? null : securityRank.trim();
    }

    public String getFileDescribeNum() {
        return fileDescribeNum;
    }

    public void setFileDescribeNum(String fileDescribeNum) {
        this.fileDescribeNum = fileDescribeNum == null ? null : fileDescribeNum.trim();
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType == null ? null : orgType.trim();
    }

    public String getResponsibler() {
        return responsibler;
    }

    public void setResponsibler(String responsibler) {
        this.responsibler = responsibler == null ? null : responsibler.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getSafekeepingTerm() {
        return safekeepingTerm;
    }

    public void setSafekeepingTerm(String safekeepingTerm) {
        this.safekeepingTerm = safekeepingTerm == null ? null : safekeepingTerm.trim();
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }
}