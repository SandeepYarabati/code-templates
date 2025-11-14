package strategyPattern;

public class NullCompressionStrategy implements CompressionStrategy{

	@Override
	public void compress() {
		System.out.println("cannot be compressed");
		
	}

	

}
