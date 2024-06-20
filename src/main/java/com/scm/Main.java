package com.scm;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Text normalText = new SimpleText("Ravi");
        TextDecorator boldText = new BoldTextDecorator(normalText);
        TextDecorator itallicText = new ItallicTextDecorator(boldText);

        System.out.println(itallicText.getText());
    }
}