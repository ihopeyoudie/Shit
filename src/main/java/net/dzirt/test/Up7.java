package net.dzirt.test;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Up7 extends JFrame{


    public Up7 () {
        super("График по точкам");
        setSize(500, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel jcp = new JPanel(new BorderLayout());
        setContentPane(jcp);
        DrawingComponent dc = new DrawingComponent();
        jcp.add(dc, BorderLayout.CENTER);
        jcp.setBackground(Color.gray);
    }
   public void showFrame (){
        this.setVisible(true);
   }

    public static void main(String[] args) {
        Up7 view = new Up7();
        view.showFrame();
    }

}

class DrawingComponent extends JPanel {
    @Override
    protected void paintComponent(Graphics gh) {
        Graphics2D drp = (Graphics2D) gh;
        int[] x = new int[200];
        for (int i = 0; i < 200; i++){
            x[i] = i*2;
        }
        //int[] y = new int[200];
        int[] y = {554, 551, 548, 545, 543, 540, 538, 536, 533, 531, 530, 528, 526, 524, 522, 521, 519, 518, 516, 515, 514, 513, 512, 511, 511, 510, 509, 509, 508, 508, 507, 507, 506, 506, 505, 505, 505, 504, 504, 504, 503, 504, 504, 504, 505, 505, 505, 506, 506, 507, 507, 508, 508, 509, 509, 510, 511, 511, 512, 513, 514, 515, 516, 518, 519, 521, 522, 524, 526, 528, 530, 531, 533, 536, 538, 540, 543, 545, 548, 551, 554, 557, 560, 564, 568, 572, 576, 581, 586, 591, 597, 603, 610, 618, 627, 636, 647, 659, 673, 689, 708, 731, 759, 794, 840, 904, 980, 984, 989, 994, 999, 1005, 1011, 1019, 1027, 963, 914, 882, 863, 854, 852, 858, 871, 894, 930, 984, 1052, 1048, 1046, 1044, 1044, 1044, 1046, 1048, 1052, 1056, 1062, 1069, 1078, 1090, 1104, 1122, 1145, 1176, 1217, 1275, 1346, 1345, 1343, 1342, 1341, 1340, 1339, 1338, 1337, 1336, 1335, 1334, 1334, 1333, 1332, 1331, 1331, 1330, 1329, 1329, 1328, 1328, 1327, 1327, 1326, 1326, 1325, 1325, 1324, 1324, 1323, 1323, 1322, 1322, 1322, 1321, 1321, 1321, 1320, 1320, 1320, 1319, 1319, 1319, 1319, 1318, 1318, 1318, 1317, 1317, 1317, 1317, 1316, 1316};
        for (int i = 0; i < 200; i++){
            y[i] = y[i]/8;
            y[i] = 500-y[i];
        }
        drp.drawPolyline(x,y,200);
    }
}


//
///**
// * Created by Андрей on 29.03.2017.
// */

//
//class DrawingComponent extends JPanel {
//    private int[] xArray;
//    private int[] yArray;
//
//    public void createXArray(ArrayList<Integer> xa){
//        for(int i = 0; i < xa.size(); i++) {
//            xArray[i] = xa.get(i);
//        }
//    }
//
//    public void createYArray(ArrayList<Long> ya){
//        for(int i = 0; i < ya.size(); i++) {
//            yArray[i] = ya.get(i);
//        }
//    }
//
//    @Override
//    protected void paintComponent(Graphics gh) {
//        Graphics2D drp = (Graphics2D)gh;
//        drp.drawLine(20, 340, 20, 20);
//        drp.drawLine(20, 340, 460, 340);
//
//        //drp.drawPolyline(xArray, yArray, xArray.length);
//    }
//}
//
//public class Up7 extends JFrame{
//    //public  static int x[] =  {50, 100, 150, 200, 250};
//    //public  static int y[] =  {80, 200, 150, 320, 100};
//
//    ArrayList<Integer> xa = new ArrayList<Integer>();
//    ArrayList<Long> ya = new ArrayList<Long>();
//    public static int na;
//    // int n = 5;
//
//    public Up7 () {
//        super("График по точкам");
//        setSize(500, 400);
//        setLocationRelativeTo(null);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//    }
//
//    public void createPanel(){
//        JPanel jcp = new JPanel(new BorderLayout());
//        setContentPane(jcp);
//        DrawingComponent dc = new DrawingComponent();
//        jcp.add(dc, BorderLayout.CENTER);
//        jcp.setBackground(Color.gray);
//        dc.createXArray(xa);
//        dc.createYArray(ya);
//
//
//
//
//    }
//    public void showFrame(){
//        this.setVisible(true);
//    }
//
//    public void setXArray(ArrayList<Integer> xArray){
//        this.xa = xArray;
//    }
//    public void setYArray(ArrayList<Long> yArray){
//        this.ya = yArray;
//    }
//
//}