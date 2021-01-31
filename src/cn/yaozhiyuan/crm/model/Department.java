package cn.yaozhiyuan.crm.model;

public class Department {

    //类型描述：能够描述部门编号、部门名称、员工数组、统计部门中的员工个数
    //
    //       要求：设定方法统计该部门员工个数
    //
    //       提示：部门类的属性有四个，分别是部门编号，部门名称，员工数组 和 统计变量 ，
    //
    //                 具体是市场部还是人事部，是通过部门类的对象来表示的，如果是市场部的对象，
    //
    //                 那么添加并统计的就是市场部的人数，同样如果是人事部的对象，
    //
    //                 添加并统计的就是人事部的人数
    private String departmentNo;
    private String departmentName;
    private Staff[] staff;
    private int count;

    public Department() {
    }

    public Department(String departmentNo, String departmentName) {
        this.setDepartmentNo(departmentNo);
        this.setDepartmentName(departmentName);
    }

    public Department(String departmentNo, String departmentName, Staff[] staff, int count) {
        this.setDepartmentNo(departmentNo);
        this.setDepartmentName(departmentName);
        this.setStaff(staff);
        this.setCount(count);
    }

    public String getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(String departmentNo) {
        this.departmentNo = departmentNo;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Staff[] getStaff() {
        if (this.staff == null) {
            this.staff = new Staff[200];
        }
        return staff;
    }

    public void setStaff(Staff[] staff) {

        this.staff = staff;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void addStaff(Staff staff) {
        int i;
        for (i = 0; i < this.getStaff().length; i++) {
            if (this.getStaff()[i] == null) {
                staff.setStaffDepartment(this);
                this.getStaff()[i] = staff;
                break;
            }
        }
        this.count = i + 1;

    }


    public String show() {
        String str = this.departmentName + "总共有" + this.count+"名员工";
        return str;
    }

}
