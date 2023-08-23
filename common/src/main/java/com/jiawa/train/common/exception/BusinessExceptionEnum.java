package com.jiawa.train.common.exception;

public enum BusinessExceptionEnum {
    MEMBER_MOBILE_EXIST("手机号已注册"),
    MEMBER_MOBILE_CODE_ERROR("短信验证码错误"),
    MEMBER_MOBILE_NOT_EXIST("请先获取短信验证码"),

    BUSINESS_STATION_NAME_UNIQUE_ERROR("车站已存在"),
    BUSINESS_TRAIN_CODE_UNIQUE_ERROR("车次编号已存在"),
    BUSINESS_TRAIN_STATION_INDEX_UNIQUE_ERROR("同车次站序已存在"),
    BUSINESS_TRAIN_STATION_NAME_UNIQUE_ERROR("同车次战名已存在"),
    BUSINESS_TRAIN_CARRIAGE_INDEX_UNIQUE_ERROR("同车次厢序已存在"),

    CONFIRM_ORDER_TICKET_COUNT_ERROR("余票不足"),
    CONFIRM_ORDER_EXCEPTION("服务器忙，请稍候重试"),
    ;

    BusinessExceptionEnum(String desc) {
        this.desc = desc;
    }

    private String desc;

    @Override
    public String toString() {
        return "BusinessExceptionEnum{" +
                "desc='" + desc + '\'' +
                '}';
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
