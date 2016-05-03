
package org.primefaces.examples;
 
import javax.annotation.PostConstruct;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;

import org.primefaces.model.chart.LineChartModel;

import org.primefaces.model.chart.LineChartSeries;
 
@ManagedBean
public class ChartView implements Serializable {
 
    private LineChartModel animatedModel1;
    private LineChartModel animatedModel2;
    
 
    @PostConstruct
    public void init() {
        createAnimatedModels();
    }
 
    public LineChartModel getAnimatedModel1() {
        return animatedModel1;
    }
    
    public LineChartModel getAnimatedModel2() {
        return animatedModel2;
    }
    
 
    
    private void createAnimatedModels() {
        animatedModel1 = initLinearModel();
        animatedModel1.setTitle("Mi peso anterior");
        animatedModel1.setAnimate(true);
        animatedModel1.setLegendPosition("se");
        Axis yAxis = animatedModel1.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(10);
        
        animatedModel2 = initLinearModel();
        animatedModel2.setTitle("Mi peso actual");
        animatedModel2.setAnimate(true);
        animatedModel2.setLegendPosition("se");
        yAxis = animatedModel2.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(15);
         
        
    }
     
   
    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();
 
        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Recomendación del medico");
 
        series1.set(1, 2);
        series1.set(2, 1);
        series1.set(3, 3);
        series1.set(4, 6);
        series1.set(5, 8);
        
        LineChartSeries series2 = new LineChartSeries();
        series2.setLabel("Mi peso");
 
        series2.set(1, 6);
        series2.set(2, 5);
        series2.set(3, 4);
        series2.set(4, 7);
        series2.set(5, 9);
 
        model.addSeries(series1);
        model.addSeries(series2);
        
        
         
        return model;
        
      
    }
    
    
    
=======
package org.primefaces.examples;
 
import javax.annotation.PostConstruct;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;

import org.primefaces.model.chart.LineChartModel;

import org.primefaces.model.chart.LineChartSeries;
 
@ManagedBean
public class ChartView implements Serializable {
 
    private LineChartModel animatedModel1;
    private LineChartModel animatedModel2;
    
 
    @PostConstruct
    public void init() {
        createAnimatedModels();
    }
 
    public LineChartModel getAnimatedModel1() {
        return animatedModel1;
    }
    
    public LineChartModel getAnimatedModel2() {
        return animatedModel2;
    }
    
 
    
    private void createAnimatedModels() {
        animatedModel1 = initLinearModel();
        animatedModel1.setTitle("Mi peso anterior");
        animatedModel1.setAnimate(true);
        animatedModel1.setLegendPosition("se");
        Axis yAxis = animatedModel1.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(10);
        
        animatedModel2 = initLinearModel();
        animatedModel2.setTitle("Mi peso actual");
        animatedModel2.setAnimate(true);
        animatedModel2.setLegendPosition("se");
        yAxis = animatedModel2.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(15);
         
        
    }
     
   
    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();
 
        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Recomendación del medico");
 
        series1.set(1, 2);
        series1.set(2, 1);
        series1.set(3, 3);
        series1.set(4, 6);
        series1.set(5, 8);
        
        LineChartSeries series2 = new LineChartSeries();
        series2.setLabel("Mi peso");
 
        series2.set(1, 6);
        series2.set(2, 5);
        series2.set(3, 4);
        series2.set(4, 7);
        series2.set(5, 9);
 
        model.addSeries(series1);
        model.addSeries(series2);
        
        
         
        return model;
        
      
    }
    
    
    
package org.primefaces.examples;
 
import javax.annotation.PostConstruct;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.DateAxis;
import org.primefaces.model.chart.LineChartSeries;
 
@ManagedBean
public class ChartView implements Serializable {
 
    private LineChartModel dateModel;
 
    @PostConstruct
    public void init() {
        createDateModel();
    }
 
    public LineChartModel getDateModel() {
        return dateModel;
    }
     
    private void createDateModel() {
        dateModel = new LineChartModel();
        LineChartSeries series1 = new LineChartSeries();
        dateModel.setLegendPosition("ne");
        series1.setLabel("Mi peso");
 
        series1.set("2016-01-01", 51);
        series1.set("2016-02-06", 60);
        series1.set("2016-03-12", 65);
        series1.set("2016-04-18", 57);
        series1.set("2016-05-24", 24);
       
 
        LineChartSeries series2 = new LineChartSeries();
        series2.setLabel("Recomendacion Medico");
 
        series2.set("2016-01-01", 32);
        series2.set("2016-02-06", 73);
        series2.set("2016-03-12", 24);
        series2.set("2016-04-18", 12);
        series2.set("2016-05-24", 74);
        
 
        dateModel.addSeries(series1);
        dateModel.addSeries(series2);
         
        dateModel.setTitle("Mi peso");
        
        dateModel.getAxis(AxisType.Y).setLabel("Peso");
        DateAxis axis = new DateAxis("Mes");
        axis.setTickAngle(-9);
        axis.setMax("2016-05-01");
        axis.setMax("2016-06-01");
        axis.setTickFormat("%b %#d, %y");
         
        dateModel.getAxes().put(AxisType.X, axis);
    }
}