package Motorbike;

public class Motorrunner {

	public static void main(String[] args) {
		
		Motorfunc ducati = new Motorfunc();
		Motorfunc pulsar = new Motorfunc();
		
		ducati.start();
		pulsar.start();
		pulsar.stopped();
		ducati.stopped();
		

	}

}
