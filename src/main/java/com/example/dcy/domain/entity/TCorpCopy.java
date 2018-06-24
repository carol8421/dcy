package com.example.dcy.domain.entity;


import java.sql.Timestamp;

/**
 * 企业基本信息表
 *
 */
public class TCorpCopy {

//  private String ORG;//联合主键
//  private String SEQ_ID;//联合主键
  private String e_Id;//主键
  private String reg_No;//统一社会信用代码
  private String corp_Name;//企业名称
  private String addr;//企业地址
  private String belong_Org;//登记机关
  private String belong_Dist_Org;//所属地区
  private String belong_Trade;//所属行业
  private String econ_Kind;//公司类型
  private String admit_Main;//企业大类
  private String start_Date;//成立日期
  private String check_Date;//核准日期
  private String oper_Man_Ident_No;//法定代表人证件编号
  private String oper_Man_Name;//法定代表人名称
  private String corp_Status;//经营状态（01-在业，02-注销，03-吊销，04-迁出）
  private String reg_Capi;//注册资金(单位：万元)
  private String fare_Term_Start;//经营期限(起)
  private String fare_Term_End;//经营期限(止)
  private String fare_Scope;//经营范围
  private String uni_Scid;//注册号
  private String tel;//电话
  private String web_Url;//官网
  private String email;//邮箱
  private String prac_Person_Num;//从业人数
  private String org_Inst_Code;//组织机构代码
  private String taxpay_Num;//纳税人识别号
  private String staff_Size;//人员规模
  private String english_Name;//英文名
  private String former_Name;//曾用名
  private java.sql.Timestamp create_Date;//创建时间
  private long create_Org;//创建机构代码

  public String getReg_No() {
    return reg_No;
  }

  public void setReg_No(String reg_No) {
    this.reg_No = reg_No;
  }

  public String getCorp_Name() {
    return corp_Name;
  }

  public void setCorp_Name(String corp_Name) {
    this.corp_Name = corp_Name;
  }

  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  public String getBelong_Org() {
    return belong_Org;
  }

  public void setBelong_Org(String belong_Org) {
    this.belong_Org = belong_Org;
  }

  public String getBelong_Dist_Org() {
    return belong_Dist_Org;
  }

  public void setBelong_Dist_Org(String belong_Dist_Org) {
    this.belong_Dist_Org = belong_Dist_Org;
  }

  public String getBelong_Trade() {
    return belong_Trade;
  }

  public void setBelong_Trade(String belong_Trade) {
    this.belong_Trade = belong_Trade;
  }

  public String getEcon_Kind() {
    return econ_Kind;
  }

  public void setEcon_Kind(String econ_Kind) {
    this.econ_Kind = econ_Kind;
  }

  public String getAdmit_Main() {
    return admit_Main;
  }

  public void setAdmit_Main(String admit_Main) {
    this.admit_Main = admit_Main;
  }

  public String getStart_Date() {
    return start_Date;
  }

  public void setStart_Date(String start_Date) {
    this.start_Date = start_Date;
  }

  public String getCheck_Date() {
    return check_Date;
  }

  public void setCheck_Date(String check_Date) {
    this.check_Date = check_Date;
  }

  public String getOper_Man_Ident_No() {
    return oper_Man_Ident_No;
  }

  public void setOper_Man_Ident_No(String oper_Man_Ident_No) {
    this.oper_Man_Ident_No = oper_Man_Ident_No;
  }

  public String getOper_Man_Name() {
    return oper_Man_Name;
  }

  public void setOper_Man_Name(String oper_Man_Name) {
    this.oper_Man_Name = oper_Man_Name;
  }

  public String getCorp_Status() {
    return corp_Status;
  }

  public void setCorp_Status(String corp_Status) {
    this.corp_Status = corp_Status;
  }

  public String getReg_Capi() {
    return reg_Capi;
  }

  public void setReg_Capi(String reg_Capi) {
    this.reg_Capi = reg_Capi;
  }

  public String getFare_Term_Start() {
    return fare_Term_Start;
  }

  public void setFare_Term_Start(String fare_Term_Start) {
    this.fare_Term_Start = fare_Term_Start;
  }

  public String getFare_Term_End() {
    return fare_Term_End;
  }

  public void setFare_Term_End(String fare_Term_End) {
    this.fare_Term_End = fare_Term_End;
  }

  public String getFare_Scope() {
    return fare_Scope;
  }

  public void setFare_Scope(String fare_Scope) {
    this.fare_Scope = fare_Scope;
  }

  public String getUni_Scid() {
    return uni_Scid;
  }

  public void setUni_Scid(String uni_Scid) {
    this.uni_Scid = uni_Scid;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getWeb_Url() {
    return web_Url;
  }

  public void setWeb_Url(String web_Url) {
    this.web_Url = web_Url;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPrac_Person_Num() {
    return prac_Person_Num;
  }

  public void setPrac_Person_Num(String prac_Person_Num) {
    this.prac_Person_Num = prac_Person_Num;
  }

  public String getOrg_Inst_Code() {
    return org_Inst_Code;
  }

  public void setOrg_Inst_Code(String org_Inst_Code) {
    this.org_Inst_Code = org_Inst_Code;
  }

  public String getTaxpay_Num() {
    return taxpay_Num;
  }

  public void setTaxpay_Num(String taxpay_Num) {
    this.taxpay_Num = taxpay_Num;
  }

  public String getStaff_Size() {
    return staff_Size;
  }

  public void setStaff_Size(String staff_Size) {
    this.staff_Size = staff_Size;
  }

  public String getEnglish_Name() {
    return english_Name;
  }

  public void setEnglish_Name(String english_Name) {
    this.english_Name = english_Name;
  }

  public String getFormer_Name() {
    return former_Name;
  }

  public void setFormer_Name(String former_Name) {
    this.former_Name = former_Name;
  }

  public Timestamp getCreate_Date() {
    return create_Date;
  }

  public void setCreate_Date(Timestamp create_Date) {
    this.create_Date = create_Date;
  }

  public long getCreate_Org() {
    return create_Org;
  }

  public void setCreate_Org(long create_Org) {
    this.create_Org = create_Org;
  }
}
