import java.awt.*;
import java.awt.event.*;
class feedback extends Frame
{
    TextField name,pass,feed;
    Button b1,b2;
   feedback()
    {
		 this.addWindowListener( new WindowAdapter()
  {
    public void windowClosing(WindowEvent we)
	{
	  System.exit(0);
	}
	});
		
        setLayout(new FlowLayout());
        this.setLayout(null);
        Label n=new Label("Name:",Label.CENTER);
        Label p=new Label("EMAIL ID:",Label.CENTER);
		Label f=new Label("Feedback:",Label.CENTER);
        name=new TextField(20);
        pass=new TextField(20);
		feed=new TextField(200);
        b1=new Button("submit");
        b2=new Button("cancel");
		
        this.add(n);
        this.add(name);
        this.add(p);
        this.add(pass);
		this.add(feed);
		this.add(f);
        this.add(b1);
        this.add(b2);
		
        n.setBounds(70,90,90,60);
        p.setBounds(70,130,90,60);
		f.setBounds(70,170,90,60);
        name.setBounds(200,100,90,20);
        pass.setBounds(200,140,90,20);
		feed.setBounds(200,180,200,100);
        b1.setBounds(100,300,80,60);
        b2.setBounds(180,300,80,60);
 
    }
	
	public void paint(Graphics g)
	 {
	    
		
		Font f=new Font("Arial",Font.BOLD,25);
		g.setFont(f);
		g.setColor(Color.blue);
		g.drawString("FEEDBACK PAGE",60,60);
		}
	
    public static void main(String args[])
    {
        feedback ml=new feedback();
        ml.setVisible(true);
        ml.setSize(400,400);
        ml.setTitle("my login window");
 
    }
}
