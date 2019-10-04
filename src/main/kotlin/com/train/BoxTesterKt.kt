package com.train

import java.util.*

class BoxTesterKt {
    fun main(args: Array<String>){
        val box3 = PostOfficeBoxKt(23f, 14f, 13)
        val box5 = PostOfficeBoxKt(39.5f, 27.5f, 23)
        val scanner = Scanner(System.`in`)
        System.out.println("Please enter object's length :")
        val length = scanner.nextFloat()
        System.out.println(length)
        System.out.println("Please enter object's width :")
        val width = scanner.nextFloat()
        System.out.println(width)
        System.out.println("Please enter object's height :")
        val height = scanner.nextInt()
        System.out.println(height)
        val box3Validation = box3.validate(length, width, height)
        val box5Validation = box5.validate(length, width, height)
        if (box3Validation && box5Validation){
            System.out.println("box3 and box5")
        } else if(box3Validation){
            System.out.println("box3")
        } else if(box5Validation){
            System.out.println("box5")
        } else{
            System.out.println("no suitable box")
        }
    }
}