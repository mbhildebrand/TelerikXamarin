package md524c8bcd565b5bc73fc9a0955ffbcd91f;


public class PropertyNameDataBinding
	extends com.telerik.widget.chart.engine.databinding.DataPointBinding
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getValue:(Ljava/lang/Object;)Ljava/lang/Object;:GetGetValue_Ljava_lang_Object_Handler\n" +
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.ChartRenderer.Android.PropertyNameDataBinding, Telerik.XamarinForms.ChartRenderer.Android, Version=2016.2.708.230, Culture=neutral, PublicKeyToken=null", PropertyNameDataBinding.class, __md_methods);
	}


	public PropertyNameDataBinding () throws java.lang.Throwable
	{
		super ();
		if (getClass () == PropertyNameDataBinding.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.ChartRenderer.Android.PropertyNameDataBinding, Telerik.XamarinForms.ChartRenderer.Android, Version=2016.2.708.230, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public java.lang.Object getValue (java.lang.Object p0)
	{
		return n_getValue (p0);
	}

	private native java.lang.Object n_getValue (java.lang.Object p0);

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
