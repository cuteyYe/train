package com.jiawa.train.business.req;

import com.jiawa.train.common.req.PageReq;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class DailyTrainQueryReq extends PageReq {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    private String code;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DailyTrainQueryReq{");
        sb.append("date=").append(date);
        sb.append(", code='").append(code).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
