package frc;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class Update {

    AnalogPotentiometer potentiometer = new AnalogPotentiometer (0, 180, 30);
    
    public void periodic () {
        SmartDashboard.putNumber("Potentiometer Value", potentiometer.get());
    }
    
}
