import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class jtableexp extends JFrame{
	
	JTable j;
	jtableexp()
	{
		setTitle("Example of JTable");
        String[][] d= {
			{ "Rounak Kalbhawar", "994900", "CSE" },
			{ "Ashat Singhai", "842100", "BBA" },
			{ "Ayush Mukati", "569000", "IT" }
		};
        String[] c= { "Name", "SALARY", "Department" };
        j = new JTable(d,c);
		j.setBounds(100,100,220,320);
        JScrollPane sp = new JScrollPane(j);
		add(sp);
		setSize(600,600);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new jtableexp();
	}
}
