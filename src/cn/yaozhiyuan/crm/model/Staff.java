package cn.yaozhiyuan.crm.model;

public class Staff {
    //员工姓名、工号、年龄、性别、所属部门、职务信息
    private String staffName;
    private String staffNo;
    private int staffAge;
    private String staffSex;
    private Department staffDepartment;
    private Position staffPosition;

    /**
     * 无参构造
     */

    public Staff() {
    }

    public Staff(String staffName, String staffNo, int staffAge, String staffSex) {
        this.setStaffName(staffName);
        this.setStaffNo(staffNo);
        this.setStaffAge(staffAge);
        this.setStaffSex(staffSex);

    }
    public Staff(String staffName, String staffNo, int staffAge, String staffSex,Position staffPosition) {
        this.setStaffName(staffName);
        this.setStaffNo(staffNo);
        this.setStaffAge(staffAge);
        this.setStaffSex(staffSex);
        this.setStaffPosition(staffPosition);

    }

    /**
     * 带参构造，对属性的全部赋值
     *
     * @param staffName
     * @param staffNo
     * @param staffAge
     * @param staffSex
     * @param staffDepartment
     * @param staffPosition
     */

    public Staff(String staffName, String staffNo, int staffAge, String staffSex, Department staffDepartment, Position staffPosition) {
        this.setStaffName(staffName);
        this.setStaffNo(staffNo);
        this.setStaffAge(staffAge);
        this.setStaffSex(staffSex);
        this.setStaffDepartment(staffDepartment);
        this.setStaffPosition(staffPosition);
    }
    //       要求：
    //
    //        1、 设定方法限定年龄只能是18--65之间,反之则设置默认为18岁
    //
    //        2、 设定方法限定性别只能是“男”或者“女”,反之则设置默认为"男"
    //
    //        3、 设定方法，实现员工自我介绍信息，将员工信息作为字符串返回


    public String getStaffName() {
        return staffName;
    }


    public String getStaffNo() {
        return staffNo;
    }


    public int getStaffAge() {
        return staffAge;
    }


    public String getStaffSex() {
        return staffSex;
    }

    /**
     * 获取员工部门
     *
     * @return
     */
    public Department getStaffDepartment() {
        if (this.staffDepartment == null) {
            this.staffDepartment = new Department();
        }
        return staffDepartment;
    }

    /**
     * 获取员工职务
     *
     * @return
     */
    public Position getStaffPosition() {
        if (this.staffPosition == null) {
            this.staffPosition = new Position();
        }
        return staffPosition;
    }


    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }


    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }


    public void setStaffAge(int staffAge) {
        if (staffAge <= 18 || staffAge >= 65) {
            this.staffAge = 18;
        } else {
            this.staffAge = staffAge;
        }

    }


    public void setStaffSex(String staffSex) {
        if (staffSex.equals("男") || staffSex.equals("女")) {
            this.staffSex = staffSex;
        } else {
            this.staffSex = "男";
        }

    }


    public void setStaffDepartment(Department staffDepartment) {
        this.staffDepartment = staffDepartment;
    }


    public void setStaffPosition(Position staffPosition) {
        this.staffPosition = staffPosition;
    }

    public String info() {
        String str = "姓名:" + this.staffName + "\n工号:" + this.staffNo + "\n性别:" + this.staffSex + "\n年龄:" + this.staffAge +
                "\n职务：" + this.staffDepartment.getDepartmentName() +this.staffPosition.getPositionName();
        return str;
    }
}
