package com.javarush.task.task32.task3209.actions;

import javax.swing.*;

import com.javarush.task.task32.task3209.View;

import java.awt.event.ActionEvent;

/**
 * Created by Ариорх on 13.04.2017.
 */
public class RedoAction extends AbstractAction {
    private View view;

    public RedoAction(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.redo();
    }
}
