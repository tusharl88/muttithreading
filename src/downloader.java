
public class downloader extends Thread {
	
		private String url;
		public downloader(String url)
		{ this.url = url;
		}
		public void run()
	{ 
			downloadfile df = new downloadfile();
			System.out.println(df.filedownload(this.url));
	}
	}

