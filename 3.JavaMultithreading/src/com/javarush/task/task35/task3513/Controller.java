package com.javarush.task.task35.task3513;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by Ариорх on 24.04.2017.
 */
public class Controller extends KeyAdapter {
    private static int WINNING_TILE = 2048;
    Model model;
    View view;

    public Controller(Model model) {
        this.model = model;
        this.view = new View(this);
    }

    public Tile[][] getGameTiles() {
        return model.getGameTiles();
    }

    public View getView() {
        return view;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        KeyEvent keyEvent = e;
        if (keyEvent.getKeyCode() == KeyEvent.VK_ESCAPE) {
            resetGame();
        }
        if (model.canMove() == false) {
            view.isGameLost = true;
        }
        if (!view.isGameLost && !view.isGameWon) {

            switch (keyEvent.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    model.left();
                case KeyEvent.VK_RIGHT:
                    model.right();
                case KeyEvent.VK_UP:
                    model.up();
                case KeyEvent.VK_DOWN:
                    model.down();

            }
        }

        if (model.maxTile == WINNING_TILE) {
            view.isGameWon = true;
        }
        view.repaint();
    }

    public int getScore() {
        return model.score;
    }

    public void resetGame() {
        model.score = 0;
        view.isGameWon = false;
        view.isGameLost = false;
        model.resetGameTiles();
    }
}
