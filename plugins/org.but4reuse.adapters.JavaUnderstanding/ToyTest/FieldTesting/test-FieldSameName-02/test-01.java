package ToyTest;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 * diese Klasse beinhaltet eine Entity, die als Animation abl�uft
 * Es wird ein Bild �bergeben, was aus mehreren Teilbilder besteht
 * und bei jeden Spielschritt wird geschaut, ob genug Zeit vergangen ist
 * um den n�chsten Frame anzuzeigen
 * @author Dirk Aporius
 *
 */
public class A  {
	
	
	private int frame;
	
	private int tiless;
	
	private int direction;
	

	private int maxDirection;
	
	
	private long time;

	private long curTime;
	
	private boolean bLoop;
	
	private boolean bAnimation;
	
	private final boolean bRGB;
	

	private BufferedImage[][] images;
	

	
	

	
	
}
