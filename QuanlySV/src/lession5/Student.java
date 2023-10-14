
package lession5;

import java.util.Scanner;

public class Student {
    String rollno, fullname, birthday, gender, email, address;

    public Student() {
    }

    public Student(String rollno, String fullname, String birthday, String gender, String email, String address) {
        this.rollno = rollno;
        this.fullname = fullname;
        this.birthday = birthday;
        this.gender = gender;
        this.email = email;
        this.address = address;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "rollno=" + rollno + ", fullname=" + fullname + ", birthday=" + birthday + ", gender=" + gender + ", email=" + email + ", address=" + address + '}';
    }
    
    public void display() {
        System.out.println(this);
    }
    
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap MSV :");
        rollno = scan.nextLine();
        System.out.println("Nhap Ho va Ten :");
        fullname = scan.nextLine();
        System.out.println("Nhap Ngay Sinh (YYYY-MM-DD) :");
        birthday = scan.nextLine();
        System.out.println("Nhap Gioi Tinh :");
        gender = scan.nextLine();
        System.out.println("Nhap Email : ");
        email = scan.nextLine();
        System.out.println("Nhap Dia Chi :");
        address = scan.nextLine();
    }
}
