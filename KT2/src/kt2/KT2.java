/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kt2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author kimdo
 */
public class KT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Danh sách các môn học
        List<String> allCourses = new ArrayList<>(Arrays.asList("Math", "Physics", "Chemistry", "Biology", "History"));

        // Danh sách môn học đã gửi
        List<String> requestedCourses = new ArrayList<>(Arrays.asList("Math", "Chemistry", "History"));

        while (!canRegisterForAllCourses(allCourses, requestedCourses)) {
            // Nếu không thể đăng ký tất cả các môn, loại bỏ môn ít quan trọng nhất
            String leastImportantCourse = findLeastImportantCourse(allCourses, requestedCourses);
            allCourses.remove(leastImportantCourse);
        }

        System.out.println("Phương án đăng ký môn học:");
        for (String course : requestedCourses) {
            System.out.println(course);
        }
    }

    // Kiểm tra xem có thể đăng ký tất cả các môn học đã gửi
    public static boolean canRegisterForAllCourses(List<String> allCourses, List<String> requestedCourses) {
        return allCourses.containsAll(requestedCourses);
    }

    // Tìm môn học ít quan trọng nhất trong danh sách đã gửi
    public static String findLeastImportantCourse(List<String> allCourses, List<String> requestedCourses) {
        for (String course : allCourses) {
            if (requestedCourses.contains(course)) {
                return course;
            }
        }
        return null;
    
    }
    
}
