package com.three.entity;

public class ssz {
    private int id;
    private String name;//送审人员姓名
    private String imge;//上传照片
    private String Address;//送审着地址
    private String ptime;//送审时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImge() {
        return imge;
    }

    public void setImge(String imge) {
        this.imge = imge;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPtime() {
        return ptime;
    }

    public void setPtime(String ptime) {
        this.ptime = ptime;
    }

    @Override
    public String toString() {
        return "ssz{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imge='" + imge + '\'' +
                ", Address='" + Address + '\'' +
                ", ptime='" + ptime + '\'' +
                '}';
    }
}
