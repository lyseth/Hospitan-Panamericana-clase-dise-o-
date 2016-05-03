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
        series1.setLabel("Nivel Coresterol");
 
        series1.set("2016-01-01", 51);
        series1.set("2016-02-06", 25);
        series1.set("2016-03-12", 30);
        series1.set("2016-04-18", 20);
        series1.set("2016-05-24", 24);
       
 
        LineChartSeries series2 = new LineChartSeries();
        series2.setLabel("Recomendacion Medico");
 
        series2.set("2016-01-01", 42);
        series2.set("2016-02-06", 22);
        series2.set("2016-03-12", 30);
        series2.set("2016-04-18", 22);
        series2.set("2016-05-24", 24);
        
 
        dateModel.addSeries(series1);
        dateModel.addSeries(series2);
         
        dateModel.setTitle(" Mi Nivel De Coresterol");
        
        dateModel.getAxis(AxisType.Y).setLabel("Nivel Coresterol");
        DateAxis axis = new DateAxis("Mes");
        axis.setTickAngle(-9);
        axis.setMax("2016-05-01");
        axis.setMax("2016-06-01");
        axis.setTickFormat("%b %#d, %y");
         
        dateModel.getAxes().put(AxisType.X, axis);
    }
}