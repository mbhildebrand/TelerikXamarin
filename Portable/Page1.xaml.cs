
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Telerik.XamarinForms.Chart;
using Xamarin.Forms;

namespace Portable
{
    public partial class Page1 : ContentPage
    {
        public Page1()
        {
            InitializeComponent();

            var mvm = new MainViewModel();
            //mvm.Title = "My First Chart!";
            this.BindingContext = mvm;

            BackgroundColor = Xamarin.Forms.Device.OnPlatform(Xamarin.Forms.Color.White, Xamarin.Forms.Color.White, Xamarin.Forms.Color.Transparent);
            //Title = "test";
            this.Content = CreateChart();




        }

        private static RadCartesianChart CreateChart()
        {
          

            var chart = new RadCartesianChart
            {    
                 //Annotations = new 
                HorizontalAxis = new Telerik.XamarinForms.Chart.CategoricalAxis(),
                VerticalAxis = new Telerik.XamarinForms.Chart.NumericalAxis(),
            };

            

            var lineAnnotation = new CartesianGridLineAnnotation()
            {  
                Axis = chart.VerticalAxis,
                Value = 80,
                Stroke = Color.Green,
                StrokeThickness = Device.OnPlatform(iOS: 0.5, Android: 2, WinPhone: 2),
                DashArray = Device.OnPlatform(iOS: null, Android: new double[] { 4, 2 }, WinPhone: new double[] { 4, 2 })

            };

            var series = CreateSeries();

            chart.Series.Add(series);
            chart.Annotations.Add(lineAnnotation);

            return chart;
        }

        private static BarSeries CreateSeries()
        {
            var series = new Telerik.XamarinForms.Chart.BarSeries();
            series.SetBinding(BarSeries.ItemsSourceProperty, new Binding("Data"));

            series.ValueBinding = new Telerik.XamarinForms.Chart.PropertyNameDataPointBinding
            {
                PropertyName = "Value"
            };

            series.CategoryBinding = new Telerik.XamarinForms.Chart.PropertyNameDataPointBinding
            {
                PropertyName = "Category"
            };

            return series;
        }



    }

    public class CategoricalData
    {
        public object Category { get; set; }

        public double Value { get; set; }
    }

    public class MainViewModel
    {
        public MainViewModel()
        {
            this.Data = GetCategoricalData();
        }

        public List<CategoricalData> Data { get; set; }

        public string Title { get; set; }

        public static List<CategoricalData> GetCategoricalData()
        {
            List<CategoricalData> data = new List<CategoricalData>
            {
                new CategoricalData { Category = "Michael", Value = 0.63 },
                new CategoricalData { Category = "Rebecca", Value = 0.85 },
                new CategoricalData { Category = "Jonathan", Value = 1.05 },
                new CategoricalData { Category = "Rats", Value = 0.96 },
                new CategoricalData { Category = "Cutie", Value = 0.78 },
                new CategoricalData { Category = "Linda", Value = 1.78 },
            };

            return data;
        }
    }


}
