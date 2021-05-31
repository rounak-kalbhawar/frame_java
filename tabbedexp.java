import java.awt.*;
import javax.swing.*;
/
public class TabbedExp extends FrameDemo {

    private static void setTitle(String string) {
        
    }

    private static void setSize(int i, int i0) {
        
    }

    private static void setVisible(boolean b) {
        
        
    }

    private static void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        
    }
    TabbedExp()
    {
        Container c1= getContentPane();
        JTabbedPane jt= new JTabbedPane();
        jt.addTab("Capitals", new Capital());
        jt.addTab("state", new state());
        c1.add(jt);
        
    }
    
    public static void main(String args[])
            
    {
    
        setTitle("JTabbed Pane Example");
        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

   
  

    
}
class Capital extends JPanel{
    Capital()
    {
        JButton b1= new JButton("Capital 1");
        JButton b2= new JButton("Capital 2");
        JButton b3= new JButton("Capital 3");
        
        add(b1);
        add(b2);
        add(b3);
    }
}
  class state extends JPanel
  {
      state()
      {
          JCheckBox c1 = new JCheckBox("state1");
          JCheckBox c2 = new JCheckBox("state2");
          JCheckBox c3 = new JCheckBox("state3");
          
           add(c1);
           add(c2);
           add(c3);
      }
      
  }
