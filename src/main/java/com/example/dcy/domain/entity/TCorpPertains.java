package com.example.dcy.domain.entity;

/**
 * 公司主要人员表（含董事、监事、经理等）
 */
public class TCorpPertains {

//  private String ORG;//联合主键
//  private String SEQ_ID;//联合主键
  private String p_ID;//联合主键
  private String certificateType;//证件类型
  private String personName;//成员姓名
  private String personType;//成员职务
  private String certificateNo;//证件编号
  private String selectType;//产生方式
  private String holdpostStart;//任职期限起
  private String holdpostEdn;//任职期限止
  private String sex;//性别
  private String age;//年龄
  private String country;//国籍
  private String createDate;//创建日期


  public String getCertificateType() {
    return certificateType;
  }

  public void setCertificateType(String certificateType) {
    this.certificateType = certificateType;
  }


  public String getPersonName() {
    return personName;
  }

  public void setPersonName(String personName) {
    this.personName = personName;
  }


  public String getPersonType() {
    return personType;
  }

  public void setPersonType(String personType) {
    this.personType = personType;
  }


  public String getCertificateNo() {
    return certificateNo;
  }

  public void setCertificateNo(String certificateNo) {
    this.certificateNo = certificateNo;
  }


  public String getSelectType() {
    return selectType;
  }

  public void setSelectType(String selectType) {
    this.selectType = selectType;
  }


  public String getHoldpostStart() {
    return holdpostStart;
  }

  public void setHoldpostStart(String holdpostStart) {
    this.holdpostStart = holdpostStart;
  }


  public String getHoldpostEdn() {
    return holdpostEdn;
  }

  public void setHoldpostEdn(String holdpostEdn) {
    this.holdpostEdn = holdpostEdn;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

}
