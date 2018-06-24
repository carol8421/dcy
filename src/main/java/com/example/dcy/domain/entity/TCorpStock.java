package com.example.dcy.domain.entity;

/**
 * 股东/发起人信息表
 */
public class TCorpStock {

//  private String ORG;//联合主键
//  private String SEQ_ID;//联合主键
  private String s_ID;//联合主键
  private String stockType;//股东类型
  private String country;//股东国别
  private String certificateType;//证件类型
  private String certificateNo;//证件编号
  private String stockName;//股东名称
  private String stockCapiType;//股东认缴额币种
  private String stockCapi;//股东认缴（万）
  private String stockCapiDollar;//股东认缴额折美元（万元）
  private String stockCapiRmb;//股东认缴额折人民币（万元）
  private String stockPercent;//出资百分比
  private String stockRateRmb;//对人民币的汇率
  private String stockRateDollar;//对美元汇率
  private String createDate;//创建时间


  public String getStockType() {
    return stockType;
  }

  public void setStockType(String stockType) {
    this.stockType = stockType;
  }


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public String getCertificateType() {
    return certificateType;
  }

  public void setCertificateType(String certificateType) {
    this.certificateType = certificateType;
  }


  public String getCertificateNo() {
    return certificateNo;
  }

  public void setCertificateNo(String certificateNo) {
    this.certificateNo = certificateNo;
  }


  public String getStockName() {
    return stockName;
  }

  public void setStockName(String stockName) {
    this.stockName = stockName;
  }


  public String getStockCapiType() {
    return stockCapiType;
  }

  public void setStockCapiType(String stockCapiType) {
    this.stockCapiType = stockCapiType;
  }


  public String getStockCapi() {
    return stockCapi;
  }

  public void setStockCapi(String stockCapi) {
    this.stockCapi = stockCapi;
  }


  public String getStockCapiDollar() {
    return stockCapiDollar;
  }

  public void setStockCapiDollar(String stockCapiDollar) {
    this.stockCapiDollar = stockCapiDollar;
  }


  public String getStockCapiRmb() {
    return stockCapiRmb;
  }

  public void setStockCapiRmb(String stockCapiRmb) {
    this.stockCapiRmb = stockCapiRmb;
  }


  public String getStockPercent() {
    return stockPercent;
  }

  public void setStockPercent(String stockPercent) {
    this.stockPercent = stockPercent;
  }


  public String getStockRateRmb() {
    return stockRateRmb;
  }

  public void setStockRateRmb(String stockRateRmb) {
    this.stockRateRmb = stockRateRmb;
  }


  public String getStockRateDollar() {
    return stockRateDollar;
  }

  public void setStockRateDollar(String stockRateDollar) {
    this.stockRateDollar = stockRateDollar;
  }


  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

}
