package strategyPattern;

public class RARCompression implements CompressionStrategy{

	@Override
	public void compress() {
		System.out.println("compressed to RAR");
		
	}

}
