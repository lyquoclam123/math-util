/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quoclam.mathutil.main;

import com.quoclam.mathutil.core.MathUtil;

/**
 *
 * @author Quoc Lam
 */
public class Main {
    public static void main(String[] args) {
        
        //thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay ko
        //ta phải đưa các tình huống sử dụng hàm trong thực tế
        //ví dụ: -5 coi tính đc ko
        //      0 coi tính mấy
        //      20 coi tính mấy
        //      21 coi tính mấy
        //TEST CASE: Một tình huống hàm/app/màn hình/ tính năng đc đưa vào sử dụng
        //giả lập hành vi xài của ai đó
        
        //TEST CASE là 1 tình huống sử dụng app, xài app(hàm) mà nó bao hàm/gồm: 
        //INPUT: data đầu vào cụ thể nào đó
        //OUPUT: ĐẦU RA ỨNG VS XỬ LÝ CỦA HÀM/CHỨC NĂNG CỦA APP, DĨ NHIÊN DÙNG ĐẦU VÀO ĐỂ XỬ LÝ
        //KỲ VỌNG:MONG HÀM TRẢ VỀ VALUE NÀO ĐÓ ỨNG VS INPUT Ở TRÊN
        //SOSANH ĐỂ XEM KÉT QUẢ CÓ NHƯ KỲ VỌNG HAY KO
        
        long expected = 120; //tao kì vọng hàm ói về 120 nếu tính 5!
        int n = 5;      //input
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected.");
        System.out.println("5! = " + actual + " actual.");
    }
}
