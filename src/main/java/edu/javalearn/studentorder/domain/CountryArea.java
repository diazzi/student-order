package edu.javalearn.studentorder.domain;

public class CountryArea {
    private String AreaId;
    private String AreaName;

    public CountryArea() {
    }

    public CountryArea(String areaId, String areaName) {
        AreaId = areaId;
        AreaName = areaName;
    }

    public String getAreaId() {
        return AreaId;
    }

    public void setAreaId(String areaId) {
        AreaId = areaId;
    }

    public String getAreaName() {
        return AreaName;
    }

    public void setAreaName(String areaName) {
        AreaName = areaName;
    }
}
