package cn.yaozhiyuan.crm.test;

import cn.yaozhiyuan.crm.model.Department;
import cn.yaozhiyuan.crm.model.Position;
import cn.yaozhiyuan.crm.model.Staff;

public class CrmTest {
    public static void main(String[] args) {
        Position p1 = new Position("P001", "经理");
        Position p2 = new Position("P002", "助理");
        Position p3 = new Position("P003", "职员");
        Department d1=new Department("D001","人事部");
        Department d2=new Department("D002","市场部");
        Staff s1 = new Staff("张铭","S001",29,"男",p1);
        Staff s2 = new Staff("李爱爱","S002",21,"女",p2);
        Staff s3 = new Staff("孙超","S003",29,"男",p3);
        Staff s4 = new Staff("张美美","S004",26,"女",p3);
        Staff s5 = new Staff("蓝迪","S005",37,"男",p1);
        Staff s6 = new Staff("米莉","S006",24,"女",p3);
        d1.addStaff(s1);d1.addStaff(s2);d1.addStaff(s3);
        d2.addStaff(s4);d2.addStaff(s5);d2.addStaff(s6);

        System.out.println(s1.info());
        System.out.println("===========================================");
        System.out.println(s2.info());
        System.out.println("===========================================");
        System.out.println(s3.info());
        System.out.println("===========================================");
        System.out.println(s4.info());
        System.out.println("===========================================");
        System.out.println(s5.info());
        System.out.println("===========================================");
        System.out.println(s6.info());
        System.out.println("===========================================");

        System.out.println(d1.show());
        System.out.println(d2.show());


    }

}
