package com.trthinh.mathutil.test.core;

import com.trthinh.mathutil.core.MathUtil;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author Tri Thinh
 */
public class MathUtilTest {    
    
    // day la class se su dung cac ham cua thu vien JUnit hay framework JUnit
    // de kiem thu code chinh - ham tinh Giai Thua
    // class core.MathUtil
    // biet code de test code chinh ben kia !!!
    
    // co quy tac dat ten ham kiem thu
    // nhung thuong se la muc dich cua cac case/tinh houng kiem thu
    // tinh huong xai hamtheo kieu thanh cong va that bai!!
    
    // ham duoi day la tinh houng test ham cahy thanh cong, tra ve ngon
    // ta se xai ham kieu well - dua 5!, 6! hok choi -5!, 30!
    
    //@Test JUnit se phoi hop voi JVM de chay ham nay
    //@Test phia hau truong chinh la public static void main()
    // Co nhieu @Test ung voi nhieu case khac nhau de kiem thu ham tinh giai thua
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n = 0; //test thu tinh huong tu tte dau vao, may phai chay dung
        long expected = 1; // hy vong rang 0! se = 1
        
        // long actual ; // goi ham can test ben core
        long actual = MathUtil.getFactorial(n);
        
        //so sanh dung expected vs. actual dung xanh xanh do do, framework
        Assert.assertEquals(expected,actual);
        
        //gop them cai case thanh cong/ dau vao ngon !!!
        Assert.assertEquals(1,MathUtil.getFactorial(1)); //t mun 1! == 1
        Assert.assertEquals(2,MathUtil.getFactorial(2)); //t mun 2! == 2
        Assert.assertEquals(6,MathUtil.getFactorial(3)); //t mun 3! == 6
        Assert.assertEquals(24,MathUtil.getFactorial(4)); //t mun 4! == 24
        Assert.assertEquals(120,MathUtil.getFactorial(5)); //t mun 5! == 120
        Assert.assertEquals(720,MathUtil.getFactorial(6)); //t mun 6! == 720
        
    } // ham giup so sanh 2 gia tri nao do co giong nhau hay ko
    // neu giong nhau thi no -> thay mau xanh den duong - duong thong, code ngon
    //                                          it nhat cho case dang test
    //neu khong giong nhau thi no -> neu thay mau do den duong
    //                                          ham y expected va actual ko giong nhau
    
    //------------------------------------------------------------------------
    // h??m getF() ta thi???t k??? c?? 2 t??nh hu???ng x??? l??
    //1. ????a data t??? t??? trong [0.20] -> t??nh ????ng ??c n! - done
    //2. dua data vao ca chon, am, > 20; THIET KE CUA HAM LA NEM RA NGOAI LE
    // TAO KI VONG NGOAI LE XUAT HIEN KHI N < 0 || N > 20
    //  rat mong ngoai le xuat hien voi n ca chon nay
    
    // neu ham nhan vao n < 0 hoac n > 20 va ham nem ra ngoai le
    //HAM CHAY DUNG NHU THIET KE -> XANH PHAI XUAT HIEN 
    
    // NEU HAM  nhan vao , < 0 hoac n > 20 va ham eo nem ra ngoai le
    // sure, HAM CHAY SAI THIET KE, SAI KI VONG, MAU DO
    
    //TEST CASE:
    //input: -5
    //expected: IllegalArgumentException xuat hien
    //tinh huong bat thuong, ngoai le ngaoi du tinh, du lieu
    //la nhung thu ko the do luong so sanh theo kieu value
    // ma chi co the do luong = cach chung co xuat hien hay ko
    //assertEquals() ko dung de so sanh 2 ngoai le
    // equals() la bang nhau hay ko tren value!!
    
    
    //MAU DO DO EM DO HAM DUNG LA CO NEM NGOAI LE THAT SU
    //              NHUNG KO PHAI LA NGOAI LE NHU KI VONG - THUC SU KI VONG SAI
    //              KO PHAI HAM NEM SAI
    /*@Test(expected = NumberFormatException.class)
    public void testGetFactorialGivenWronArgumentThrowsException(){
        MathUtil.getFactorial(-5); // ham @Test chay, hay ham getF() chay
                                    // se phai nem ve ngoai le NumberFormat...        
    }*/
    @Test (expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWronArgumentThrowsException(){
        MathUtil.getFactorial(-5); // ham @Test chay, hay ham getF() chay
                                    // se phai nem ve ngoai le NumberFormat...        
    }
    
    //c??ch kh??c ????? b???t ngo???i l??? xu???t hi???n, vi???t t??? nhi??n h??n!!
    //x??i Lambda
    //Test case: h??m s??? n??m v??? ngo???i l??? n???u nh???n v??o 21
    //tui c???n th???y m??u xanh khi ch??i v???i 21!
    
//    @Test
//    public void testGetFactorialGivenWronArgumentThrowsException_LambdaVersion(){
//        Assert.assertThrows(IllegalArgumentException.class,() -> MathUtil.getFactorial(21);
//        MathUtil.getFactorial(21);
//    }

      @Test
    public void testGetFactorialGivenWronArgumentThrowsException_LambdaVersion(){
            try {
              MathUtil.getFactorial(21);
              
            } catch (Exception e) {
              //b???t try catch l?? JUnit s??? ra xanh do ???? ch??? ?????ng ki???m so??t ngo???i l???
              //nh??ng ko chac91 ngo???i l??? m??nh c???n c?? xu??t hi???n hay ko??
              //c?? ??o???n code ki???m so??t ????ng ngo???i l??? IllegalArgumentException xh
              Assert.assertEquals("Invalid argument. N must be between 0..20",e.getMessage());              
            }        
    }
    
    
}
