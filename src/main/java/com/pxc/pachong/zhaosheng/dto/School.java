package com.pxc.pachong.zhaosheng.dto;

import com.alibaba.excel.annotation.ExcelProperty;

/**
 * @author pengxincheng
 * @date 2023/6/20 11:00
 */
public class School {

    @ExcelProperty("学校名称")
    private String name;

    @ExcelProperty("学校代码")
    private String no;

    @ExcelProperty("省份")
    private String province;

    @ExcelProperty("专业代码")
    private String majorNo;

    @ExcelProperty("专业名称")
    private String majorName;

    @ExcelProperty("培养层次")
    private String level;

    @ExcelProperty("学习形式")
    private String learnStyle;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getMajorNo() {
        return majorNo;
    }

    public void setMajorNo(String majorNo) {
        this.majorNo = majorNo;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLearnStyle() {
        return learnStyle;
    }

    public void setLearnStyle(String learnStyle) {
        this.learnStyle = learnStyle;
    }
}
