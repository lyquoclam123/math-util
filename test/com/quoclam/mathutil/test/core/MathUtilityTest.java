/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quoclam.mathutil.test.core;

import com.quoclam.mathutil.core.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LENOVO
 */
public class MathUtilityTest {
    
    //đây là class sẽ sử dụng các hàm của thư viện/framework để kiểm tra code chính - hàm tínhgiaithừa() bên 
    //class core.MathUtil
    //viết code để test code
    
    
    //có nhiểu quy tắc đặt tên hàm kiểm thử
    //nhưng thường sẽ nói lên mục đích của các case/tình huống kiểm thử
    //tình xuống xài hàm theo kiểu thành công và thất bại
    
    //hàm dưới đay là tình huống test hàm chạy thành công, trả về ngon
    //ta sẽ xài hàm kiểu well- đưa 5!, 6!, hok chơi đưa -5, 30!
    
    //@Test JUnit sẽ phối hợp vs JVMM để chay hàm này
    //@Test phía hậu trường chính là public static void main
    //có nhiểu @Test ừng vs nhiều case khác nhau để kiểm thử hàm tính giai thừa
    @Test
    public void testGetFacctorialGivenRightArgumentReturnsWell(){
        int n = 0;  //test thừ tình huống tử tế đầu vào và m phải chạy đúng
        long expected = 1;  //hy vọng 0! = 1
        
        //long actual = ; //gọi hàm cần test bên core/app chính/code chính
        long actual = MathUtil.getFactorial(n);
        
        //so sánh expected vs actual dùng xanh xanh đỏ đỏ, framwork
        assertEquals(expected, actual);
        
        //gộp thê vài case thành công nữa/đầu vào ngon
        assertEquals(1, MathUtil.getFactorial(1));  //tui mún 1! = 1
        assertEquals(2, MathUtil.getFactorial(2));  //tui mún 2! = 2
        assertEquals(6, MathUtil.getFactorial(3));  //tui mún 3! = 6
        assertEquals(24, MathUtil.getFactorial(4));  //tui mún 4! = 24
        assertEquals(120, MathUtil.getFactorial(5));  //tui mún 5! = 120
        assertEquals(720, MathUtil.getFactorial(6));  //tui mún 6! = 720
        
        
        //hàm giúp sosanh 2 vaue nào đó giống nhau hay ko
        //nếu giống nhau -> thày màu xanh đèn đường - đường thông, code ngon
        //                  ít nhất cho casedang9 test
        //nếu ko giống nhau -> thẩy màu đỏ đèn đường
        //                  hàm ý expected và actual ko giống nhau
    }
    
    //HÀM getF() ta thiết kê có 2 tình huống xử lí
    //1. đưa data tử tế trong [0..20] -> tính đúng d9c n! - done
    //2.đưa data vào cà chớn, âm > 20; THIẾT KẾ HÀM LÀ NÉM RA NGOẠI LỆ
    //TAO KÌ VỌNG NGOẠI LỆ XUẤT HIỆN KHI N < 0 || N > 20
    //rát mong ngoại lệ xuất hiện vs n cà chớn
    
    //nếu hàm nhận vào n < 0 || n > 20 và hàm ném ra ngoại lệ thì lúc này nói câu HÀM CHẠY ĐÚNG NHƯ THIẾT KẾ -> XANH
    
    //nếu hàm nhận vào n < 0 || n > 20 và hàm éo ném ra ngoại lệ thì sure HÀM CHẠY SAI KÌ VỌNG
    
    //Test case: input: -5
    //expectec: IlligalArgumentException xuất hiện
    //tình huông bất thường, ngoại lệ, ngoài dự tính, dự liệu
    //là những thứ ko thể đo lường = cách chúng có xuất hiện hay ko
    //AssertEquals() thì ko thể dùng so sánh 2 ngoại lệ
    //      equals() là bằng nhau trên value hay ko !!!!
    
    
    //MÀU ĐỎ ĐÓ EM, DO HÀM ĐÚNG LÀ CÓ NÉM NGOẠI LỆ THẬT SỰ NHƯNG KO PHẢI LÀ NGOẠI LỆ NHƯ KỲ VỌNG - THỰC SỰ KÌ VONGM KO PHẢI NÉM SAI
//    @Test(expected = NumberFormatException.class)
//    public void testGetFacctorialGivenWrongArgumentThrowsException(){
//        MathUtil.getFactorial(-5);  //hàm @Test chạy hay hàm getF() chạy sẽ phai ném ngoại lệ numberformat expection
//    }
    
    
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFacctorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5);  //hàm @Test chạy hay hàm getF() chạy sẽ phai ném ngoại lệ numberformat expection
    }
    
    //CÁCH KHÁC ĐỂ BẮT NGOẠI LỆ XUẤT HỆN, viết tự nhiên hơn
    //xài lambda
    //hàm sẽ ném về ngoại lệ nếu nhận vào 21
    //tui cần thấy màu xanh khi chơi vs 21 giai thừa
    @Test
    public void testGetFacctorialGivenWrongArgumentThrowsException_LambdaVersion(){
        //tham số 1: ngoại lệ mún so sánh, tham số 2: đoạn code chạy văng ra ngoại lệ
         //       Assert.assertThrows(IllegalArgumentException.class, 
           //             () -> MathUtil.getFactorial(-5) );
       // MathUtil.getFactorial(-5);  //hàm @Test chạy hay hàm getF() chạy sẽ phai ném ngoại lệ numberformat expection
    }
    
    //bắt ngoại lệ, xem hàm có ném về ngoại lệ hay ko khi n cà chớn
    @Test
    public void testGetFacctorialGivenWrongArgumentThrowsException_TryCatch(){
        //chủ động kiểm soát ngoại lệ
        try {
             MathUtil.getFactorial(-5);
        } catch (Exception e) {
            //bắt try-catch là đã chủ ding965 kiểm soát ngoại lệ nhưng ko chắc xuất hiện hay ko??
            //có đoạn code kiểm soát đúng ngoại lệ ILigalArgumentException xh
            assertEquals("Invalid argument, N must be between 0..20", e.getMessage());
        }
        
    }
}
