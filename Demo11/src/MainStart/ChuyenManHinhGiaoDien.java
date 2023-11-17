/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainStart;

import BanHang.BanHangPanel;
import Form.KhoHangPanel;
import Form.LogoMainPanel;
import Form.QuanLyPanel;
import Form.ThongKePanel;
import Form.TrangChu;
import helper.Auth;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class ChuyenManHinhGiaoDien {
    public List<DanhSachForm> listItem = null;
    private JPanel jpnRoot;
    private String kindSelection = "";

    public ChuyenManHinhGiaoDien(JPanel jpnRoot) {
        this.jpnRoot = jpnRoot;
    }

    public void setView(JPanel jpnItem, JLabel jlbItem) {
        kindSelection = "TrangChu";
        // Màu sắc
        jpnItem.setBackground(new Color(96, 100, 191));
        jlbItem.setBackground(new Color(96, 100, 191));

        jpnRoot.removeAll();
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(new LogoMainPanel());
        jpnRoot.validate();
        jpnRoot.repaint();
    }

    public void setEvent(List<DanhSachForm> listItem) {
        this.listItem = listItem;
        for (DanhSachForm item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }

    public class LabelEvent implements MouseListener {

        private JPanel node; // nơi lưu trữ các pannel
        private String kind; // phân loại chức năng của nút
        private JPanel jpnItem;
        private JLabel lblItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel lblItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.lblItem = lblItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
//            if (Auth.isLogin()) {

                switch (kind) {
                    case "TrangChu": 
                        node = new LogoMainPanel(); // Hiển thị form 
                        break;
                    case "BanHang":
                        node = new BanHangPanel();
                        break;
                    case "QuanLy":
                        node = new QuanLyPanel();
                        break;
                    case "KhoHang":
                        node = new KhoHangPanel();
                        break;
//                    case "KhoaHoc":
//                        node = new KhoaHocPannel();
//                        break;
//                    case "ChuyenDe":
//                        node = new ChuyenDeJPanel();
//                        break;
                    case "ThongKe":
                        node = new ThongKePanel();
                        break;

                    default:
                        throw new AssertionError();
                }
                jpnRoot.removeAll();
                jpnRoot.setLayout(new BorderLayout());
                jpnRoot.add(node);
                jpnRoot.validate();
                jpnRoot.repaint();
                setChangeBackGroup(kind);
//            } else{
//                if (!Auth.isLogin()) {
//                    // MsgBox.alert(new MsgBox(), "Bạn phải đăng nhập mới sử dụng chức năng này!");
//                }
//            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelection = kind;
            jpnItem.setBackground(new Color(96, 100, 191));
            lblItem.setBackground(new Color(96, 100, 191));

        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(96, 100, 191));
            lblItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kindSelection.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(76, 175, 80));
                lblItem.setBackground(new Color(76, 175, 80));
            }
        }

        public void setChangeBackGroup(String kind) {
            for (DanhSachForm item : listItem) {
                if (item.getKind().equalsIgnoreCase(kind)) {
                    item.getJpn().setBackground(new Color(96, 100, 191));
                    item.getJlb().setBackground(new Color(96, 100, 191));
                } else {
                    item.getJpn().setBackground(new Color(76, 175, 80));
                    item.getJlb().setBackground(new Color(76, 175, 80));
                }
            }
        }
    }
}
