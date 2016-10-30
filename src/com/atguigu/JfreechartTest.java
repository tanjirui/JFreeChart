package com.atguigu;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

public class JfreechartTest {

public static void main(String[] args) throws IOException {
	File file=new File("abc.jpg");
	JFreeChart chart = createChart(createDataset());
	ChartUtilities.saveChartAsJPEG(file, chart, 500, 270);
}
		
	
	private static JFreeChart createChart(PieDataset paramPieDataset)
	  {
	    JFreeChart localJFreeChart = ChartFactory.createPieChart3D("Pie Chart 3D Demo 2", paramPieDataset, true, false, false);
	    PiePlot3D localPiePlot3D = (PiePlot3D)localJFreeChart.getPlot();
	    localPiePlot3D.setStartAngle(270.0D);
	    localPiePlot3D.setDirection(Rotation.ANTICLOCKWISE);
	    localPiePlot3D.setForegroundAlpha(0.6F);
	    return localJFreeChart;
	  }

	  private static PieDataset createDataset()
	  {
	    DefaultPieDataset localDefaultPieDataset = new DefaultPieDataset();
	    localDefaultPieDataset.setValue("Java", new Double(43.200000000000003D));
	    localDefaultPieDataset.setValue("Visual Basic", new Double(10.0D));
	    localDefaultPieDataset.setValue("C/C++", new Double(17.5D));
	    localDefaultPieDataset.setValue("PHP", new Double(32.5D));
	    localDefaultPieDataset.setValue("Perl", new Double(12.5D));
	    return localDefaultPieDataset;
	  }
}
