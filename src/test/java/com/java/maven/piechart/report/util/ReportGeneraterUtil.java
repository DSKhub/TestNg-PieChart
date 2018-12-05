package com.java.maven.piechart.report.util;

import java.io.File;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

public class ReportGeneraterUtil {

	public static void  generateChart(int pass,int fail,int skip ) throws Exception {
	      DefaultPieDataset dataset = new DefaultPieDataset( );
	      dataset.setValue("Pass", new Double( pass ));
	      dataset.setValue("Fail", new Double( fail ));
	      dataset.setValue("Skip", new Double( skip ));
	     
	      JFreeChart chart = ChartFactory.createPieChart(
	         "Pie chart Test Cases",   // chart title
	         dataset,          // data
	         true,             // include legend
	         true,
	         false);
	         
	      //simple pie chart
	      int width = 640;    //Width of the image 
	      int height = 480;   //Height of the image  
	      File pieChart = new File( "PieChart.jpeg" ); 
	      ChartUtilities.saveChartAsJPEG( pieChart , chart , width , height );
	      
	      //3D Pie Chart
	     /* final PiePlot3D plot = ( PiePlot3D ) chart.getPlot( );             
	      plot.setStartAngle( 270 );             
	      plot.setForegroundAlpha( 0.60f );             
	      plot.setInteriorGap( 0.02 );             
	      int width1 = 640;  //  Width of the image              
	      int height1 = 480;  // Height of the image                              
	      File pieChart3D = new File( "pie_Chart3D.jpeg" );                           
	      ChartUtilities.saveChartAsJPEG( pieChart3D , chart , width1 , height1 );  */
	   }

}
