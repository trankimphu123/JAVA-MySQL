
package GUI;

import java.util.Date;
import BUS.*;
import DTO.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Trần Kim Phú
 */
public class ThongKeGUI extends javax.swing.JPanel {
    DefaultTableModel modelSachMuon = new DefaultTableModel();
    DefaultTableModel modelDocGia = new DefaultTableModel();

    /**
     * Creates new form ThongKeGUI
     */
    public ThongKeGUI() {
        initComponents();
        modelSachMuon = (DefaultTableModel) tbl_TK1.getModel();
        modelDocGia = (DefaultTableModel) tbl_TK2.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_TK2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_TK1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTong1 = new javax.swing.JTextField();
        dateTK1BD = new com.toedter.calendar.JDateChooser();
        dateTK1KT = new com.toedter.calendar.JDateChooser();
        dateTK2BD = new com.toedter.calendar.JDateChooser();
        dateTK2KT = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(989, 641));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("THỐNG KÊ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tbl_TK2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Họ tên độc giả", "Số lượng mượn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_TK2);

        tbl_TK1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tên Sách", "Số lượng mượn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_TK1);

        jLabel2.setText("Từ ngày");

        jLabel3.setText("Đến ngày");

        jLabel4.setText("Đến ngày");

        jLabel5.setText("Từ ngày");

        jLabel6.setText("Tổng số sách");

        txtTong1.setEditable(false);

        jButton1.setText("Duyệt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Duyệt");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Top độc giả mượn nhiều sách nhất");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Số lượng sách đã mượn");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(41, 41, 41)
                        .addComponent(txtTong1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dateTK1BD, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateTK1KT, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(83, 83, 83))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(28, 28, 28)
                                .addComponent(dateTK2BD, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(31, 31, 31)
                                .addComponent(dateTK2KT, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(177, 177, 177)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(569, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(dateTK2BD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateTK2KT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 158, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(dateTK1BD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dateTK1KT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addComponent(jButton1)
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTong1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(479, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
       String ngayBD = formatter.format(dateTK1BD.getDate());
       String ngayKT = formatter.format(dateTK1KT.getDate());
       PhieuMuonBUS pmbus = new PhieuMuonBUS();
       if(PhieuMuonBUS.dspm==null)
           try {
               pmbus.DocPM();
       } catch (Exception ex) {
           Logger.getLogger(ThongKeGUI.class.getName()).log(Level.SEVERE, null, ex);
       }
       ArrayList<PhieuMuonDTO> list = null;
        try {
            list = pmbus.timTheoNgay(ngayBD, ngayKT);
        } catch (ParseException ex) {
            Logger.getLogger(ThongKeGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       if(list.isEmpty()){
           JOptionPane.showMessageDialog(null, "Thời gian này chưa có sách được mượn");
       }else{
                int tong = 0;
                modelSachMuon.setRowCount(0);
                modelSachMuon = (DefaultTableModel) tbl_TK1.getModel();
                DauSachBUS bus_ds = new DauSachBUS();
                        try {
                            bus_ds.DocDS();
                        } catch (Exception ex) {
                            Logger.getLogger(ThongKeGUI.class.getName()).log(Level.SEVERE, null, ex);
                        }
                for(PhieuMuonDTO pm : list){
                    // tim chi tiet pm theo ma pm
                    ChiTietPhieuMuonBUS ct = new ChiTietPhieuMuonBUS();
                    try {
                        ct.DocDSCTPM(Integer.toString(pm.getMaPM()));
                    } catch (Exception ex) {
                        Logger.getLogger(ThongKeGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    // tim sach
                    for(ChiTietPhieuMuonDTO ctpm : ChiTietPhieuMuonBUS.dsphieumuon){
                        
                        int maDS = ctpm.getMaDS();
                        System.out.println("mã ds: " +maDS);
                        
                        String tenSach= bus_ds.timTentheoMaDS(maDS);
                        Vector row = new Vector();
                        row.add(tenSach);
                        row.add(ctpm.getSoluong());
                        modelSachMuon.addRow(row);
                        tong+= ctpm.getSoluong();
                    }     
                }
                tbl_TK1.setModel(modelSachMuon);
                txtTong1.setText(Integer.toString(tong));
                
       }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
       String ngayBD = formatter.format(dateTK2BD.getDate());
       String ngayKT = formatter.format(dateTK2KT.getDate());
       PhieuMuonBUS pmbus = new PhieuMuonBUS();
       if(PhieuMuonBUS.dspm==null)
           try {
               pmbus.DocPM();
       } catch (Exception ex) {
           Logger.getLogger(ThongKeGUI.class.getName()).log(Level.SEVERE, null, ex);
       }
       ArrayList<PhieuMuonDTO> list = null;
        try {
            list = pmbus.timTheoNgay(ngayBD, ngayKT);
        } catch (ParseException ex) {
            Logger.getLogger(ThongKeGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       if(list.isEmpty()){
           JOptionPane.showMessageDialog(null, "Thời gian này chưa có độc giả mượn sách");
       }else{
                
                modelDocGia.setRowCount(0);
                modelDocGia = (DefaultTableModel) tbl_TK2.getModel();
                /// danh sach the thu vien
                DocGiaBUS bus_dg = new DocGiaBUS();
                DocGiaBUS.dsdg = null;
                        try {
                            bus_dg.DocDSDG();
                           
                        } catch (Exception ex) {
                            Logger.getLogger(ThongKeGUI.class.getName()).log(Level.SEVERE, null, ex);
                        }
                for(PhieuMuonDTO pm : list){
                    int tongSach_PM = 0;
                    
                    // tim chi tiet pm theo ma pm
                    ChiTietPhieuMuonBUS ct = new ChiTietPhieuMuonBUS();
                    try {
                        ct.DocDSCTPM(Integer.toString(pm.getMaPM()));
                    } catch (Exception ex) {
                        Logger.getLogger(ThongKeGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    for(ChiTietPhieuMuonDTO ctpm : ChiTietPhieuMuonBUS.dsphieumuon){
                        
                       
                        
                        tongSach_PM+= ctpm.getSoluong();
                    }
                    
                    
                    //tim danh sach doc gia theo ma the tv
                    // trong 1 phiếu mượn có thể có nhiều độc giả ?????? logic ???????
                    int maTheTV = pm.getMatheTV();
                    try {
                        ArrayList<DocGiaDTO> listDocGia = bus_dg.timkiemtheoMaThe(maTheTV);
                        for(DocGiaDTO dg : listDocGia){
                            for(DocGiaDTO dg1 : DocGiaBUS.dsdg){
                                if(dg.getMaDG()== dg1.getMaDG())
                                    dg1.setSl_sachmuon(dg1.getSl_sachmuon() + tongSach_PM);
                            }
                            
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(ThongKeGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        
                    
                }
                // sap xeep theo top giam dan
                int tg;
                for(int i = 0; i < DocGiaBUS.dsdg.size() - 1; i++){
                    for(int j = i + 1; j < DocGiaBUS.dsdg.size(); j++){
                        if(DocGiaBUS.dsdg.get(i).getSl_sachmuon() < DocGiaBUS.dsdg.get(j).getSl_sachmuon()){
                            DocGiaDTO dt = new DocGiaDTO();
                            dt = DocGiaBUS.dsdg.get(i);
                            DocGiaBUS.dsdg.set(i, DocGiaBUS.dsdg.get(j)) ;
                            DocGiaBUS.dsdg.set(j, dt) ;
                        }
                    }
                }
                for(DocGiaDTO dg1 :DocGiaBUS.dsdg){
                    Vector row = new Vector();
                    row.add(dg1.getHoDG()+" " + dg1.getTenDG());
                    row.add(dg1.getSl_sachmuon());
                    modelDocGia.addRow(row);
                }
                
                
                tbl_TK2.setModel(modelDocGia);
                
                
       }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dateTK1BD;
    private com.toedter.calendar.JDateChooser dateTK1KT;
    private com.toedter.calendar.JDateChooser dateTK2BD;
    private com.toedter.calendar.JDateChooser dateTK2KT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbl_TK1;
    private javax.swing.JTable tbl_TK2;
    private javax.swing.JTextField txtTong1;
    // End of variables declaration//GEN-END:variables

}
