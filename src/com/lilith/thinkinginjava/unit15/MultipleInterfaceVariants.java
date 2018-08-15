package com.lilith.thinkinginjava.unit15;
/**
 * P401
 * 泛型-问题
 * 实现参数化接口
 * @author 56580
 *
 */
public class MultipleInterfaceVariants {

}
interface Payable<T>{}
class Employee1 implements Payable<Employee1>{}
//class Hourly extends Employee1 implements Payable<Hourly>{}

