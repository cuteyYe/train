package com.jiawa.train.business.req;

import com.jiawa.train.common.req.PageReq;

public class TrainStationQueryReq extends PageReq {
    private String trainCode;

    public String getTrainCode() {
        return trainCode;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TrainStationQueryReq{");
        sb.append("trainCode='").append(trainCode).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setTrainCode(String trainCode) {
        this.trainCode = trainCode;
    }

}
