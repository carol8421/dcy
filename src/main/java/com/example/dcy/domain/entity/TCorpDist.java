package com.example.dcy.domain.entity;

/**
 * 分公司/分支机构表
 */
public class TCorpDist {

//  private String ORG;//联合主键
//  private String SEQ_ID;//联合主键
  private String d_ID;//联合主键
  private String distRegNo;//分支机构统一社会信用代码
  private String distName;//分支机构名称
  private String distBelongOrg;//分支机构登记机关
  private String distCorpOrg;//分支机构主体编号
  private String distCorpId;//分支机构主体编号
  private String distCorpSeqId;//分支机构主体编号
  private String farePlace;//营业场所
  private String operManIdentNo;//负责人证件编号
  private String operManName;//负责人
  private String fareScope;//经营范围
  private String startDate;//成立日期
  private java.sql.Timestamp checkDate;//核准日期
  private String createDate;//创建时间


  public String getDistRegNo() {
    return distRegNo;
  }

  public void setDistRegNo(String distRegNo) {
    this.distRegNo = distRegNo;
  }


  public String getDistName() {
    return distName;
  }

  public void setDistName(String distName) {
    this.distName = distName;
  }


  public String getDistBelongOrg() {
    return distBelongOrg;
  }

  public void setDistBelongOrg(String distBelongOrg) {
    this.distBelongOrg = distBelongOrg;
  }


  public String getDistCorpOrg() {
    return distCorpOrg;
  }

  public void setDistCorpOrg(String distCorpOrg) {
    this.distCorpOrg = distCorpOrg;
  }


  public String getDistCorpId() {
    return distCorpId;
  }

  public void setDistCorpId(String distCorpId) {
    this.distCorpId = distCorpId;
  }


  public String getDistCorpSeqId() {
    return distCorpSeqId;
  }

  public void setDistCorpSeqId(String distCorpSeqId) {
    this.distCorpSeqId = distCorpSeqId;
  }


  public String getFarePlace() {
    return farePlace;
  }

  public void setFarePlace(String farePlace) {
    this.farePlace = farePlace;
  }


  public String getOperManIdentNo() {
    return operManIdentNo;
  }

  public void setOperManIdentNo(String operManIdentNo) {
    this.operManIdentNo = operManIdentNo;
  }


  public String getOperManName() {
    return operManName;
  }

  public void setOperManName(String operManName) {
    this.operManName = operManName;
  }


  public String getFareScope() {
    return fareScope;
  }

  public void setFareScope(String fareScope) {
    this.fareScope = fareScope;
  }


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public java.sql.Timestamp getCheckDate() {
    return checkDate;
  }

  public void setCheckDate(java.sql.Timestamp checkDate) {
    this.checkDate = checkDate;
  }


  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

}
