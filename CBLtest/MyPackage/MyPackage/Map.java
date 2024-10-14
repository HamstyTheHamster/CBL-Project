package MyPackage;

import javax.swing.JPanel;

public class Map extends JPanel{
    int a;
    public Map(){
        //this.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
        this.setLayout(new GridLayout(10, 15));
        this.setBackground(Color.BLACK);
        for (int i = 1; i <= 150; i++){
            if (a == 0) {

            } else if (a == 1){

            } else if (a == 2){

            }
        }
    }

}
