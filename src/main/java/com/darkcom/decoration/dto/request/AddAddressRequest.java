package com.darkcom.decoration.dto.request;

/**
 * 添加地址
 * @author yjy
 */
public class AddAddressRequest {
    private String phone;
    private String name;
    private String[] region;

    private String detailAddress;

    private boolean isDefault;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public boolean getDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public String[] getRegion() {
        return region;
    }

    public void setRegion(String[] region) {
        this.region = region;
    }
}
