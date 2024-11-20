package dev.ofiucoder.pjbmi.controller;

import dev.ofiucoder.pjbmi.view.BmiView;

public class BmiController {

    public BmiController() {

        index();
        
    }

    public void index() {

        BmiView.inWeight();
        BmiView.inHeight();

    }

}
