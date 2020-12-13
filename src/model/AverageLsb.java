/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author master
 */
import java.awt.Color;
import java.awt.image.BufferedImage;

public class AverageLsb {

	public static void averageLsbAttackTopToBottom(BufferedImage image, double[] x, double[] average, int size)
	{
		int width = image.getWidth();
		int height = image.getHeight();
		int block = 0;
		int nbBytes = 1;
		int lsbRed, lsbGreen, lsbBlue;
		
		for(int i=0; i<average.length; i++)
		{
			average[i] = 0;
			x[i] = i;
		}
		for(int j=0; j<height; j++)
		{
			for(int i=0; i<width; i++)
			{						
				if(block < average.length)
				{				
					lsbRed = (new Color(image.getRGB(i, j)).getRed()) & 0x01;
					average[block] += (double) lsbRed;
					nbBytes++;
					
					if(nbBytes > size)
					{
						average[block] /= (double) size;
						block++;
						nbBytes = 1;
					}
				}		
				
				if(block < average.length)
				{
					lsbGreen = (new Color(image.getRGB(i, j)).getGreen()) & 0x01;
					average[block] += (double) lsbGreen;
					nbBytes++;
					if(nbBytes > size)
					{
						
						average[block] /= (double) size;
						block++;
						nbBytes = 1;
					}
				}

				if(block < average.length)
				{
					lsbBlue = (new Color(image.getRGB(i, j)).getBlue()) & 0x01;
					average[block] += (double) lsbBlue;
					nbBytes++;
					if(nbBytes > size)
					{
						average[block] /= (double) size;
						block++;
						nbBytes = 1;
					}
				}		
			}
		}
	}	
	
	public static void averageLsbAttackLeftToRight(BufferedImage image, double[] x, double[] average, int size)
	{
		int width = image.getWidth();
		int height = image.getHeight();
		int block = 0;
		int nbBytes = 1;
		int lsbRed, lsbGreen, lsbBlue;
		
		for(int i=0; i<average.length; i++)
		{
			average[i] = 0;
			x[i] = i;
		}

		for(int i=0; i<width; i++)
		{
			for(int j=0; j<height; j++)
			{						
				if(block < average.length)
				{				
					lsbRed = (new Color(image.getRGB(i, j)).getRed()) & 0x01;
					average[block] += (double) lsbRed;
					nbBytes++;
					
					if(nbBytes > size)
					{
						average[block] /= (double) size;
						block++;
						nbBytes = 1;
					}
				}		
				
				if(block < average.length)
				{
					lsbGreen = (new Color(image.getRGB(i, j)).getGreen()) & 0x01;
					average[block] += (double) lsbGreen;
					nbBytes++;
					if(nbBytes > size)
					{
						
						average[block] /= (double) size;
						block++;
						nbBytes = 1;
					}
				}

				if(block < average.length)
				{
					lsbBlue = (new Color(image.getRGB(i, j)).getBlue()) & 0x01;
					average[block] += (double) lsbBlue;
					nbBytes++;
					if(nbBytes > size)
					{
						average[block] /= (double) size;
						block++;
						nbBytes = 1;
					}
				}		
			}
		}
	}	
	
	public static void averageLsbAttackBottomToTop(BufferedImage image, double[] x, double[] average, int size)
	{
		int width = image.getWidth();
		int height = image.getHeight();
		int block = 0;
		int nbBytes = 1;
		int lsbRed, lsbGreen, lsbBlue;
		
		for(int i=0; i<average.length; i++)
		{
			average[i] = 0;
			x[i] = i;
		}

		for(int j=height-1; j>=0; j--)
		{
			for(int i=width-1; i>=0; i--)
			{						
				if(block < average.length)
				{				
					lsbRed = (new Color(image.getRGB(i, j)).getRed()) & 0x01;
					average[block] += (double) lsbRed;
					nbBytes++;
					
					if(nbBytes > size)
					{
						average[block] /= (double) size;
						block++;
						nbBytes = 1;
					}
				}		
				
				if(block < average.length)
				{
					lsbGreen = (new Color(image.getRGB(i, j)).getGreen()) & 0x01;
					average[block] += (double) lsbGreen;
					nbBytes++;
					if(nbBytes > size)
					{
						
						average[block] /= (double) size;
						block++;
						nbBytes = 1;
					}
				}

				if(block < average.length)
				{
					lsbBlue = (new Color(image.getRGB(i, j)).getBlue()) & 0x01;
					average[block] += (double) lsbBlue;
					nbBytes++;
					if(nbBytes > size)
					{
						average[block] /= (double) size;
						block++;
						nbBytes = 1;
					}
				}		
			}
		}
	}	
	
	public static void averageLsbAttackRightToLeft(BufferedImage image, double[] x, double[] average, int size)
	{
		int width = image.getWidth();
		int height = image.getHeight();
		int block = 0;
		int nbBytes = 1;
		int lsbRed, lsbGreen, lsbBlue;
		
		for(int i=0; i<average.length; i++)
		{
			average[i] = 0;
			x[i] = i;
		}

		for(int i=width-1; i>=0; i--)
		{
			for(int j=0; j<height; j++)
			{						
				if(block < average.length)
				{				
					lsbRed = (new Color(image.getRGB(i, j)).getRed()) & 0x01;
					average[block] += (double) lsbRed;
					nbBytes++;
					
					if(nbBytes > size)
					{
						average[block] /= (double) size;
						block++;
						nbBytes = 1;
					}
				}		
				
				if(block < average.length)
				{
					lsbGreen = (new Color(image.getRGB(i, j)).getGreen()) & 0x01;
					average[block] += (double) lsbGreen;
					nbBytes++;
					if(nbBytes > size)
					{
						
						average[block] /= (double) size;
						block++;
						nbBytes = 1;
					}
				}

				if(block < average.length)
				{
					lsbBlue = (new Color(image.getRGB(i, j)).getBlue()) & 0x01;
					average[block] += (double) lsbBlue;
					nbBytes++;
					if(nbBytes > size)
					{
						average[block] /= (double) size;
						block++;
						nbBytes = 1;
					}
				}		
			}
		}
	}	
}
