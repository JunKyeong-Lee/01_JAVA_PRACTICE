package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        Scanner sc = new Scanner(System.in);

        System.out.print("번호 : ");
        employeeDTO.setNumber(sc.nextInt());
        sc.nextLine();
        System.out.print("이름 : ");
        employeeDTO.setName(sc.nextLine());
        System.out.print("부서 : ");
        employeeDTO.setDept(sc.nextLine());
        System.out.print("직책 : ");
        employeeDTO.setJob(sc.nextLine());
        System.out.print("나이 : ");
        employeeDTO.setAge(sc.nextInt());
        sc.nextLine();
        System.out.print("성별 : ");
        employeeDTO.setGender(sc.nextLine().charAt(0));
        System.out.print("급여 : ");
        employeeDTO.setSalary(sc.nextInt());
        System.out.print("BonusPoint : ");
        employeeDTO.setBonusPoint(sc.nextDouble());
        sc.nextLine();
        System.out.print("휴대폰 번호 : ");
        employeeDTO.setPhone(sc.nextLine());
        System.out.print("주소 : ");
        employeeDTO.setAddress(sc.nextLine());


        System.out.println(employeeDTO.getNumber());
        System.out.println(employeeDTO.getName());
        System.out.println(employeeDTO.getDept());
        System.out.println(employeeDTO.getJob());
        System.out.println(employeeDTO.getAge());
        System.out.println(employeeDTO.getGender());
        System.out.println(employeeDTO.getSalary());
        System.out.println(employeeDTO.getBonusPoint());
        System.out.println(employeeDTO.getPhone());
        System.out.println(employeeDTO.getAddress());
    }
}
