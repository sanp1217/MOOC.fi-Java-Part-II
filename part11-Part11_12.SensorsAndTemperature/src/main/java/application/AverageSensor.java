
package application;

import java.util.ArrayList;
import java.util.List;


public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }
    
    @Override
    public boolean isOn() {
        return this.sensors.stream()
                .allMatch(sensor -> sensor.isOn() == true);
    }

    @Override
    public void setOn() {
        this.sensors.stream()
                .forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        this.sensors.stream()
                .forEach(sensor -> sensor.setOff());
    }

    @Override
    public int read() {
      if(!isOn() || this.sensors.isEmpty()){
          throw new IllegalStateException();
      }
      
      int sum = 0;
      int average;
      for(Sensor sensor: this.sensors){
          sum += sensor.read();
      }
      
      average = sum / this.sensors.size();
      this.readings.add(average);
      
      return average;
    }
    
    public List<Integer> readings(){
        return this.readings;
    }
    
}
