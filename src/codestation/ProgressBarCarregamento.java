/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codestation;

/**
 *
 * @author okarin
 */
public class ProgressBarCarregamento {

    public static void main(String[] args) throws InterruptedException {

        Carregamento c = new Carregamento();

        for (int i = 0; i <= 100; i++) {

            Thread.sleep(40);
            c.setVisible(true);
            c.ProgressBar.setValue(i);

            if (i == 100) {

                Main m = new Main();
                m.setVisible(true);
                c.setVisible(false);

            }

        }

    }

}
