package strategyPattern;

public class ZCompression  implements CompressionStrategy{

	@Override
	public void compress() {
		System.out.println("Compressed to Z");
		
	}

}
