package com.yandev.mapbuilder.utils;

import javafx.scene.control.TextField;

public class NumberTextField extends TextField
{

    private final int MAX_NUMBERS = 4;
    @Override
    public void replaceText(int start, int end, String text){
        if(validate(text)){
            super.replaceText(start, end, text);
        }
    }

    @Override
    public void replaceSelection(String text)
    { if (validate(text))
        {
            super.replaceSelection(text);
        }
    }


    private boolean validate(String text) {
                return (text.matches("[0-9]*") && getText().length() < MAX_NUMBERS);
    }
}