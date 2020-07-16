import java.awt.*;

class MainFrame
{
	public static void main(String gsar[] )
	{
		Frame ff = new Frame("MainFrame");
		Button b = new Button("Mainattacker");
		Button bb = new Button("Hello");
		Button bbb = new Button("I am ");
		Button bbbb = new Button("TMA");
		Button a = new Button("Tushar");
		Button aa = new Button("Singh");
		//ff.add(b);
		ff.setLayout(new GridLayout(2,3));
		ff.add(b);
		ff.add(bb);
		ff.add(bbb);
		ff.add(bbbb);
		ff.add(a);
		ff.add(aa);
		ff.setVisible(true);
		ff.setSize(555,666);
		//ff.setLayout(null);
		//ff.add(b);
	}
}