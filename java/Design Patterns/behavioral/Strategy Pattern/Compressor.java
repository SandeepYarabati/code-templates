package strategyPattern;

public class Compressor {
	private CompressionStrategy strategy;

	public Compressor(CompressionStrategy strategy) {
		this.strategy=strategy;
	}
	
	void compressFile() {
		strategy.compress();
	}

}
