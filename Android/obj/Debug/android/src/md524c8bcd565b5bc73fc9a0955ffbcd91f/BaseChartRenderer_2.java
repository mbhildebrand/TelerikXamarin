package md524c8bcd565b5bc73fc9a0955ffbcd91f;


public abstract class BaseChartRenderer_2
	extends md532c890081de55f67a1d4b8c5942d3614.AndroidRendererBase_2
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.ChartRenderer.Android.BaseChartRenderer`2, Telerik.XamarinForms.ChartRenderer.Android, Version=2016.2.708.230, Culture=neutral, PublicKeyToken=null", BaseChartRenderer_2.class, __md_methods);
	}


	public BaseChartRenderer_2 (android.content.Context p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == BaseChartRenderer_2.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.ChartRenderer.Android.BaseChartRenderer`2, Telerik.XamarinForms.ChartRenderer.Android, Version=2016.2.708.230, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public BaseChartRenderer_2 (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == BaseChartRenderer_2.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.ChartRenderer.Android.BaseChartRenderer`2, Telerik.XamarinForms.ChartRenderer.Android, Version=2016.2.708.230, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public BaseChartRenderer_2 (android.content.Context p0, android.util.AttributeSet p1, int p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == BaseChartRenderer_2.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.ChartRenderer.Android.BaseChartRenderer`2, Telerik.XamarinForms.ChartRenderer.Android, Version=2016.2.708.230, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
