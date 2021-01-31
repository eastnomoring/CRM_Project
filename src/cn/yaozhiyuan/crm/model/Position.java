package cn.yaozhiyuan.crm.model;

public class Position {
    //类型描述：能够描述职务编号、职务名称
    private String positionNo;
    private String positionName;

    public Position() {
    }

    public Position(String positionNo, String positionName) {
        this.setPositionNo(positionNo);
        this.setPositionName(positionName);
    }

    public String getPositionNo() {
        return positionNo;
    }

    public void setPositionNo(String positionNo) {
        this.positionNo = positionNo;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String info() {
        String str = "职务编号:" + this.positionNo + "\n职务名称:" + this.positionName;
        return str;
    }
}
