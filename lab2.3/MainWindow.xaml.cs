﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace lab2._3
{
    /// <summary>
    /// Логика взаимодействия для MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void testButton_Click(object sender, RoutedEventArgs e)
        {
            // Copy the contents of the TextBox into a string 
            string line = testInput.Text;
            // Format the data in the string 
            line = line.Replace(",", " y:");
            line = "x:" + line;
            // Store the results in the TextBlock 
            formattedText.Text = line;
        }
       

        private void Window_Loaded_1(object sender, RoutedEventArgs e)
        {
            // Buffer to hold a line read from the file on standard input 
            string line;
            // Loop until the end of the file 
            while ((line = Console.ReadLine()) != null)
            {
                // Format the data in the buffer 
                line = line.Replace(",", " y:");
                line = "x:" + line + "\n";
                // Put the results into the TextBlock 
                formattedText.Text += line;
            }
        }
    }
}
