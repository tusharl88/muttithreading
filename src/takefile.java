
public class takefile {
	public static void main(String [] args)
	{String xx="hi",yy="bi" ,zz="for", uu="me";
		downloader a = new downloader (xx);
		downloader b = new downloader (yy);
		downloader c = new downloader (zz);
		downloader d = new downloader (uu);
		
		a.start();
		b.start();
		c.start();
		d.start();
	}
	
}
