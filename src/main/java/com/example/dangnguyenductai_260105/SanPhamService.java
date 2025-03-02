package com.example.dangnguyenductai_260105;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    public void update(List<SanPham> list, SanPham sanPham , int index) {
        list.set(index, sanPham);
    }
    List<SanPham> getListSanPham() {
        List<SanPham> list = new ArrayList<SanPham>();
        return list;
    }
}
