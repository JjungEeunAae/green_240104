﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp1
{
    public partial class Form1 : Form
    {
        int gak = 0;
        public Form1()
        {
            InitializeComponent();
            timer1.Interval = 100;
            timer1.Start();
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            Console.WriteLine(Math.PI);

            Console.WriteLine(Math.Cos((90 * Math.PI) / 180));
            Console.WriteLine((Math.Sin(90 * Math.PI) / 180));

            int x = 250 + (int) (Math.Cos((gak * Math.PI) / 180) * 100 );
            int y = 250 + (int) (Math.Sin((gak * Math.PI) / 180) * 100 );

            Console.WriteLine("출력");
            button1.Location = new Point(x, y);
            gak += 10;
        }
    }
}
