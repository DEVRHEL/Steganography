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

import org.apache.commons.math3.stat.inference.ChiSquareTest;


public class ChiSquare {
	
	public static void chiSquareAttackTopToBottom(BufferedImage image, double[] x, double[] chi, int size)
	{
		int width = image.getWidth();
		int height = image.getHeight();
		int block = 0;
		int nbBytes = 1;
		int red, green, blue;
		int[] values = new int[256];
		double[] expectedValues = new double[128];
		long[] pov = new long[128];
		System.out.println("bắt đầu lặp");
		for(int i=0; i<values.length; i++)
		{
			values[i] = 1;
			// x[i] = i; // x la so block
		}
                for (int i=0; i<x.length; i++)
                {
                    x[i] = i;
                }
                System.out.println("Đã xuống đây");
                // 1. dau tien no se dem số lần xuất hiện các giá trị màu vào mảng values
                // 2. No se chay tung hang hoac cot tuy theo dang tu tren xuong, duoi len, trai phai, phai trai thì cu 2048/lan chay
                // 3. Neu sau khi dem het vượt ngưỡng size là block thi dung lại va xu ly Chi-Square
                // 4. Sau do xu ly tiep cho den khi het pixel anh
		for(int j=0; j<height; j++)
		{
			for(int i=0; i<width; i++)
			{
				if(block < chi.length)
				{	
					red = (new Color(image.getRGB(i, j))).getRed();
					values[red]++;
					nbBytes++;
					if(nbBytes > size)
					{
						for(int k=0; k<expectedValues.length; k++)
						{
							expectedValues[k] = (values[2*k]+values[2*k+1])/2;
							pov[k] = values[2*k];
						}
						chi[block] = new ChiSquareTest().chiSquareTest(expectedValues, pov);
						block++;
						nbBytes = 1;
						/*for(int m=0; m<values.length; m++)
						{
							values[m] = 1;
						}*/
					}
				}
				
				if(block < chi.length)
				{
					green = (new Color(image.getRGB(i, j))).getGreen();
					values[green]++;
					nbBytes++;
					if(nbBytes > size)
					{
						for(int k=0; k<expectedValues.length; k++)
						{
							expectedValues[k] = (values[2*k]+values[2*k+1])/2;
							pov[k] = values[2*k];
						}
						chi[block] = new ChiSquareTest().chiSquareTest(expectedValues, pov);
						block++;
						nbBytes = 1;
						/*for(int m=0; m<values.length; m++)
						{
							values[m] = 1;
						}*/
					}
				}

				if(block < chi.length)
				{
					blue = (new Color(image.getRGB(i, j))).getBlue();
					values[blue]++;			
					nbBytes++;
					if(nbBytes > size)
					{
						for(int k=0; k<expectedValues.length; k++)
						{
							expectedValues[k] = (values[2*k]+values[2*k+1])/2;
							pov[k] = values[2*k];
						}
						chi[block] = new ChiSquareTest().chiSquareTest(expectedValues, pov);
						block++;
						nbBytes = 1;
						/*for(int m=0; m<values.length; m++)
						{
							values[m] = 1;
						}*/
					}
				}
			}
		}
	}
	
}
