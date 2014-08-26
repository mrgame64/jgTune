import java.util.Scanner;
import java.lang.Math;

public abstract class MainActivity
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Wave Sampler\n(not for release)\n");
		System.out.println("Choose your wave:");
		System.out.println("\t1. Squar1e (pulse)");
		System.out.println("\t2. Triangle");
		System.out.println("\t3. Sine");
		System.out.println("\t4. Cosine");
		System.out.println("\t5. Sawtooth");
		System.out.println("\t6. White noise");
		//System.out.println("\t7. ");
		int wave = input.nextInt();
		
		System.out.print("Sample rate (Hz): ");
		int sampleRate = input.nextInt();
		System.out.print("Frequency (Hz): ");
		int freq = input.nextInt();
		
		System.out.println("Choose resolution (bits):");
		System.out.println("\t1. 8");
		System.out.println("\t2. 16");
		int resolution = input.nextInt();
		
		byte[] samples = new byte[sampleRate];
		
		switch(wave)
		{
		case 1:
			for(int i=0; i<sampleRate; i+=sampleRate/freq)
			{samples[i]=(byte) (Math.pow(2,resolution/2)*Math.sin(i/sampleRate*2*Math.PI));}
			break;
			
		case 2:
			
		}
	}

}
