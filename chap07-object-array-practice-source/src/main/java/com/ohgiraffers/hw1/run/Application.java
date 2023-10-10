package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {
    public static void main(String[] args) {
        EmployeeDTO[] employeeDTOs = new EmployeeDTO[3];

        employeeDTOs[0] = new EmployeeDTO();
        employeeDTOs[1] = new EmployeeDTO(
                1,
                "홍길동",
                19,
                'M',
                "01022223333",
                "서울 잠실");
        employeeDTOs[2] = new EmployeeDTO(
                2,
                "강말순",
                "교육부",
                "강사",
                20,
                'F',
                1000000,
                0.01,
                "01011112222",
                "서울 마곡");

        for (int i = 0; i < employeeDTOs.length; i++) {
            System.out.println("emp[" + i + "] : " + employeeDTOs[i].information());
        }
        System.out.println("========================================================================================");

        employeeDTOs[0].setEmpNo(0);
        employeeDTOs[0].setEmpName("김말똥");
        employeeDTOs[0].setDept("영업부");
        employeeDTOs[0].setJob("팀장");
        employeeDTOs[0].setAge(30);
        employeeDTOs[0].setGender('M');
        employeeDTOs[0].setSalary(3000000);
        employeeDTOs[0].setBonusPoint(0.2);
        employeeDTOs[0].setPhone("01055559999");
        employeeDTOs[0].setAddress("전라도 광주");
        System.out.println("emp[0] : " + employeeDTOs[0].information());

        employeeDTOs[1].setDept("기획부");
        employeeDTOs[1].setJob("부장");
        employeeDTOs[1].setSalary(4000000);
        employeeDTOs[1].setBonusPoint(0.3);
        System.out.println("emp[1] : " + employeeDTOs[1].information());
        System.out.println("========================================================================================");

        double sumSalary = 0.0;
        for (int i = 0; i < employeeDTOs.length; i++) {
            System.out.printf("%s의 연봉 : %d원\n",
                    employeeDTOs[i].getEmpName(),
                    (int) (employeeDTOs[i].getSalary() + (employeeDTOs[i].getSalary() * employeeDTOs[i].getBonusPoint())) * 12);
            sumSalary += (employeeDTOs[i].getSalary() + (employeeDTOs[i].getSalary() * employeeDTOs[i].getBonusPoint())) * 12;
        }
        System.out.println("========================================================================================");
        System.out.println("직원들의 연봉의 평균 : " + (int) (sumSalary / 3) + "원");
    }
}
