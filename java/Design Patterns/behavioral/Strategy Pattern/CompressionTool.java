package strategyPattern;

public class CompressionTool {

	public static void main(String[] args) {
		Compressor zip = new Compressor(new ZIPCompression());
		Compressor rar = new Compressor(new RARCompression());
		Compressor z = new Compressor(new ZCompression());
		Compressor x = new Compressor(new NullCompressionStrategy());
		
		zip.compressFile();
		rar.compressFile();
		z.compressFile();
		x.compressFile();
	}

}
