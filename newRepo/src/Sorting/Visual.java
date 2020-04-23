package newRepo.src.Sorting;

import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Visual extends JPanel {
    ArrayList<Integer> arrayList;
    int max;
    Visual() {
        setPreferredSize(new Dimension(View.width,View.height));
        setOpaque(false);
        setVisible(true);
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        int listSize = arrayList.size();
        
        double doubWidth = (double) View.width / listSize;
        int rectWidth = (int) Math.round(doubWidth);
        
        double doubHeight = (double) View.height / max;
        int UnitSize = (int) Math.round(doubHeight);
        
        int arrayIndex = 0;
        for (int i : arrayList) {
            int rectHeight = UnitSize * i;
            int x_coord = rectWidth * arrayIndex;
            int y_coord = View.height - rectHeight;
            g2d.setColor(new Color(153, 255, 204));
            g2d.fillRect(x_coord, y_coord, rectWidth, rectHeight);
            g2d.setColor(Color.BLACK);
            g2d.drawRect(x_coord, y_coord, rectWidth, rectHeight);
            arrayIndex++;
        }
    }
    
    public void setArrayList(ArrayList<Integer> list) {
        arrayList = list;
        max = Collections.max(arrayList);
    }
    
    public void clear() {
        arrayList = null;
        max = 0;
    }
}