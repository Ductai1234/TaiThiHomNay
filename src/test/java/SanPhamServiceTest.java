import com.example.dangnguyenductai_260105.SanPham;
import com.example.dangnguyenductai_260105.SanPhamService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SanPhamServiceTest {
    SanPhamService sanPhamService = new SanPhamService();
    List<SanPham> list = new ArrayList<>();
    @BeforeEach
    public void setUp() {
        sanPhamService = new SanPhamService();
        list.add(new SanPham("1","Tai",10,100,12,"DucTai"));


    }
    @Test
    public void testSanPham() {
        sanPhamService.update(list,new SanPham("1","Taii",10,100,12,"DucTai"),0);

        String exp = "Taii";
        String act = list.get(0).getTen();
        Assertions.assertEquals(exp,act);

    }
    @Test
    public void testSanPham2() {
        sanPhamService.update(list,new SanPham("11","Tai",10,100,12,"DucTai"),0);

        String exp = "11";
        String act = list.get(0).getMa();
        Assertions.assertEquals(exp,act);

    }
    @Test
    public void testSanPham3() {
        sanPhamService.update(list,new SanPham("1","Tai",100,100,12,"DucTai"),0);

        int exp = 100;
        int act = list.get(0).getNamBaoHanh();
        Assertions.assertEquals(exp,act);

    }@Test
    public void testSanPham4() {
        sanPhamService.update(list,new SanPham("1","Tai",10,100,121,"DucTai"),0);

        int exp = 121;
        int act = list.get(0).getSoLuong();
        Assertions.assertEquals(exp,act);

    }@Test
    public void testSanPham5() {
        sanPhamService.update(list,new SanPham("1","Taiii",10,100,12,"DucTai"),0);

        String exp = "Taiii";
        String act = list.get(0).getTen();
        Assertions.assertEquals(exp,act);

    }


}
