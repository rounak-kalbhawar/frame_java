import javax.swing.*;
import java.awt.*;

public class boxLay extends Frame{

   boxLay(){
    Button b1=new Button("1");
    Button b2=new Button("2");
    Button b3=new Button("3");
    Button b4=new Button("4");
    Button b5=new Button("5");
    Button b6=new Button("6");
    Button b7=new Button("7");
    Button b8=new Button("8");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);

    }

    public static void main(String[] args) {

      boxLay b=new boxLay();
      b.setSize(600,600);
      b.setVisible(true);
      b.setLayout(new BoxLayout(b,BoxLayout.Y_AXIS));
      
    }
}
