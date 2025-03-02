import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestChanLe {
    TinhChanLe tinhChanLe = new TinhChanLe();
    @Test
    public void test() {
        Assertions.assertEquals("n la so chan",tinhChanLe.soChan(2) );
    }
    @Test
    public void test2() {
        Assertions.assertEquals("n la so chan",tinhChanLe.soChan(4) );
    }
    @Test
    public void test3() {
        Assertions.assertEquals("n la so chan",tinhChanLe.soChan(6) );
    }
    @Test
    public void test4() {
        Assertions.assertEquals("n la so le",tinhChanLe.soChan(9));

    }
    @Test
    public void test5() {
        Assertions.assertEquals("n la so chan",tinhChanLe.soChan(10) );
    }

    }
