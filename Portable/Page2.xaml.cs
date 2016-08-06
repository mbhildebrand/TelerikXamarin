
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Telerik.XamarinForms.Chart;
using Xamarin.Forms;

namespace Portable
{
    public partial class Page2 : ContentPage
    {
        public Page2()
        {
            InitializeComponent();

            var chart = new RadPieChart();
            var series = new PieSeries();
            series.SetBinding(PieSeries.ItemsSourceProperty, new Binding("Data"));
            series.ValueBinding = new PropertyNameDataPointBinding("Value");
            series.ShowLabels = true;
            chart.Series.Add(series);
            chart.BindingContext = new ViewModel();

            

            this.Content = chart;


        }
    }

    public class Data
    {
        public double Value { get; set; }
    }

    public class ViewModel
    {
        public ViewModel()
        {
            this.Data = GetData();
        }

        public ObservableCollection<Data> Data { get; set; }

        public static ObservableCollection<Data> GetData()
        {
            var data = new ObservableCollection<Data>
            {
                new Data { Value = 0.63 },
                new Data { Value = 0.85 },
                new Data { Value = 0.75 },
                new Data { Value = 0.96 },
                new Data { Value = 1.78 },
            };

            return data;
        }
    }
}
