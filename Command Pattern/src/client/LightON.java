/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author sulaiman
 */
public class LightON implements command {
    Light light;
  public LightON(Light light){
    this.light = light;
  }
    @Override
  public void execute(){
    light.switchOn();
  }
}
