package md53c654348f9cb9b1590e5aa90cccadedc;


public class DataFormEditorProvider
	extends md53c654348f9cb9b1590e5aa90cccadedc.DataFormViewProviderBase
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.InputRenderer.Android.DataForm.DataFormEditorProvider, Telerik.XamarinForms.InputRenderer.Android, Version=2016.2.708.230, Culture=neutral, PublicKeyToken=null", DataFormEditorProvider.class, __md_methods);
	}


	public DataFormEditorProvider () throws java.lang.Throwable
	{
		super ();
		if (getClass () == DataFormEditorProvider.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.DataForm.DataFormEditorProvider, Telerik.XamarinForms.InputRenderer.Android, Version=2016.2.708.230, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public DataFormEditorProvider (md56b67504374a0e3ff5529e08e4fa53d9b.DataFormRenderer p0, com.telerik.widget.dataform.visualization.RadDataForm p1) throws java.lang.Throwable
	{
		super ();
		if (getClass () == DataFormEditorProvider.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.DataForm.DataFormEditorProvider, Telerik.XamarinForms.InputRenderer.Android, Version=2016.2.708.230, Culture=neutral, PublicKeyToken=null", "Telerik.XamarinForms.InputRenderer.Android.DataFormRenderer, Telerik.XamarinForms.InputRenderer.Android, Version=2016.2.708.230, Culture=neutral, PublicKeyToken=null:Com.Telerik.Widget.Dataform.Visualization.RadDataForm, Telerik.Xamarin.Android.Input, Version=2016.2.708.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0, p1 });
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
