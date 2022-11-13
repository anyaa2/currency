/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybeans;

import javax.ejb.Stateless;

/**
 *
 * @author HP
 */
@Stateless

public class CCBean implements CCBeanLocal 
{
public double r2Dollar(double r)
{
return r/65.65;
}
public double d2Rupees(double d)
{
return d*65.65;
}
}
