/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikgui;

/**
 *
 * @author DIMAS
 */

import javax.swing.*;
import java.awt.event.*;

public class FormPendaftaranMahasiswa {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(480, 370);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        addComponents(panel);

        frame.setVisible(true);
    }

    private static void addComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel labelNama = new JLabel("Nama Lengkap:");
        labelNama.setBounds(10, 20, 120, 30);
        panel.add(labelNama);

        JTextField formNama = new JTextField(20);
        formNama.setBounds(180, 20, 240, 30);
        panel.add(formNama);

        JLabel labelTglLahir = new JLabel("Tanggal Lahir:");
        labelTglLahir.setBounds(10, 60, 120, 30);
        panel.add(labelTglLahir);

        JTextField formTglLahir = new JTextField(20);
        formTglLahir.setBounds(180, 60, 240, 30); 
        panel.add(formTglLahir);

        JLabel labelNoPendaftaran = new JLabel("Nomor Pendaftaran:");
        labelNoPendaftaran.setBounds(10, 100, 144, 30);
        panel.add(labelNoPendaftaran);

        JTextField formNoPendaftaran = new JTextField(20);
        formNoPendaftaran.setBounds(180, 100, 240, 30); 
        panel.add(formNoPendaftaran);

        JLabel labelTelepon = new JLabel("No. Telp:");
        labelTelepon.setBounds(10, 140, 120, 30); 
        panel.add(labelTelepon);

        JTextField formTelepon = new JTextField(20);
        formTelepon.setBounds(180, 140, 240, 30); 
        panel.add(formTelepon);

        JLabel labelAlamat = new JLabel("Alamat:");
        labelAlamat.setBounds(10, 180, 120, 30); 
        panel.add(labelAlamat);

        JTextField formAlamat = new JTextField(20);
        formAlamat.setBounds(180, 180, 240, 30); 
        panel.add(formAlamat);

        JLabel labelEmail = new JLabel("E-mail:");
        labelEmail.setBounds(10, 220, 120, 30); 
        panel.add(labelEmail);

        JTextField formEmail = new JTextField(20);
        formEmail.setBounds(180, 220, 240, 30); 
        panel.add(formEmail);

        JButton buttonSubmit = new JButton("Submit");
        buttonSubmit.setBounds(180, 260, 96, 30); 
        panel.add(buttonSubmit);

        buttonSubmit.addActionListener((ActionEvent e) -> {
            String nama = formNama.getText();
            String tglLahir = formTglLahir.getText();
            String noPendaftaran = formNoPendaftaran.getText();
            String telepon = formTelepon.getText();
            String alamat = formAlamat.getText();
            String email = formEmail.getText();

            if (nama.isEmpty() || tglLahir.isEmpty() || noPendaftaran.isEmpty() || telepon.isEmpty() || alamat.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Semua kolom harus terisi.");
            } else {
                int response = JOptionPane.showConfirmDialog(null, "Apakah anda yakin data yang Anda isi sudah benar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    JFrame resultFrame = new JFrame("Data Mahasiswa");
                    resultFrame.setSize(360, 240); 
                    JPanel resultPanel = new JPanel();
                    resultFrame.add(resultPanel);
                    resultPanel.setLayout(null);

                    JLabel resultLabel = new JLabel("<html>Nama: " + nama + "<br>Tanggal Lahir: " + tglLahir + "<br>Nomor Pendaftaran: " + noPendaftaran + "<br>No. Telp: " + telepon + "<br>Alamat: " + alamat + "<br>E-mail: " + email + "</html>");
                    resultLabel.setBounds(10, 10, 340, 190); 
                    resultPanel.add(resultLabel);

                    resultFrame.setVisible(true);
                }
            }
        });
    }
}
