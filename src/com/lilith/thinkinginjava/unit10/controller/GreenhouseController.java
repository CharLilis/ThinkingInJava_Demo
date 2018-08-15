package com.lilith.thinkinginjava.unit10.controller;
/**
 * P211
 * @author 56580
 *
 */
public class GreenhouseController {
	public static void main(String[] args) {
		GreenhouseControls gc = new GreenhouseControls();
		gc.add(gc.new Bell(900));
		Event[] eventList = {
				gc.new ThermostatNight(0),
				gc.new LightOn(200),
				gc.new LightOff(400),
				gc.new WaterOn(600),
				gc.new WaterOff(800),
				gc.new ThermostatDay(1400)
		};
		gc.add(gc.new Restart(2000, eventList));
		if(args.length == 1) {
			gc.add(new GreenhouseControls.Terminate(new Integer(args[0])));
		}
		gc.run();
	}
}
