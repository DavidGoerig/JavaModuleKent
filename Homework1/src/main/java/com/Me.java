package com;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */

public class Me {
    //public static String getname() {
    //    return ("com.puzzle.Me");
    //}
    public static void tell() {
        System.out.println(Me.class.getName().replaceAll(".", "/") + "/class");
    }
    
}
