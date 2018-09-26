package modules;

import com.ysyn.crab2died.annotation.ExcelField;

public class RunDaily {
    // 公司
    @ExcelField(title = "公司", order = 1)
    private String orgNo1;
    // 公司
    @ExcelField(title = "公司2", order = 2)
    private String orgNo2;
    // 风电场
    @ExcelField(title = "风电场", order = 3)
    private String windFarm;

    // 风机型号
    @ExcelField(title = "风机型号", order = 4)
    private String fanModel;

    public String getOrgNo1() {
        return orgNo1;
    }

    public void setOrgNo1(String orgNo1) {
        this.orgNo1 = orgNo1;
    }
/*
    public String getOrgNo2() {
        return orgNo2;
    }

    public void setOrgNo2(String orgNo2) {
        this.orgNo2 = orgNo2;
    }*/

    public String getWindFarm() {
        return windFarm;
    }

    public void setWindFarm(String windFarm) {
        this.windFarm = windFarm;
    }

    public String getFanModel() {
        return fanModel;
    }

    public void setFanModel(String fanModel) {
        this.fanModel = fanModel;
    }

    public String getOrgNo2() {
        return orgNo2;
    }

    public void setOrgNo2(String orgNo2) {
        this.orgNo2 = orgNo2;
    }

    @Override
    public String toString() {
        return "RunDaily{" +
                "orgNo1='" + orgNo1 + '\'' +
                ", orgNo2='" + orgNo2 + '\'' +
                ", windFarm='" + windFarm + '\'' +
                ", fanModel='" + fanModel + '\'' +
                '}';
    }
}
