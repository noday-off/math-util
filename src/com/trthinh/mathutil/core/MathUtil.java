/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trthinh.mathutil.core;

/**
 *
 * @author Tri Thinh
 */
public class MathUtil {
    
    // trong class này cung cấp cho ai đó nhiều cái hàm xử lý toán học
    // clone classs Math của JDK
    // hàm thư viện xài chung cho ai đó, ko cân lưu lại trạng thái/ gái trị
    // chọn thiết kế là hàm static
    
    //hàm tính giai thừa !!
    // n! = 1.2.3.4...n
    //ko có giai thừa cho số âm
    // 0! = 1! = 1 quy ước
    // giai thau72 hàm đố thị dốc đứng, tăng nhanh về giá trị
    //20 giai thừa là 18 con số 0, vừa kịp đủ cho kiều long của java
    //21 giai thừa tràn kiều long
    //bài này quy ước tính n! trong khoảng từ 0..20
//    public static long getFactorial(int n){
//        if (n < 0 || n > 20){
//            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
//        }
//        if(n == 0 || n == 1){
//            return 1; // kết thúc cuộc chơi sớm nếu nhận nhung đầu vào đặc biệt            
//        }
//        long product = 1; // tích nhân dồn, thuật toán heo đất, ốc bu dồn thịt
//        
//        for (int i = 2; i <= n; i++) {
//            product *= i; // product = product * i;
//        }
//        return product;
//    }
    
    //Hoc de quy trong vong 30s
    //Hien tuong goi lai chinh minh voi 1 quy mo khac
    //Ví dụ: con búp bê Nga, giống nhau và lồng trong nhau
    //búp bê to, nhỏ hơn, nhỏ hơn nữa, .... đến đime63 dừng
    
    //tính giùm tui 6!
    //n! = 1.2.3.4.5.6. ... .n
    //6! = 6 x 5!
    //5! = 5 x 4!
    //4! = 4 x 3!
    //3! = 3 x 2!
    //2! = 2 x 1! điểm dừng
    //1! = 1;
    
    //chốt hạ: n! = n * (n - 1)!
    
    public static long getFactorial(int n){
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
        }
        if(n == 0 || n == 1){
            return 1; // kết thúc cuộc chơi sớm nếu nhận nhung đầu vào đặc biệt            
        }        
        return n * getFactorial(n-1);
    }
}
