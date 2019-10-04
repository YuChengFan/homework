package com.train;

public class PostOfficeBox extends BoxBase implements BoxValidationInterface {
    public PostOfficeBox(float length, float width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean validate(float inputLength, float inputWidth, int inputHeight) {
        return (length >= inputLength && width >= inputWidth && height >= inputHeight);
    }
}
