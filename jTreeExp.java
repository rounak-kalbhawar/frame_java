import javax.swing.*;  
import javax.swing.tree.*;  
public class jtreeexp extends JFrame{  
  
   jtreeexp(){  
      
    DefaultMutableTreeNode sport=new DefaultMutableTreeNode("sport");  
    DefaultMutableTreeNode Indoor=new DefaultMutableTreeNode("Indoor");  
    DefaultMutableTreeNode Outdoor=new DefaultMutableTreeNode("Outdoor");  
    sport.add(Indoor);  
    sport.add(Outdoor);  
    DefaultMutableTreeNode chess=new DefaultMutableTreeNode("chess");  
    DefaultMutableTreeNode charrom=new DefaultMutableTreeNode("charrom");  
    DefaultMutableTreeNode cricket=new DefaultMutableTreeNode("cricket");  
    DefaultMutableTreeNode football=new DefaultMutableTreeNode("football");  
    Indoor.add(chess); 
	Indoor.add(charrom); 
	Outdoor.add(cricket); 
	Outdoor.add(football);      
    JTree jt=new JTree(sport);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
    add(jt);  
    setSize(400,400);  
    setVisible(true);  
}  
public static void main(String[] args) {  
    new jtreeexp();  
}}  
