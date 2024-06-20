package com.scm;

public class ItallicTextDecorator extends TextDecorator{
    ItallicTextDecorator(Text text) {
        super(text);
    }

    @Override
    public String getText(){
        return "<i>"+this.text.getText()+"</i>";
    }
}
