package com.example.webmagic.tencent.entity;

public class TencentAISpeechEntity {

    private Integer ret;

    private String msg;

    private Data data;

    public class Data {

        private Integer format;

        private String speech;

        private String md5sum;

        public Integer getFormat() {
            return format;
        }

        public void setFormat(Integer format) {
            this.format = format;
        }

        public String getSpeech() {
            return speech;
        }

        public void setSpeech(String speech) {
            this.speech = speech;
        }

        public String getMd5sum() {
            return md5sum;
        }

        public void setMd5sum(String md5sum) {
            this.md5sum = md5sum;
        }
    }

    public Integer getRet() {
        return ret;
    }

    public void setRet(Integer ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
