package strategyPattern;

public class ZIPCompression implements CompressionStrategy{

	@Override
	public void compress() {
		System.out.println("Compressed to ZIP");
		
	}

}
